package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for(int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.printf("array[%d]: %d\n", i, value);
            }  catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("array[%d]번째:\n", i);
                System.out.println("- 배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.printf("array[%d]번째:\n", i);
                System.out.println("- 데이터에 문제가 있음: " + e.getMessage());
            }
        }
    }
}
