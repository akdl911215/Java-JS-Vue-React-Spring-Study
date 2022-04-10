package univer.ch06.exceptionTest;

// unchecked Exception 처리

public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
        } catch (ArithmeticExcepton e) {
            System.out.println(e);
        }
        System.out.println(i);

        int[] a = new int[5];
        try {
            a[6] = 10;
        } catch (ArrayIndexOutOfBoundException e) {
            System.out.println(e);
        }
    }
}
