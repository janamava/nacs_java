//package evaluations.week7;
//
//import javaWeek_4.exercise9.FileReader;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Data {
//
//    private static FileReader reader = new FileReader();
//    private static List<String> model = reader.asLines("files/employees.csv");
//
//    public static List<Integer> getSalaries(){
//        List<Integer> salaries = new ArrayList<>();
//        for (int position = 2; position < model.size(); position+=4) {
//            String salaryAsString = model.get(position);
//            Integer salary = Integer.parseInt(salaryAsString);
//            salaries.add(salary);
//        }
//        return salaries;
//    }
//
//    public static String getDepartment(){
//
//        return null;
//    }
//
//    public static String getHighestPaidEmployee(){
//        Map<String, Integer> whoEarnsWhat = new HashMap<>();
//        for (int position = 0; position < model.size(); position+=4) {
//            String name = model.get(position);
//            whoEarnsWhat.put(name, (position));
//        }
//            return whoEarnsWhat;
//    }
//}
