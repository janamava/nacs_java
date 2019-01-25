package javaWeek_10.exercise3.logic;

import fileReader.FileReader;
import javaWeek_10.exercise3.model.Sms;

import java.util.List;
import java.util.stream.Collectors;

public class SmsGenerator {

    private FileReader reader = new FileReader();

    public List<Sms> generateSms() {
        return reader.asStream("javaWeek_10/exercise3/data/sms.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(e -> new Sms(e[0], e[1]))
                .collect(Collectors.toList());
    }

}
