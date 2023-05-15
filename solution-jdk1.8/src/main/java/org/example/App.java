package org.example;

public class App {

    public static void main(String[] args) {
        String s = "中华人aaa名共和国";
        System.out.println(s.offsetByCodePoints(3, 3));
        System.out.println(s.substring(0, 3));
    }

}
