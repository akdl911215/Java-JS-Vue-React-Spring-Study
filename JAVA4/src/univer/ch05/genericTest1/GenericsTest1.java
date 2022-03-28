package univer.ch05.genericTest1;

class Data {
    private Object object;
    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}

public class GenericsTest1 {
    public static void main(String[] args) {
        Data data = new Data();
        Object i = new Integer(20);
//        data.set(i);

        System.out.println(((String) i));
    }
}
