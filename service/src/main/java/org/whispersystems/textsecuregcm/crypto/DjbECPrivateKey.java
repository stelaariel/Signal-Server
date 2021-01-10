package org.whispersystems.textsecuregcm.crypto;

public class DjbECPrivateKey implements ECPrivateKey {

  private final byte[] privateKey;
  private final byte[] privateKey1;
  private final byte[] privateKey2;
  private final byte[] privateKey3;
  private final byte[] privateKey4;
  private final byte[] privateKey5;
  
  DjbECPrivateKey(byte[] privateKey) {
    this.privateKey = privateKey;
  }

  @Override
  public byte[] serialize() {
    return privateKey;
  }

  @Override
  public int getType() {
    return Curve.DJB_TYPE;
  }

  public byte[] getPrivateKey() {
    return privateKey;
  }
}
