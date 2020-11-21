package ru;

import javax.ejb.Local;
import java.io.IOException;

@Local
public interface MessageBeanLocal {

    String[] getMessageList() throws IOException;

    long getSum() throws IOException;
}
