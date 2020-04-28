package Human.Entity.JUnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class JUnit4Runner {
    import org.junit.runner.RunWith;
 import org.junit.runners.Suite;
 import by.it.yurtsevich.Human.Entity.JUnitTest.BaseEngineerTest.java
 import by.it.yurtsevich.Human.Entity.JUnitTest.ExecuteTestTest;
 import by.it.yurtsevich.Human.Entity.JUnitTest.InstabilityTest;

    @RunWith(Suite.class)
    @Suite.SuiteClasses({BaseEngineerTest.class, ExecuteTestTest.class, InstabilityTest.class})
    public class JUnit4Runner {
    }
}
