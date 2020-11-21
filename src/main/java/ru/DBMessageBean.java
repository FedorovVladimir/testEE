package ru;

import java.io.IOException;

public class DBMessageBean implements MessageBeanLocal {

    public String[] getMessageList() throws IOException {
        return new String[0];
    }

    public long getSum() throws IOException {
        return 0;
    }
}
