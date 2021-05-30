package chapter3;

public class Try {
    public static void main(String[] args) {
        int n = 1000;
        int fourthBitFromRight = (n & (1<< 3)) >> 3;
        System.out.println(fourthBitFromRight);
    }
}
