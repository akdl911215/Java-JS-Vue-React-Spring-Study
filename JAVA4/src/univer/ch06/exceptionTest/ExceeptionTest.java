package univer.ch06.exceptionTest;

// checked Exception 처리 예1
public class ExceeptionTest {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch (EOFExceotion e1) {
            System.out.println(e1.toString());
            System.out.println(e1.printStackTrace());
        } catch (IOException e2) {
            System.out.println(e2.toString());
            System.out.println(e2.printStackTrace());
        }
    }
}
