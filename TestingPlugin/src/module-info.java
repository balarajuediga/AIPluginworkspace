/**
 * 
 */
/**
 * 
 */
module TestingPlugin
public interface TestingPlugin {
    void runTests();
}

public class JUnitTestingPlugin implements TestingPlugin {
    @Override
    public void runTests() {
        // Code to run JUnit tests
    }
}

public class TestNGTestingPlugin implements TestingPlugin {
    @Override
    public void runTests() {
        // Code to run TestNG tests
    }
}

public class Main {
    public static void main(String[] args) {
        TestingPlugin junitPlugin = new JUnitTestingPlugin();
        junitPlugin.runTests();

        TestingPlugin testngPlugin = new TestNGTestingPlugin();
        testngPlugin.runTests();
    }
}
  {
}