package HomeTask.HomeTask.Human.Entity;

import HomeTask.HomeTask.Human.Workers.AutomatedQA;
import HomeTask.HomeTask.Human.Workers.Engineer;
import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result>  {
    private int complexity;
    private int instability;

    public int getComplexity() {
        return complexity;
    }

    public int getInstability() {
        return instability;
    }


    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    public void setInstability(int instability) {
        this.instability = instability;
    }
    public Test(TestLevel testLevel) {
        this.complexity = testLevel.COMPLEXITY;
    }

    public Result apply(Engineer engineer) {

        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomatedQA) ||
                (this instanceof AutomatedTest && engineer != null))
            anxiety = engineer.getAnxiety();
        else
            anxiety = 1;
        if (complexity * instability * anxiety > 30)
            return Result.FAILED;
        else
            return Result.PASSED;
    }
}


