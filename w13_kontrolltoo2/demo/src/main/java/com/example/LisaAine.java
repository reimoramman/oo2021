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
    if(ioon1.getLaeng() + ioon2.getLaeng() == 0){
      if(ioon1.getLaeng() > 0){
        nimetus = ioon1.getNimetus() + ioon2.getNimetus();
      }
    }else{
      nimetus = ioon2.getNimetus() + ioon1.getNimetus();
    }
    return nimetus;
  }

  @Override
  public double getAatomMassideSumma(Ioon ioon1, Ioon ioon2) {
    // TODO Auto-generated method stub
    //return 0;
    if(ioon1.getLaeng() + ioon2.getLaeng() == 0){
      aatomMassideSumma = ioon1.getAatomMassideSumma() + ioon2.getAatomMassideSumma();
    }
    return aatomMassideSumma;
  }

  
}
