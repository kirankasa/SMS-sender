package in.kiranreddy.smssender;

/**
 * Created by kiranreddy on 24/04/17.
 */
public class Main {

    public static void main(String[] args) {
        SmsService.sendMessage("Sending SMS with Twilio service","+919940562760");
    }
}
