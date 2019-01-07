package group_projects.teaPartyExercise;


import java.util.ArrayList;
import java.util.List;

public class ReadLines {

        private FileReader reader = new FileReader();

        public List<Name> asList() {
            List<String> lines = readAllLines();
            List<Name> names = toNames(lines);
            return names;
        }

        private List<String> readAllLines() {
            String filePath = "group_projects/teaPartyExercise/participants.csv";
            return reader.asLines(filePath);
        }

        private List<Name> toNames(List<String> lines) {
            List<Name> names = new ArrayList<>();
            for (String line : lines) {
                names.add(new Name(line));
            }
            return names;
        }
}

