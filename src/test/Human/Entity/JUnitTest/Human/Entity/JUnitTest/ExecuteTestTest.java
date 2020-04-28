package Human.Entity.JUnitTest;

import Human.Entity.AutomatedTest;
import Human.Entity.ManualTest;
import Human.Entity.Result;
import Human.Entity.TestLevel;
import Workers.AutomatedQA;
import Workers.Engineer;
import Workers.TestEngineer;
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
                        {new Engineer(), 10, new ManualTest(TestLevel.API, 9), Result.PASSED}
                        {new AutomatedTest(TestLevel.API, 11), Result.PASSED},
                        {new TestEngineer(), 1, new AutomatedTest(TestLevel.GUI, 10), Result.FAILED},
                        {new TestEngineer(), 1, new ManualTest(TestLevel.GUI, 11), Result.FAILED},
                        {new TestEngineer(), 1, new AutomatedTest(TestLevel.API, 0), Result.PASSED},
                        {new AutomatedQA(), 1, new AutomatedTest(TestLevel.UNIT, 11), Result.PASSED},
                        {new AutomatedQA(), 10, new AutomatedTest(TestLevel.API, 1), Result.PASSED},
                        {new AutomatedQA(), 1, new ManualTest(TestLevel.API, 10), Result.FAILED},
                        {new AutomatedQA(), 10, new ManualTest(TestLevel.GUI, 11), Result.PASSED},
                        {new AutomatedQA(), 1, new ManualTest(TestLevel.GUI, 1), Result.PASSED},
                        {new TestEngineer(), 10, new ManualTest(TestLevel.API, 1), Result.PASSED},
                        {new AutomatedQA(), 10, new AutomatedTest(TestLevel.API, 10), Result.PASSED}});

    }
}