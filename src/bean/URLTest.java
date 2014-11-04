package bean;

import org.junit.Test;

import java.io.InputStream;

/**
 * Created by chenxinyue on 2014/10/30.
 */
public class URLTest {

    @Test
    public void testURL() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("bean/beanFactoryTest.xml");
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
