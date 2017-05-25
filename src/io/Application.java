package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by violet on 5/25/17.
 */
public class Application {
    public static void main(String[] args) throws IOException {


        Path contactsPath = Paths.get("src/io", "contacts.txt");
        List<String> contacts = Files.readAllLines(contactsPath);
        for (
                int i = 0; i < contacts.size(); i += 1)
            ;

    }
}