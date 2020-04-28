package Training;

import org.junit.Test;

public class TestApply {
    int complexity = 8;
    int anxiety = 5;
    int instability = 3;
    int skills = 10;

    @Test
    public void apply() {

        if (complexity * instability * anxiety > 30)
        {
            System.out.print(" PASSED");
        } else {
            System.out.print("FAILED");
        }

        if ((complexity * instability * anxiety)/ skills > 30){
            System.out.print(" PASSED");
        } else {
            System.out.print("FAILED");

        }

    }

    @Test
    public void instability() {
    }

    @Test
    public void getComplexity() {
    }

    @Test
    public void getInstability() {
    }

    @Test
    public void setComplexity() {
    }

    @Test
    public void setInstability() {
    }

    @Test
    public void testApply() {
    }
}