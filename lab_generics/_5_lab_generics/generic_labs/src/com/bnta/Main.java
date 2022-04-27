package com.bnta;

import com.bnta._1.Box;
import com.bnta._2.Pair;

public class Main {

    public static void main(String[] args) {
        // Exercise 1:
//	Box boxWithoutRestrictions = new Box();
//    Box<Integer> boxForIntegersOnly = new Box();


        // Exercise 2:
    Pair<String, Integer> pair1 = new Pair<>("", 10);
    Pair<Integer, String> pair2 = new Pair<>(20, "");
    Pair<String, String> pair3 = new Pair<>("","");

    pair1.setK("Hello");
    pair1.getK();
    pair1.setV(25);
    pair1.getV();

        // Exercise 3:


    }
}
