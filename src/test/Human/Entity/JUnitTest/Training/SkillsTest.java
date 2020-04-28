package Training;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkillsTest {
    @Test

    public void Skills(){
        assertTrue("Expression is grater than 31", true);
        assertFalse("Expression is grater than 40", false);
        assertEquals("Expression is grater than 81", false, false);
    }
}