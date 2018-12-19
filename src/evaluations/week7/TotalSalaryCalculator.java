package evaluations.week7;

import java.util.List;

public class TotalSalaryCalculator {

    public Integer calculateTotalSalaries(){
        List<Integer> salaries = Data.getSalaries();
        Integer total = 0;
        for (Integer salary : salaries) {
            total = total + salary;
        }
        return total;
    }

}

