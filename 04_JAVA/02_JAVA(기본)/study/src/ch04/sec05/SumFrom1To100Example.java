package ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.printf("1~%d 합: %d", (i-1), sum);
    }
}
