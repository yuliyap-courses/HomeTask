package Training;

import org.junit.Test;

import java.util.Scanner;

public class TestTest {
    int complexity = 14;

    @Test
    public void setComplexity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        if (complexity <= 30) {
            System.out.print(" PASSED");
        } else
            System.out.print("FAILED");
    }
}
