package com.company;

public class Main {

    public static void main(String[] args) {
        Tester test = new Tester();

        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19 = " + test.problemOne());
        System.out.println("(179 + 21 + 10) / 7 + 181 = " + test.problemTwo());
        System.out.println("10389 * 56 * 11 * 2246 = " + test.problemThree());

        //Do we actually have to use two classes to do this? I would told we did, but I don't see that in the textbook.
    }
}
