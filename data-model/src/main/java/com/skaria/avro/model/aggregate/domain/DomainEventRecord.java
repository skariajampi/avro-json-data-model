/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model.aggregate.domain;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
/** Aggregate Domain Event * */
@org.apache.avro.specific.AvroGenerated
public class DomainEventRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3321139974498460934L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DomainEventRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"doc\":\"Aggregate Domain Event *\",\"fields\":[{\"name\":\"Identifier\",\"type\":{\"type\":\"record\",\"name\":\"Identifier\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"doc\":\"The list of Domain Events the VRN Aggregate can produce\",\"symbols\":[\"SOME_RECORD_ENRICHED_EVENT\"]},\"doc\":\"The Domain Event type in the  Record envelope *\"},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Timestamp of this Domain Event\"},{\"name\":\"event\",\"type\":[{\"type\":\"record\",\"name\":\"SomeRecordUpdatedEventRecord\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"someRecord\",\"type\":{\"type\":\"record\",\"name\":\"SomeRecord\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":\"Identifier\"},{\"name\":\"Id\",\"type\":{\"type\":\"record\",\"name\":\"Id\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"TIMESTAMP\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"MEASURE\",\"type\":[\"null\",\"int\"]}]}}]}],\"doc\":\"Union of the supported Domain events\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<DomainEventRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DomainEventRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DomainEventRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DomainEventRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DomainEventRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DomainEventRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DomainEventRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DomainEventRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DomainEventRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.skaria.avro.model.Identifier Identifier;
  /** The Domain Event type in the  Record envelope * */
  private com.skaria.avro.model.aggregate.domain.EventType eventType;
  /** Timestamp of this Domain Event */
  private java.lang.String creationTimestamp;
  /** Union of the supported Domain events */
  private java.lang.Object event;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DomainEventRecord() {}

  /**
   * All-args constructor.
   * @param Identifier The new value for Identifier
   * @param eventType The Domain Event type in the  Record envelope *
   * @param creationTimestamp Timestamp of this Domain Event
   * @param event Union of the supported Domain events
   */
  public DomainEventRecord(com.skaria.avro.model.Identifier Identifier, com.skaria.avro.model.aggregate.domain.EventType eventType, java.lang.String creationTimestamp, java.lang.Object event) {
    this.Identifier = Identifier;
    this.eventType = eventType;
    this.creationTimestamp = creationTimestamp;
    this.event = event;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Identifier;
    case 1: return eventType;
    case 2: return creationTimestamp;
    case 3: return event;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Identifier = (com.skaria.avro.model.Identifier)value$; break;
    case 1: eventType = (com.skaria.avro.model.aggregate.domain.EventType)value$; break;
    case 2: creationTimestamp = value$ != null ? value$.toString() : null; break;
    case 3: event = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Identifier' field.
   * @return The value of the 'Identifier' field.
   */
  public com.skaria.avro.model.Identifier getIdentifier() {
    return Identifier;
  }

  /**
   * Gets the value of the 'Identifier' field as an Optional&lt;com.skaria.avro.model.Identifier&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Identifier&gt;.
   */
  public Optional<com.skaria.avro.model.Identifier> getOptionalIdentifier() {
    return Optional.<com.skaria.avro.model.Identifier>ofNullable(Identifier);
  }

  /**
   * Sets the value of the 'Identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(com.skaria.avro.model.Identifier value) {
    this.Identifier = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The Domain Event type in the  Record envelope *
   */
  public com.skaria.avro.model.aggregate.domain.EventType getEventType() {
    return eventType;
  }

  /**
   * Gets the value of the 'eventType' field as an Optional&lt;com.skaria.avro.model.aggregate.domain.EventType&gt;.
   * The Domain Event type in the  Record envelope *
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.aggregate.domain.EventType&gt;.
   */
  public Optional<com.skaria.avro.model.aggregate.domain.EventType> getOptionalEventType() {
    return Optional.<com.skaria.avro.model.aggregate.domain.EventType>ofNullable(eventType);
  }

  /**
   * Sets the value of the 'eventType' field.
   * The Domain Event type in the  Record envelope *
   * @param value the value to set.
   */
  public void setEventType(com.skaria.avro.model.aggregate.domain.EventType value) {
    this.eventType = value;
  }

  /**
   * Gets the value of the 'creationTimestamp' field.
   * @return Timestamp of this Domain Event
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Gets the value of the 'creationTimestamp' field as an Optional&lt;java.lang.String&gt;.
   * Timestamp of this Domain Event
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalCreationTimestamp() {
    return Optional.<java.lang.String>ofNullable(creationTimestamp);
  }

  /**
   * Sets the value of the 'creationTimestamp' field.
   * Timestamp of this Domain Event
   * @param value the value to set.
   */
  public void setCreationTimestamp(java.lang.String value) {
    this.creationTimestamp = value;
  }

  /**
   * Gets the value of the 'event' field.
   * @return Union of the supported Domain events
   */
  public java.lang.Object getEvent() {
    return event;
  }

  /**
   * Gets the value of the 'event' field as an Optional&lt;java.lang.Object&gt;.
   * Union of the supported Domain events
   * @return The value wrapped in an Optional&lt;java.lang.Object&gt;.
   */
  public Optional<java.lang.Object> getOptionalEvent() {
    return Optional.<java.lang.Object>ofNullable(event);
  }

  /**
   * Sets the value of the 'event' field.
   * Union of the supported Domain events
   * @param value the value to set.
   */
  public void setEvent(java.lang.Object value) {
    this.event = value;
  }

  /**
   * Creates a new DomainEventRecord RecordBuilder.
   * @return A new DomainEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder();
  }

  /**
   * Creates a new DomainEventRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DomainEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder(other);
    }
  }

  /**
   * Creates a new DomainEventRecord RecordBuilder by copying an existing DomainEventRecord instance.
   * @param other The existing instance to copy.
   * @return A new DomainEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.DomainEventRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for DomainEventRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DomainEventRecord>
    implements org.apache.avro.data.RecordBuilder<DomainEventRecord> {

    private com.skaria.avro.model.Identifier Identifier;
    private com.skaria.avro.model.Identifier.Builder IdentifierBuilder;
    /** The Domain Event type in the  Record envelope * */
    private com.skaria.avro.model.aggregate.domain.EventType eventType;
    /** Timestamp of this Domain Event */
    private java.lang.String creationTimestamp;
    /** Union of the supported Domain events */
    private java.lang.Object event;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Identifier)) {
        this.Identifier = data().deepCopy(fields()[0].schema(), other.Identifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasIdentifierBuilder()) {
        this.IdentifierBuilder = com.skaria.avro.model.Identifier.newBuilder(other.getIdentifierBuilder());
      }
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[2].schema(), other.creationTimestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.event)) {
        this.event = data().deepCopy(fields()[3].schema(), other.event);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing DomainEventRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.DomainEventRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Identifier)) {
        this.Identifier = data().deepCopy(fields()[0].schema(), other.Identifier);
        fieldSetFlags()[0] = true;
      }
      this.IdentifierBuilder = null;
      if (isValidValue(fields()[1], other.eventType)) {
        this.eventType = data().deepCopy(fields()[1].schema(), other.eventType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[2].schema(), other.creationTimestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event)) {
        this.event = data().deepCopy(fields()[3].schema(), other.event);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'Identifier' field.
      * @return The value.
      */
    public com.skaria.avro.model.Identifier getIdentifier() {
      return Identifier;
    }

    /**
      * Gets the value of the 'Identifier' field as an Optional&lt;com.skaria.avro.model.Identifier&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Identifier&gt;.
      */
    public Optional<com.skaria.avro.model.Identifier> getOptionalIdentifier() {
      return Optional.<com.skaria.avro.model.Identifier>ofNullable(Identifier);
    }

    /**
      * Sets the value of the 'Identifier' field.
      * @param value The value of 'Identifier'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder setIdentifier(com.skaria.avro.model.Identifier value) {
      validate(fields()[0], value);
      this.IdentifierBuilder = null;
      this.Identifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Identifier' field has been set.
      * @return True if the 'Identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'Identifier' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.Identifier.Builder getIdentifierBuilder() {
      if (IdentifierBuilder == null) {
        if (hasIdentifier()) {
          setIdentifierBuilder(com.skaria.avro.model.Identifier.newBuilder(Identifier));
        } else {
          setIdentifierBuilder(com.skaria.avro.model.Identifier.newBuilder());
        }
      }
      return IdentifierBuilder;
    }

    /**
     * Sets the Builder instance for the 'Identifier' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder setIdentifierBuilder(com.skaria.avro.model.Identifier.Builder value) {
      clearIdentifier();
      IdentifierBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Identifier' field has an active Builder instance
     * @return True if the 'Identifier' field has an active Builder instance
     */
    public boolean hasIdentifierBuilder() {
      return IdentifierBuilder != null;
    }

    /**
      * Clears the value of the 'Identifier' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder clearIdentifier() {
      Identifier = null;
      IdentifierBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * The Domain Event type in the  Record envelope *
      * @return The value.
      */
    public com.skaria.avro.model.aggregate.domain.EventType getEventType() {
      return eventType;
    }

    /**
      * Gets the value of the 'eventType' field as an Optional&lt;com.skaria.avro.model.aggregate.domain.EventType&gt;.
      * The Domain Event type in the  Record envelope *
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.aggregate.domain.EventType&gt;.
      */
    public Optional<com.skaria.avro.model.aggregate.domain.EventType> getOptionalEventType() {
      return Optional.<com.skaria.avro.model.aggregate.domain.EventType>ofNullable(eventType);
    }

    /**
      * Sets the value of the 'eventType' field.
      * The Domain Event type in the  Record envelope *
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder setEventType(com.skaria.avro.model.aggregate.domain.EventType value) {
      validate(fields()[1], value);
      this.eventType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * The Domain Event type in the  Record envelope *
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'eventType' field.
      * The Domain Event type in the  Record envelope *
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'creationTimestamp' field.
      * Timestamp of this Domain Event
      * @return The value.
      */
    public java.lang.String getCreationTimestamp() {
      return creationTimestamp;
    }

    /**
      * Gets the value of the 'creationTimestamp' field as an Optional&lt;java.lang.String&gt;.
      * Timestamp of this Domain Event
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalCreationTimestamp() {
      return Optional.<java.lang.String>ofNullable(creationTimestamp);
    }

    /**
      * Sets the value of the 'creationTimestamp' field.
      * Timestamp of this Domain Event
      * @param value The value of 'creationTimestamp'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder setCreationTimestamp(java.lang.String value) {
      validate(fields()[2], value);
      this.creationTimestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'creationTimestamp' field has been set.
      * Timestamp of this Domain Event
      * @return True if the 'creationTimestamp' field has been set, false otherwise.
      */
    public boolean hasCreationTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'creationTimestamp' field.
      * Timestamp of this Domain Event
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder clearCreationTimestamp() {
      creationTimestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'event' field.
      * Union of the supported Domain events
      * @return The value.
      */
    public java.lang.Object getEvent() {
      return event;
    }

    /**
      * Gets the value of the 'event' field as an Optional&lt;java.lang.Object&gt;.
      * Union of the supported Domain events
      * @return The value wrapped in an Optional&lt;java.lang.Object&gt;.
      */
    public Optional<java.lang.Object> getOptionalEvent() {
      return Optional.<java.lang.Object>ofNullable(event);
    }

    /**
      * Sets the value of the 'event' field.
      * Union of the supported Domain events
      * @param value The value of 'event'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder setEvent(java.lang.Object value) {
      validate(fields()[3], value);
      this.event = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * Union of the supported Domain events
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'event' field.
      * Union of the supported Domain events
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.DomainEventRecord.Builder clearEvent() {
      event = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DomainEventRecord build() {
      try {
        DomainEventRecord record = new DomainEventRecord();
        if (IdentifierBuilder != null) {
          try {
            record.Identifier = this.IdentifierBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Identifier"));
            throw e;
          }
        } else {
          record.Identifier = fieldSetFlags()[0] ? this.Identifier : (com.skaria.avro.model.Identifier) defaultValue(fields()[0]);
        }
        record.eventType = fieldSetFlags()[1] ? this.eventType : (com.skaria.avro.model.aggregate.domain.EventType) defaultValue(fields()[1]);
        record.creationTimestamp = fieldSetFlags()[2] ? this.creationTimestamp : (java.lang.String) defaultValue(fields()[2]);
        record.event = fieldSetFlags()[3] ? this.event :  defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DomainEventRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<DomainEventRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DomainEventRecord>
    READER$ = (org.apache.avro.io.DatumReader<DomainEventRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










