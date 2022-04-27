package com.bnta._4;

import java.util.List;

public class WildcardExample {
    void printNames_grampasAndFathersOnly(List<? super Father> grampasAndFathers){
        System.out.println(grampasAndFathers);
    }



}
