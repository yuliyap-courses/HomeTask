package Human.Entity;

import Workers.Engineer;
import org.testng.annotations.Test;

public abstract class AutomatedTest implements Test {

    public AutomatedTest(Human.Entity.TestLevel testLevel, int instability) {
        setInstability(instability);
    }

    protected abstract void setInstability(int instability);

    public Human.Entity.Result apply(Engineer testEngineer) {
    }
}

