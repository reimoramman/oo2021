package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IoonTest{
    Ioon ioon1 = new IoonInfo("H+", 1, 1);
    Ioon ioon2 = new IoonInfo("NO3-", 62.0049, -1);
    Aine aine = new LisaAine(null, 0);

    @Test
    public void test1(){
        assertEquals("H+", ioon1.getNimetus());
    }

}