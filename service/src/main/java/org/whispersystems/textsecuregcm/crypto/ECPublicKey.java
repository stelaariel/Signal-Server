package org.whispersystems.textsecuregcm.crypto;

public interface ECPublicKey extends Comparable<ECPublicKey> {

  public static final int KEY_SIZE = 33;

  public byte[] serialize();

  public int getType();
  
  public int getType1();
  public int getType2();
  public int getType3();
  public int getType4();
  public int getType5();
}