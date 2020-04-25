package Human.Entity.JUnitTest;

import Human.Entity.AutomatedTest;
import Human.Entity.Result;
import Human.Entity.TestLevel;
import Human.Workers.Engineer;
import org.junit.Assert;
import org.junit.Test;
//this test need to  be fixed

public class AutomatedTestTest{
    @Test
    public void AutomatedTest() {
        AutomatedTest AutomatedTest = new AutomatedTest(TestLevel.UNIT, 3);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("AutomatedTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                Result.PASSED, AutomatedTest.apply(testEngineer));
    }
}

