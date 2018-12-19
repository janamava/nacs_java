package evaluations.week7;

import java.util.List;

public class Bank {

    public void transferOneSalary(List<Integer> salaries, List<Long> accounts){
        Integer salary = salaries.get(0);
        Long account = accounts.get(0);
        System.out.println("Transfer successful: " + salary + " to account " + account);

    }
}
