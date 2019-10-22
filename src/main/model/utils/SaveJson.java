package model.utils;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//Adapted From jmlu99/FileIODemo https://github.students.cs.ubc.ca/jmlu99/FileIODemo
public class SaveJson {
    public void save(List items, String filename) throws IOException {
        Gson gson = new Gson();

        String json = gson.toJson(items);

        FileWriter writer = new FileWriter(filename);

        writer.write(json);
        writer.close();
    }
}
