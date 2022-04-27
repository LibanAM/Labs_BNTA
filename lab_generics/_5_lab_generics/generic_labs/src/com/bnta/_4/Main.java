package com.bnta._4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Grampa> grampas = List.of(
                new Grampa("Christopher"),
                new Grampa("Theodore"),
                new Grampa("Rudolph")
        );

        List<Father> fathers = List.of(
                new Father("Max"),
                new Father("Christopher"),
                new Father("Andrew")
        );

        List<Child> children = List.of(
                new Child("Henry"),
                new Child("Owen"),
                new Child("Noah")
        );

        List<String> names = List.of("Max", "Rudolph");

        WildcardExample wildEx = new WildcardExample();

//        wildEx.printNames_allFamily(grampas);
//        wildEx.printNames_allFamily(fathers);
//        wildEx.printNames_allFamily(children);
//
        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);

    }
}
