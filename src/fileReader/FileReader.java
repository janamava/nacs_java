package fileReader;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> asLines(String filePath){
        try {
            URI uri= ClassLoader.getSystemResource(filePath).toURI();
            Path path = Paths.get(uri);
            return Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

/*
Create the FileReader class that has the asLines method that receives the filePath of a file,
reads it and returns a list of String representing all the lines of that file.
 */