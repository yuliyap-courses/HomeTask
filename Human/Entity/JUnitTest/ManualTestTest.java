package HomeTask.HomeTask.Human.Entity.JUnitTest;

import HomeTask.HomeTask.Human.Entity.ManualTest;
import HomeTask.HomeTask.Human.Entity.Result;
import HomeTask.HomeTask.Human.Entity.TestLevel;
import HomeTask.HomeTask.Human.Workers.Engineer;
import org.junit.Assert;
import org.junit.Test;



public class ManualTestTest {
    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 2);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                             Result.PASSED, manualTest.apply(testEngineer));
    }
}

