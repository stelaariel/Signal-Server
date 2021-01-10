package org.whispersystems.textsecuregcm.crypto;

public interface ECPrivateKey {
  public byte[] serialize();
  public int getType();
  public int getType1();
  public int getType2();
  public int getType3();
  public int getType4();
  public int getType5();
  public int getType6();
}

