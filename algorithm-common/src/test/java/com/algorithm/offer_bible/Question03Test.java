package com.algorithm.offer_bible;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question03Test {

    private Question03 question03 = new Question03();

    @Test
    public void replaceSpaces() {
        String s = question03.replaceSpaces("               ", 5);
        System.out.println(s);
    }

    @Test
    public void replaceSpaces13() {
        String s = question03.replaceSpaces("Mr John Smith    ", 13);
        System.out.println(s);
    }

    @Test
    public void replaceSpacesv2() {
        String s = question03.replaceSpacesv2("               ", 5);
        System.out.println(s);
        s = question03.replaceSpacesv2("Mr John Smith    ", 13);
        System.out.println(s);
    }

    @Test
    public void replaceSpacesv21() {
        String s = question03.replaceSpacesv2("ds sdfs afs sdfa dfssf asdf             ", 27);
        System.out.println(s);

    }

}