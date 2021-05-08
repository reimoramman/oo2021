package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IoonTest{
    Ioon ioon1 = new IoonInfo("H+", 1, 1);
    Ioon ioon2 = new IoonInfo("NO3-", 62.0049, -1);
    Aine aine = new LisaAine(null, 0);

    @Test
    public void test1(){
        assertEquals("H+", ioon1.getNimetus());
    }

    @Test
    public void test2(){
        assertEquals(1.00794, ioon1.getAatomMassideSumma(), 0.01);
    }

    @Test
    public void test3(){
        assertEquals(1, ioon1.getLaeng());
    }

    @Test
    public void test4(){
        assertEquals("NO3-", ioon2.getNimetus());
    }

    @Test
    public void test5(){
        assertEquals(62.0049, ioon2.getAatomMassideSumma(), 0.01);
    }

    @Test
    public void test6(){
        assertEquals(-1, ioon2.getLaeng());
    }

    @Test
    public void test7(){
        assertEquals("H+NO3-", ioon1.getNimetus());
    }

}
