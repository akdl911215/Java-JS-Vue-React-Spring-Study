package univer.ch7.booleanEquals;

class Man1 {}
class Man2 {
    public int nData;
    public Man2(int nNew) {
        nData = nNew;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Man2) {
            Man2 m = (Man2) obj;
            if (this.nData == m.nData) return true;
        }
        return false;
    }
}

public class booleanEqualsTest {
    public static void main(String[] args) {
        Man1 m1 = new Man1();
        Man1 m2 = new Man1();
        System.out.println("m1 == m2 : ");
    }
}
