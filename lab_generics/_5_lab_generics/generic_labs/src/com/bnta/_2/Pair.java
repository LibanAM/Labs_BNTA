package com.bnta._2;

public class Pair<K, V> {
    private K k;
    private V v;

    public Pair(K k, V v) {

    }

    public K getK() {
        System.out.println(k);
        return k;

    }

    public V getV() {
        System.out.println(v);
        return v;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }
}
