package ru;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(
        mappedName = "test_message",
        name = "jms/TextMessageMDB"
)
public class MDBTextMessage implements MessageListener {

    public void onMessage(Message message) {
        try {
            System.out.println(message.getStringProperty("text"));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
