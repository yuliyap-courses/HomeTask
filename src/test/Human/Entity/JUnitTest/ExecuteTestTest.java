package Human.Entity.JUnitTest;

import Human.Entity.ManualTest;
import Human.Entity.Result;
import Human.Entity.TestLevel;
import Human.Workers.Engineer;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class ExecuteTestTest {
    private Engineer en;
    private Human.Entity.JUnitTest.AutomatedTestTest test;
    private int skills;
    private Result expected;

    public ExecuteTestTest(Engineer en, int skills, Human.Entity.JUnitTest.AutomatedTestTest test, Result expected) {
        this.en = en;
        this.test = test;
        this.skills = skills;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]
                {
                        {new Engineer(), 1, new ManualTest(TestLevel.UNIT, 5), Result.PASSED},
                        {new Engineer(), 10, new ManualTest(TestLevel.UNIT, 5), Result.PASSED},
                        {new Engineer(), 10, new ManualTest(TestLevel.API, 9), Result.PASSED}});

    }
}