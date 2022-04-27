package com.bnta;

import com.bnta._1.Box;
import com.bnta._2.Pair;

public class Main {

    public static void main(String[] args) {
        // Exercise 1:
        Box boxWithoutRestrictions = new Box();
        //Can set boxWithoutRestrictions to anything.
        boxWithoutRestrictions.set(1);
        boxWithoutRestrictions.set(false);
        boxWithoutRestrictions.set("Hello");

        Box<Integer> boxForIntegersOnly = new Box();
        // Can only set boxForIntegersOnly as an integer
        boxForIntegersOnly.set(25);
//        boxForIntegersOnly.set("Hello");



        // Exercise 2:
        Pair<String, Integer> pair1 = new Pair<>("", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "");
        Pair<String, String> pair3 = new Pair<>("", "");

        System.out.println("First Pair: " + pair1.getK() + pair1.getV());
        pair1.setV(25);
        pair1.setK("Hello");
        System.out.println("Updated first pair: " + pair1.getK() + pair1.getV());

        // Exercise 3:


    }
}
