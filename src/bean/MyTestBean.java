package bean;

/**
 * Created by chenxinyue on 2014/10/30.
 */
public class MyTestBean {
    private String str = "test";

    public MyTestBean() {
        System.out.println("MyTestBean construct");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
