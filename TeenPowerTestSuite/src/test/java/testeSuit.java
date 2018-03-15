

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class testeSuit {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(testCaseLogin0.class);
        suite.addTestSuite(testCaseLogin1.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
