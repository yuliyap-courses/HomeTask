package HomeTask.HomeTask.Human.Entity.JUnitTest;

import org.junit.Test;

public class TestApply {
    int complexity = 8;
    int anxiety = 1;
    int instability = 3;

    @Test
    public void apply() {

        if (complexity * instability * anxiety > 30)
        {
            System.out.print(" PASSED");
        } else {
            System.out.print("FAILED");
        }
    }
}