/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model;

@org.apache.avro.specific.AvroGenerated
public interface IdentifierAggregateProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"IdentifierAggregateProtocol\",\"namespace\":\"com.skaria.avro.model\",\"types\":[{\"type\":\"record\",\"name\":\"Identifier\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Id\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"SomeRecord\",\"fields\":[{\"name\":\"identifier\",\"type\":\"Identifier\"},{\"name\":\"Id\",\"type\":\"Id\"},{\"name\":\"TIMESTAMP\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"MEASURE\",\"type\":[\"null\",\"int\"]}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends IdentifierAggregateProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.skaria.avro.model.IdentifierAggregateProtocol.PROTOCOL;
  }
}