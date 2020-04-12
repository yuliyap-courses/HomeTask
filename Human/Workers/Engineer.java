package HomeTask.HomeTask.Human.Workers;
import HomeTask.HomeTask.Human.Entity.*;
public abstract class Engineer{

    int anxiety = 3;
    int skills;

public int getAnxiety(){

    return anxiety;
}

public int getSkills(){
    return skills;
    }
        public void setSkills(){
        this.skills = (int) (1 + Math.random() * 10);
    }

    public Result executeTest(Test test) {
        return null;
    }
}



