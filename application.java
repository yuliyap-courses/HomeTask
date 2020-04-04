package HomeTask.HomeTask;

public class application {
    public static void main(String[] args) {
        ManualQA manual = new ManualQA(47, "John", "Dow");
        AutomatedQA automated = new AutomatedQA(23, "Daniel", "Smitt");

        manual.inviteTest();
        manual.executeCode();
        automated.executeCode();
        automated.setVoice();


    }

}
