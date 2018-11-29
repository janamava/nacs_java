package javaWeek_4.exercise9;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("files/lorem-ipsum.txt");
        display(lines);

        }

        public static void display(List<String> lines) {
            for (String line : lines) {
                System.out.println(line);
        }
    }
}

/*
Follow the instructions below:
You need the following classes: FileReader and LoremIpsumApplication.
You need the following file: lorem-ipsum.txt
Create the FileReader class that has the asLines method that receives the filePath of a file,
reads it and returns a list of String representing all the lines of that file.
In the LoremIpsumApplication class main method, create a FileReader,
read all the lines of the lorem-ipsum.txt file and display them.
Create tests for the FileReader class.

Output:
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.


 */