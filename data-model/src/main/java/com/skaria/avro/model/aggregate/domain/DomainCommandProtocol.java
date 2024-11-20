/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model.aggregate.domain;

@org.apache.avro.specific.AvroGenerated
public interface DomainCommandProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"DomainCommandProtocol\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"types\":[{\"type\":\"record\",\"name\":\"Identifier\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Id\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"SomeRecord\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":\"Identifier\"},{\"name\":\"Id\",\"type\":\"Id\"},{\"name\":\"TIMESTAMP\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"MEASURE\",\"type\":[\"null\",\"int\"]}]},{\"type\":\"record\",\"name\":\"SomeListId\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"enum\",\"name\":\"Action\",\"namespace\":\"com.skaria.avro.model\",\"symbols\":[\"STOP\",\"GO\"]},{\"type\":\"record\",\"name\":\"SomeList\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":\"SomeListId\"},{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":\"Action\"}]},{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"person\",\"type\":\"Person\"}]},{\"type\":\"enum\",\"name\":\"CommandType\",\"doc\":\"The list of Commands supported, a Cmd is a request to mutate the state of the system\",\"symbols\":[\"PROCESS_SOME_RECORD_COMMAND\",\"ADD_IDENTIFIER_TO_SOME_LIST_COMMAND\",\"REMOVE_IDENTIFIER_FROM_SOME_LIST_COMMAND\",\"UPDATE_PERSON_COMMAND\"]},{\"type\":\"record\",\"name\":\"ProcessSomeRecordCommandRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"someRecord\",\"type\":\"com.skaria.avro.model.SomeRecord\"}]},{\"type\":\"record\",\"name\":\"CommandRecord\",\"doc\":\"Command Record\",\"fields\":[{\"name\":\"commandType\",\"type\":\"CommandType\",\"doc\":\"The type of domain model command\"},{\"name\":\"identifier\",\"type\":\"com.skaria.avro.model.Identifier\"},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Timestamp of the Cmd\"},{\"name\":\"command\",\"type\":[\"ProcessSomeRecordCommandRecord\"],\"doc\":\"Union across the supported  Aggregate Commands\"}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends DomainCommandProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.skaria.avro.model.aggregate.domain.DomainCommandProtocol.PROTOCOL;
  }
}