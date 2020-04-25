package Human.Entity.JUnitTest;

import Human.Entity.ManualTest;
import Human.Entity.Result;
import Human.Entity.TestLevel;
import Human.Workers.Engineer;
import org.junit.Assert;
import org.junit.Test;


//this test need to  be fixed

public class ManualTestTest {

    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 2,8);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                             Result.PASSED, manualTest.apply(testEngineer));
    }
    }

