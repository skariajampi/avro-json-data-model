/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model.aggregate.domain;
/** The list of Domain Events the VRN Aggregate can produce */
@org.apache.avro.specific.AvroGenerated
public enum EventType implements org.apache.avro.generic.GenericEnumSymbol<EventType> {
  SOME_RECORD_ENRICHED_EVENT, IDENTIFIER_ADDED_TO_LIST_EVENT, IDENTIFIER_REMOVED_FROM_LIST_EVENT, PERSON_UPDATED_EVENT  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EventType\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"doc\":\"The list of Domain Events the VRN Aggregate can produce\",\"symbols\":[\"SOME_RECORD_ENRICHED_EVENT\",\"IDENTIFIER_ADDED_TO_LIST_EVENT\",\"IDENTIFIER_REMOVED_FROM_LIST_EVENT\",\"PERSON_UPDATED_EVENT\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
