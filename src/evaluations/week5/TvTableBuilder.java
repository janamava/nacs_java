package evaluations.week5;

import javaWeek_5.exercise6.AddLeg;
import javaWeek_5.exercise6.AddShelf;
import javaWeek_5.exercise6.AddTop;
import javaWeek_5.exercise6.Step;
import java.util.ArrayList;
import java.util.List;


public class TvTableBuilder {

    private List<Step> steps = new ArrayList<>();

    public TvTable build() {
        TvTable tvTable = new TvTable();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }

    private List<Step> getSteps() {
        addStep(new AddLeg(), 4);
        addStep(new AddShelf(), 1);
        addStep(new AddTop(), 1);
        return steps;
    }

    private void addStep(Step step, Integer times) {
        for (int time = 0; time < times; time++) {
            steps.add(step);

        }
    }
}
