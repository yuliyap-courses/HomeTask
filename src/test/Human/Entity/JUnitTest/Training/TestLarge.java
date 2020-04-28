package Training;

import Human.Entity.AutomatedTest;
import Human.Entity.ManualTest;
import Human.Entity.Result;
import Human.Entity.TestLevel;
import Human.Workers.AutomatedQA;
import Human.Workers.Engineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class TestLarge {

    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 2, 8);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                Result.PASSED, manualTest.apply(testEngineer));
    }

    @Test
    public void AutomatedTest() {
        AutomatedTest AutomatedTest = new AutomatedTest(TestLevel.UNIT, 3);
        Engineer testEngineer = new Engineer();
        Assert.assertEquals("AutomatedTest, AutomationEngineer, UNIT(1), instability 4, anxiety 3: ",
                Result.PASSED, AutomatedTest.apply(testEngineer));
    }

    @RunWith(Parameterized.class)
    public static class AdditionalUnitTest {

        private Engineer en;

        public AdditionalUnitTest(Engineer en) {
            this.en = en;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> primeNumber() {
            return Arrays.asList(new Object[][]{
                    {new Engineer()},
                    {new AutomatedQA()}
            });
        }
        @Test
        public void verifyDefaultAnxietyByManualTest() {
            Assert.assertEquals("Default Anxiety is not correct", 3, Engineer.getAnxiety());
        }

        @Test
        public void verifySetAnxietyByManualTest() {
            Assert.assertEquals("Set Anxiety is not correct", 10, Engineer.getAnxiety());

        }
    }

}