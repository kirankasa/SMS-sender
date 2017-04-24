package in.kiranreddy.smssender;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Created by kiranreddy on 24/04/17.
 */
public class SmsService {

    public static final String ACCOUNT_SID = "AC82b62baef863f4c0ce520350161f2f08";
    public static final String AUTH_TOKEN = "4c0b0112f40ee3b5ad64ddf11ca888c9";
    public static final String FROM_PHONE_NUMBER = "+12016769940";

    public static void sendMessage(String smsMessage, String toPhoneNumber) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(toPhoneNumber),
                new PhoneNumber(FROM_PHONE_NUMBER),
                smsMessage).create();

    }
}
