package ui;

import com.google.gson.internal.LinkedTreeMap;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import model.controller.*;
import exceptions.WeaponNotFoundException;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import model.list.Note;
import model.list.SpecialNote;
import model.runes.Runes;
import model.save.Save;
import model.utils.ReadJson;
import model.utils.SaveJson;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class JavaFxview extends Observable implements Initializable  {

    @FXML
    private ImageView kineticbtn;
    @FXML
    private ImageView energybtn;
    @FXML
    private ImageView heavybtn;
    @FXML
    private ImageView r1;
    @FXML
    private ImageView r2;
    @FXML
    private ImageView r3;
    @FXML
    private ImageView itemImage;
    @FXML
    private ImageView weatherIcon;
    @FXML
    private AnchorPane kinetic;
    @FXML
    private AnchorPane energy;
    @FXML
    private AnchorPane heavy;
    @FXML
    private ListView<Label> saveList;
    @FXML
    private ListView<String> notes;
    @FXML
    private ListView<String> specialNotes;
    @FXML
    private Label weatherTemp;
    @FXML
    private Label hour;
    @FXML
    private Label minute;
    @FXML
    private Label itemsCrafted;
    @FXML
    private TextField noteGet;
    @FXML
    private TextField specialNoteGet;

    private WeaponHeavyController hc = new WeaponHeavyController();
    private WeaponKineticController kc = new WeaponKineticController();
    private WeaponEnergyController ec = new WeaponEnergyController();

    public Runes item;
    private Save saveItems = new Save();
    private SaveController saveController = new SaveController(saveItems);
    private ArrayList<Note> listNote = new ArrayList<>();
    private ArrayList<SpecialNote> listSpecialNotes = new ArrayList<>();
    public Integer numItemCrafted = 0;

    @FXML
    private void handleButtonAction(MouseEvent event) {
        if (event.getTarget() == kineticbtn) {
            kinetic.setVisible(true);
            energy.setVisible(false);
            heavy.setVisible(false);
        } else if (event.getTarget() == energybtn) {
            energy.setVisible(true);
            kinetic.setVisible(false);
            heavy.setVisible(false);
        } else if (event.getTarget() == heavybtn) {
            heavy.setVisible(true);
            energy.setVisible(false);
            kinetic.setVisible(false);
        }
    }

    @FXML
    private void handleCloseAction(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void handleCraftMachinegun(MouseEvent event) {
        String key = getId(event);
        item = hc.getMachineGun(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftRocket(MouseEvent event) {
        String key = getId(event);
        item = hc.getRockets(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftEShotgun(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getShotGun(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftEHandCannon(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getHandCannon(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftESniper(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getSniper(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftESideArm(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getSideArm(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftEFusion(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getFusionRifle(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftESmg(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getSmg(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftEShotGun(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = ec.getShotGun(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftHandCannon(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = kc.getHandCannon(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftSniper(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = kc.getSniper(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftSideArm(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = kc.getSideArm(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftSmg(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = kc.getSmg(key);
        setChalice(item);
    }

    @FXML
    private void handleCraftShotGun(MouseEvent event) throws WeaponNotFoundException {
        String key = getId(event);
        item = kc.getShotGun(key);
        setChalice(item);
    }

    private void setChalice(Runes item) {
        setChanged();
        notifyObservers(this);
        r1.setImage(new Image(item.r1.getImage()));
        r2.setImage(new Image(item.r2.getImage()));
        r3.setImage(new Image(item.r3.getImage()));
        itemImage.setImage(new Image(item.image));
        itemsCrafted.setText(numItemCrafted.toString());
    }

    private String getId(MouseEvent event) {
        return event.getPickResult().getIntersectedNode().getId();
    }

    @FXML
    private void handleClear() {
        r1.setImage(null);
        r2.setImage(null);
        r3.setImage(null);
        itemImage.setImage(null);
    }

    @FXML
    private void handleSave() throws IOException {
        if (item != null) {
            saveController.saveItem(item);
            SaveJson save = new SaveJson();
            save.save(saveItems, "data/items.json");
            loadSaveListItem(item);
        }
    }

    @FXML
    private void loadSaveList(Runes[] list) {
        for (Runes item : list) {
            loadSaveListItem(item);
        }
    }

    private void loadSaveListItem(Runes item) {
        Label label = new Label(item.itemName);
        ImageView graphic = new ImageView(new Image(item.image));
        graphic.setFitHeight(20);
        graphic.setFitWidth(20);
        label.setGraphic(graphic);
        saveList.getItems().add(label);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            addObserver(new Chalice());
            Runes[] list = ReadJson.read("data/items.json");
            saveController.loadRunes(list);
            loadSaveList(list);
            loadWeather();
            updateTime();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateTime() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            Calendar cal = Calendar.getInstance();
            this.hour.setText(String.format("%02d", cal.get(Calendar.HOUR_OF_DAY)));
            this.minute.setText(String.format("%02d", cal.get(Calendar.MINUTE)));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    @FXML
    public void addNote() {
        String type = noteGet.getCharacters().toString();
        noteGet.clear();
        Note note = new Note(type);
        listNote.add(note);
        notes.getItems().add(type);
    }

    @FXML
    public void addSpecialNote() {
        String type = specialNoteGet.getCharacters().toString();
        specialNoteGet.clear();
        Note note = new Note(type);
        SpecialNote sitem = new SpecialNote("");
        listNote.add(note);
        listSpecialNotes.add(sitem);
        sitem.addItem(note);
        specialNotes.getItems().add(type);
        notes.getItems().add(type);
    }

    private void loadWeather() {
        try {
            LinkedTreeMap data = ApiController.getWeather();
            ArrayList<LinkedTreeMap> weather = (ArrayList<LinkedTreeMap>) data.get("weather");
            LinkedTreeMap weatherData = weather.get(0);
            LinkedTreeMap main = (LinkedTreeMap)  data.get("main");
            double temp = (Double) main.get("temp") - 273.15;
            int tempInt = (int) temp;
            weatherTemp.setText(Integer.toString(tempInt));
            String url = "http://openweathermap.org/img/wn/" + weatherData.get("icon") + "@2x.png";
            weatherIcon.setImage(new Image(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleDelete(KeyEvent event) throws IOException {
        int index = saveList.getSelectionModel().getSelectedIndex();
        if (event.getCode().equals(KeyCode.DELETE) || event.getCode().equals(KeyCode.BACK_SPACE)) {
            saveController.remove(index);
            SaveJson save = new SaveJson();
            save.save(saveItems, "data/items.json");
            saveList.getItems().clear();
            Runes[] list = ReadJson.read("data/items.json");
            loadSaveList(list);
        }
    }
}

