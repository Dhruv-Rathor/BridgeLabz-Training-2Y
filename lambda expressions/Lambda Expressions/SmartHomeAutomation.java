public class SmartHomeAutomation {
    public static void main(String[] args) {
        Runnable motionTrigger = () -> System.out.println("Light ON: Motion detected.");
        Runnable timeTrigger = () -> System.out.println("Light ON: It is 7 PM.");
        
        System.out.println("Testing triggers:");
        motionTrigger.run();
        timeTrigger.run();
    }
}
