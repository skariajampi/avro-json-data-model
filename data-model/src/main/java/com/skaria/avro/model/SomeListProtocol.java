/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model;

@org.apache.avro.specific.AvroGenerated
public interface SomeListProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SomeListProtocol\",\"namespace\":\"com.skaria.avro.model\",\"types\":[{\"type\":\"record\",\"name\":\"SomeListId\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"STOP\",\"GO\"]},{\"type\":\"record\",\"name\":\"SomeList\",\"fields\":[{\"name\":\"id\",\"type\":\"SomeListId\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":\"Action\"}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends SomeListProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.skaria.avro.model.SomeListProtocol.PROTOCOL;
  }
}