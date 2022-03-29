package univer.ch05.BoundedType;

class typeData<T extends Number> {
    private T t;
    public typeData(T t) {
        this.t = t;
    }
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}

public class BoundedType {
    public static void main(String[] args) {
        typeData<Integer> data = new<Integer> typeData(20);
        System.out.println(data.get());
    }
}
