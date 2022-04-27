package com.bnta._3;

public class StringAndInteger implements GenericInterface <String, Integer> {

    @Override
    public Integer doSomeOperations(String s) {
        return Integer.parseInt(s);
    }

    @Override
    public String doReverseOperations(Integer integer) {
        return integer.toString();
    }
}

class IntegerAndString implements GenericInterface<Integer, String> {

    @Override
    public String doSomeOperations(Integer integer) {
        return integer.toString();
    }

    @Override
    public Integer doReverseOperations(String s) {
        return Integer.parseInt(s);
    }
}
