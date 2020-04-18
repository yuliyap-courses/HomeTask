package HomeTask.HomeTask.Human.Entity;

import HomeTask.HomeTask.Human.Workers.AutomatedQA;
import HomeTask.HomeTask.Human.Workers.Engineer;

import java.util.Scanner;
import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result> {

    private int complexity;
    private int instability;
    private int skills;

    public Test() {
    }


    int Instability() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        if (instability >= 1) {
            return 1;
        } else {
            return 10;
        }
    }

   /*int Skills() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        if (skills >= 1) {
            return 1;
        } else {
            return 10;
        }
    }*/

    /*public int setSkills(int skills) {
        return Skills();
    }*/

    public int getSkills(int skills){
        return this.skills;
    }

    public int getComplexity() {
        return complexity;
    }

    public int getInstability() {
        return instability;
    }


    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public void setInstability(int instability) {
        this.instability = instability;
    }

    public Test(TestLevel testLevel, int skills) {
        this.complexity = testLevel.COMPLEXITY;
        this.skills = skills;
    }

    public Result apply(Engineer engineer) {

        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomatedQA) ||
                (this instanceof AutomatedTest && engineer != null))
            anxiety = engineer.getAnxiety();
        else
            anxiety = 1;


        if (complexity * instability * anxiety > 30){
            return Result.FAILED;}
        else if ((complexity * instability * anxiety) / skills > 30) {
                return Result.FAILED;
            }
        else{
            return Result.PASSED;}
}
}
