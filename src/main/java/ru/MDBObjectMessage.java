package ru;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(
        mappedName = "number_message",
        name = "jms/ObjectMessageMDB"
)
public class MDBObjectMessage implements MessageListener {

    public void onMessage(Message message) {
        try {
            System.out.println(message.getStringProperty("number"));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
