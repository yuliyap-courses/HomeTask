
import Workers.Engineer;
import java.util.function.Function;


public abstract class Test implements Function<Engineer, Human.Entity.Result> {
    private int complexity, instability;

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        if (instability <= 0) {
            this.instability = 1;
        } else this.instability = Math.min(instability, 10);
    }

    public Test(Human.Entity.TestLevel testLevel, int instability) {
        this.complexity = testLevel.COMPLEXITY;
        this.setInstability(instability);
    }

    @Override
    public Human.Entity.Result apply(Engineer engineer) {
        int anxiety;
        anxiety = 1;
        System.out.println(String.format("Internal complexity is: %s", complexity * instability * anxiety / engineer.getSkill()));
        if (complexity * instability * anxiety / engineer.getSkill() > 30) {
            return Human.Entity.Result.FAILED;
        } else {
            return Human.Entity.Result.PASSED;
        }
    }
}