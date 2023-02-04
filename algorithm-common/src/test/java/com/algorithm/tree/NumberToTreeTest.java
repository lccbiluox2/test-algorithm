package com.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToTreeTest {

    @Test
    public void process() {
        int process = NumberToTree.process(5);
        System.out.println(process);
    }

    @Test
    public void numTrees() {
        int process = NumberToTree.numTrees(5);
        System.out.println(process);
    }
}