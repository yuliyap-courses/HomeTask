package Workers;

import Human.Entity.Result;
import org.testng.annotations.Test;
import java.util.concurrent.ThreadLocalRandom;

public class Engineer {
    private int anxiety = 3;
    private int skill;
    private Test test;

    public int getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setRandomSkill() {
        this.skill = ThreadLocalRandom.current().nextInt(1, 11);
    }

    public Result executeTest(Test test) {
        this.test = test;
        return test.apply(this);
    }
}



