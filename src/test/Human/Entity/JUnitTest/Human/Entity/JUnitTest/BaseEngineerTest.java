package Human.Entity.JUnitTest;

import Workers.AutomatedQA;
import Workers.Engineer;
import Workers.TestEngineer;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

public class BaseEngineerTest {
    @RunWith(Parameterized.class)
    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public static class BaseEngineerTest {
        private final Engineer engineer;

        public BaseEngineerTest(Engineer engineer) {
            this.engineer = engineer;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> primeNumbers() {
            return Arrays.asList(new Object[][]{
                    {new TestEngineer()},
                    {new AutomatedQA()}
            });
        }

        @Test
        public void verifyDefaultAnxiety() {
            Assert.assertEquals("Default engineer anxiety is not correct!", 3, engineer.getAnxiety());
        }

        @Test
        public void verifySetAnxiety() {
            engineer.setAnxiety(2);
            Assert.assertEquals("Engineer anxiety was set not correct!", 2, engineer.getAnxiety());
        }

        @Test
        public void verifyRandomSkill() {
            Assert.assertTrue("Random engineer skill is not correct!",
                    1 <= engineer.getSkill() && engineer.getSkill() <= 10);
        }

        @Test
        public void verifySetSkill() {
            engineer.setSkill(2);
            Assert.assertEquals("Engineer skill was set not correct!", 2, engineer.getSkill());
        }
    }
}
