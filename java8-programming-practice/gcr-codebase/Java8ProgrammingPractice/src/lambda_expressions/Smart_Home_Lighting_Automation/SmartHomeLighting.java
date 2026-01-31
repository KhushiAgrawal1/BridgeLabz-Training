package lambda_expressions.Smart_Home_Lighting_Automation;

public class SmartHomeLighting {
    public static void main(String[] args) {

        // Motion detected
        LightAction motionTrigger = () ->
                System.out.println("Lights ON at full brightness");

        // Time-based trigger
        LightAction nightTrigger = () ->
                System.out.println("Lights ON in dim mode");

        // Voice command trigger
        LightAction voiceTrigger = () ->
                System.out.println("Lights turned OFF");

        // Execute actions
        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}

