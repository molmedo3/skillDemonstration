import static org.junit.Assert.*;
import org.junit.*;
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar skill-demo-test.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore skill-demo-test

public class skillDemonstrationTester {
    @Test
    public void maxIntTest(){
        int[] arr = {1,4,6,0};
        int maxInt= skillDemonstration.maxInt(arr);
        assertEquals(0, maxInt);

    }
}
