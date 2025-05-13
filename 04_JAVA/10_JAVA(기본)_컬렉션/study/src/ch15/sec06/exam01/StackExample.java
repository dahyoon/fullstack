package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성
        Stack<Coin> stack = new Stack<Coin>();

        // 동전 넣기
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        // 동전 하나씩 꺼내기
        while (!stack.isEmpty()){
            Coin coin = stack.pop();
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }
    }
}
