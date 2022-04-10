package univer.ch06.exceptionTest;

// finally 블록

public class ExceptionTest5 {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.printStackTrace());
        } finally {
            System.out.println("finally 블록");
        }
    }
}
