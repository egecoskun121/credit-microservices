package com.burakkolay.credit.services;

import com.burakkolay.credit.model.entity.Applicant;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    @Value("${twilio.account.sid}")
    public static  String ACCOUNT_SID;

    @Value("${twilio.auth.token}")
    public static  String AUTH_TOKEN;

    public void sendSMS(Applicant applicant){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+905369378309"),new PhoneNumber("+17695532440"),
                "Dear" + applicant.getFirstName() + " " + applicant.getLastName() + ", your credit rating is" +
                        applicant.getCreditRating()).create();

    }
}
