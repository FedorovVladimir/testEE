package ru;

import javax.ejb.Stateful;

@Stateful
public class EJBDemoStateful implements EJBDemo {

    private static final String REGISTERED_STATUS = "R";
    private static final String UNREGISTERED_STATUS = "U";

    private String status = UNREGISTERED_STATUS;
    private int numberOfMessagesReceived = 0;

    public boolean login(String login, String psw) {
        String defaultLogin = "admin";
        String defaultPws = "admin";
        if (login.equals(defaultLogin) && psw.equals(defaultPws)) {
            this.status = REGISTERED_STATUS;
            this.numberOfMessagesReceived = 0;
            return true;
        } else {
            this.status = UNREGISTERED_STATUS;
            return false;
        }
    }

    public String getMessage(String login) {
        String defaultMessage = "hello";
        if (this.status.equals(REGISTERED_STATUS)) {
            this.numberOfMessagesReceived++;
            if (this.numberOfMessagesReceived == 3) {
                this.status = UNREGISTERED_STATUS;
            }
            return defaultMessage;
        }
        return "not authorized";
    }
}
