package com.algorithm.leetcode.swordoffer.entity;

import java.util.Objects;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-11 19:48
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Tuple2<K,V> {
    private K k;
    private V v;

    public Tuple2(K k, V v) {
        this.k = k;
        this.v = v;
    }


    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public static <K,V> Tuple2<K,V> of(K k,V v){
        return new Tuple2<>(k,v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;
        return Objects.equals(k, tuple2.k) &&
                Objects.equals(v, tuple2.v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, v);
    }
}
