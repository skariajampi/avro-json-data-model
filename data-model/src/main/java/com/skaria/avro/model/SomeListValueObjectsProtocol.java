/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model;

@org.apache.avro.specific.AvroGenerated
public interface SomeListValueObjectsProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SomeListValueObjectsProtocol\",\"namespace\":\"com.skaria.avro.model\",\"types\":[{\"type\":\"record\",\"name\":\"SomeListId\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"STOP\",\"GO\"]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends SomeListValueObjectsProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.skaria.avro.model.SomeListValueObjectsProtocol.PROTOCOL;
  }
}