package com.example;

public class IoonInfo implements Ioon {

  private String nimetus;
  private double aatomMassideSumma;
  private int laeng;
  
  public IoonInfo(String nimetus, double aatomMassideSumma, int laeng){
    this.nimetus = nimetus;
    this.aatomMassideSumma = aatomMassideSumma;
    this.laeng = laeng;
  }

  @Override
  public String getNimetus(){
    return nimetus;
  }

  @Override
  public double getAatomMassideSumma(){
    return aatomMassideSumma;
  }

  @Override
  public float getLaeng(){
    return laeng;
  }
}