package bean;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chenxinyue on 2014/10/30.
 */
public class InputStreamTest {
    @Test
    public void testInputStream() throws IOException {
        InputStream inputstream = null;
        try {
            inputstream = new FileInputStream("./src/bean/beanFactoryTest.xml");

        int data = inputstream.read();
        while(data != -1) {
            //do something with data...
            System.out.print((char)data);

            data = inputstream.read();
        }
        inputstream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
