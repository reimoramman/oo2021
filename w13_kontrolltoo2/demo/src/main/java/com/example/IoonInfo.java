package com.example;

public class IoonInfo implements Ioon {

  public String nimetus();
  public double aatomMassideSumma();
  public float laneg();
  
  public IoonInfo(String nimetus, double aatomMassideSumma, float laeng){
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