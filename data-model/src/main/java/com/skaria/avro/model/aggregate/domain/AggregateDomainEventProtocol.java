/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model.aggregate.domain;

@org.apache.avro.specific.AvroGenerated
public interface AggregateDomainEventProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"AggregateDomainEventProtocol\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"types\":[{\"type\":\"record\",\"name\":\"Identifier\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Id\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"SomeRecord\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":\"Identifier\"},{\"name\":\"Id\",\"type\":\"Id\"},{\"name\":\"TIMESTAMP\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"RECEIVEDDATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"PRODUCEDDATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"POSITION\",\"type\":[\"null\",\"Location\"]},{\"name\":\"MEASURE\",\"type\":[\"null\",\"int\"]}]},{\"type\":\"record\",\"name\":\"SomeListId\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"enum\",\"name\":\"Action\",\"namespace\":\"com.skaria.avro.model\",\"symbols\":[\"STOP\",\"GO\"]},{\"type\":\"record\",\"name\":\"SomeList\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":\"SomeListId\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":\"Action\"}]},{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"person\",\"type\":\"Person\"}]},{\"type\":\"enum\",\"name\":\"EventType\",\"doc\":\"The list of Domain Events the VRN Aggregate can produce\",\"symbols\":[\"SOME_RECORD_ENRICHED_EVENT\",\"IDENTIFIER_ADDED_TO_LIST_EVENT\",\"IDENTIFIER_REMOVED_FROM_LIST_EVENT\",\"PERSON_UPDATED_EVENT\"]},{\"type\":\"record\",\"name\":\"SomeRecordEnrichedEventRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"someRecord\",\"type\":\"com.skaria.avro.model.SomeRecord\"},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"matches\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"com.skaria.avro.model.SomeList\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"person\",\"type\":[\"null\",\"com.skaria.avro.model.Person\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"IdentifierAddedToListEventRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"listId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"someList\",\"type\":\"com.skaria.avro.model.SomeList\"}]},{\"type\":\"record\",\"name\":\"IdentifierRemovedFromListEventRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"listId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"someList\",\"type\":\"com.skaria.avro.model.SomeList\"}]},{\"type\":\"record\",\"name\":\"PersonUpdatedEventRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"personBefore\",\"type\":[\"null\",\"com.skaria.avro.model.Person\"],\"default\":null},{\"name\":\"personAfter\",\"type\":\"com.skaria.avro.model.Person\"}]},{\"type\":\"record\",\"name\":\"DomainEventRecord\",\"doc\":\"Aggregate Domain Event *\",\"fields\":[{\"name\":\"identifier\",\"type\":\"com.skaria.avro.model.Identifier\"},{\"name\":\"eventType\",\"type\":\"EventType\",\"doc\":\"The Domain Event type in the  Record envelope *\"},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Timestamp of this Domain Event\"},{\"name\":\"event\",\"type\":[\"SomeRecordEnrichedEventRecord\",\"IdentifierAddedToListEventRecord\",\"IdentifierRemovedFromListEventRecord\",\"PersonUpdatedEventRecord\"],\"doc\":\"Union of the supported Domain events\"}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends AggregateDomainEventProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.skaria.avro.model.aggregate.domain.AggregateDomainEventProtocol.PROTOCOL;
  }
}