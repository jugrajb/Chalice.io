package model.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import model.runes.Runes;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Adapted From jmlu99/FileIODemo https://github.students.cs.ubc.ca/jmlu99/FileIODemo
public class ReadJson {
    public static Runes[] read(String filename) throws FileNotFoundException {
        Gson gson = new Gson();

        JsonReader reader = new JsonReader(new FileReader(filename));

        return gson.fromJson(reader, Runes[].class);
    }
}