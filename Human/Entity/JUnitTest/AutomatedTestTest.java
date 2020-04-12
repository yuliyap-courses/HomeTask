package HomeTask.HomeTask.Human.Entity.JUnitTest;

import HomeTask.HomeTask.Human.Entity.AutomatedTest;
import HomeTask.HomeTask.Human.Entity.Result;
import HomeTask.HomeTask.Human.Entity.TestLevel;
import HomeTask.HomeTask.Human.Workers.Engineer;
import org.junit.Assert;
import org.junit.Test;


public class AutomatedTestTest {

    @Test
    public void AutomatedTest() {
        AutomatedTest AutomatedTest = new AutomatedTest(TestLevel.UNIT, 6);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("AutomatedTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                Result.PASSED, AutomatedTest.apply(testEngineer));
    }
}

