package com.example;

public class LisaAine implements Aine {
  public String nimetus;
  public double aatomMassideSumma;

  public LisaAine(String nimetus, double aatomMassideSumma){
    this.nimetus = nimetus;
    this.aatomMassideSumma = aatomMassideSumma;
  }

  @Override
  public String getNimetus(Ioon ioon1, Ioon ioon2) {
    // TODO Auto-generated method stub
    //return null;
    
  }

  @Override
  public double getAatomMassideSumma(Ioon ioon1, Ioon ioon2) {
    // TODO Auto-generated method stub
    return 0;
  }

  
}
