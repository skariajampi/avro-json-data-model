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
@org.apache.avro.specific.AvroGenerated
public class RemoveIdentifierFromListCommandRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6503419986654084971L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RemoveIdentifierFromListCommandRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"someListId\",\"type\":{\"type\":\"record\",\"name\":\"SomeListId\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<RemoveIdentifierFromListCommandRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RemoveIdentifierFromListCommandRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RemoveIdentifierFromListCommandRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RemoveIdentifierFromListCommandRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RemoveIdentifierFromListCommandRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RemoveIdentifierFromListCommandRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RemoveIdentifierFromListCommandRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RemoveIdentifierFromListCommandRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RemoveIdentifierFromListCommandRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID eventId;
  private java.lang.String creationTimestamp;
  private com.skaria.avro.model.SomeListId someListId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RemoveIdentifierFromListCommandRecord() {}

  /**
   * All-args constructor.
   * @param eventId The new value for eventId
   * @param creationTimestamp The new value for creationTimestamp
   * @param someListId The new value for someListId
   */
  public RemoveIdentifierFromListCommandRecord(java.util.UUID eventId, java.lang.String creationTimestamp, com.skaria.avro.model.SomeListId someListId) {
    this.eventId = eventId;
    this.creationTimestamp = creationTimestamp;
    this.someListId = someListId;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventId;
    case 1: return creationTimestamp;
    case 2: return someListId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventId = (java.util.UUID)value$; break;
    case 1: creationTimestamp = value$ != null ? value$.toString() : null; break;
    case 2: someListId = (com.skaria.avro.model.SomeListId)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventId' field.
   * @return The value of the 'eventId' field.
   */
  public java.util.UUID getEventId() {
    return eventId;
  }

  /**
   * Gets the value of the 'eventId' field as an Optional&lt;java.util.UUID&gt;.
   * @return The value wrapped in an Optional&lt;java.util.UUID&gt;.
   */
  public Optional<java.util.UUID> getOptionalEventId() {
    return Optional.<java.util.UUID>ofNullable(eventId);
  }

  /**
   * Sets the value of the 'eventId' field.
   * @param value the value to set.
   */
  public void setEventId(java.util.UUID value) {
    this.eventId = value;
  }

  /**
   * Gets the value of the 'creationTimestamp' field.
   * @return The value of the 'creationTimestamp' field.
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Gets the value of the 'creationTimestamp' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalCreationTimestamp() {
    return Optional.<java.lang.String>ofNullable(creationTimestamp);
  }

  /**
   * Sets the value of the 'creationTimestamp' field.
   * @param value the value to set.
   */
  public void setCreationTimestamp(java.lang.String value) {
    this.creationTimestamp = value;
  }

  /**
   * Gets the value of the 'someListId' field.
   * @return The value of the 'someListId' field.
   */
  public com.skaria.avro.model.SomeListId getSomeListId() {
    return someListId;
  }

  /**
   * Gets the value of the 'someListId' field as an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
   */
  public Optional<com.skaria.avro.model.SomeListId> getOptionalSomeListId() {
    return Optional.<com.skaria.avro.model.SomeListId>ofNullable(someListId);
  }

  /**
   * Sets the value of the 'someListId' field.
   * @param value the value to set.
   */
  public void setSomeListId(com.skaria.avro.model.SomeListId value) {
    this.someListId = value;
  }

  /**
   * Creates a new RemoveIdentifierFromListCommandRecord RecordBuilder.
   * @return A new RemoveIdentifierFromListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder();
  }

  /**
   * Creates a new RemoveIdentifierFromListCommandRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RemoveIdentifierFromListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder(other);
    }
  }

  /**
   * Creates a new RemoveIdentifierFromListCommandRecord RecordBuilder by copying an existing RemoveIdentifierFromListCommandRecord instance.
   * @param other The existing instance to copy.
   * @return A new RemoveIdentifierFromListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for RemoveIdentifierFromListCommandRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RemoveIdentifierFromListCommandRecord>
    implements org.apache.avro.data.RecordBuilder<RemoveIdentifierFromListCommandRecord> {

    private java.util.UUID eventId;
    private java.lang.String creationTimestamp;
    private com.skaria.avro.model.SomeListId someListId;
    private com.skaria.avro.model.SomeListId.Builder someListIdBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[1].schema(), other.creationTimestamp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.someListId)) {
        this.someListId = data().deepCopy(fields()[2].schema(), other.someListId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasSomeListIdBuilder()) {
        this.someListIdBuilder = com.skaria.avro.model.SomeListId.newBuilder(other.getSomeListIdBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing RemoveIdentifierFromListCommandRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[1].schema(), other.creationTimestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.someListId)) {
        this.someListId = data().deepCopy(fields()[2].schema(), other.someListId);
        fieldSetFlags()[2] = true;
      }
      this.someListIdBuilder = null;
    }

    /**
      * Gets the value of the 'eventId' field.
      * @return The value.
      */
    public java.util.UUID getEventId() {
      return eventId;
    }

    /**
      * Gets the value of the 'eventId' field as an Optional&lt;java.util.UUID&gt;.
      * @return The value wrapped in an Optional&lt;java.util.UUID&gt;.
      */
    public Optional<java.util.UUID> getOptionalEventId() {
      return Optional.<java.util.UUID>ofNullable(eventId);
    }

    /**
      * Sets the value of the 'eventId' field.
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder setEventId(java.util.UUID value) {
      validate(fields()[0], value);
      this.eventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventId' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder clearEventId() {
      eventId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'creationTimestamp' field.
      * @return The value.
      */
    public java.lang.String getCreationTimestamp() {
      return creationTimestamp;
    }

    /**
      * Gets the value of the 'creationTimestamp' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalCreationTimestamp() {
      return Optional.<java.lang.String>ofNullable(creationTimestamp);
    }

    /**
      * Sets the value of the 'creationTimestamp' field.
      * @param value The value of 'creationTimestamp'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder setCreationTimestamp(java.lang.String value) {
      validate(fields()[1], value);
      this.creationTimestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'creationTimestamp' field has been set.
      * @return True if the 'creationTimestamp' field has been set, false otherwise.
      */
    public boolean hasCreationTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'creationTimestamp' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder clearCreationTimestamp() {
      creationTimestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'someListId' field.
      * @return The value.
      */
    public com.skaria.avro.model.SomeListId getSomeListId() {
      return someListId;
    }

    /**
      * Gets the value of the 'someListId' field as an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
      */
    public Optional<com.skaria.avro.model.SomeListId> getOptionalSomeListId() {
      return Optional.<com.skaria.avro.model.SomeListId>ofNullable(someListId);
    }

    /**
      * Sets the value of the 'someListId' field.
      * @param value The value of 'someListId'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder setSomeListId(com.skaria.avro.model.SomeListId value) {
      validate(fields()[2], value);
      this.someListIdBuilder = null;
      this.someListId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'someListId' field has been set.
      * @return True if the 'someListId' field has been set, false otherwise.
      */
    public boolean hasSomeListId() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'someListId' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.SomeListId.Builder getSomeListIdBuilder() {
      if (someListIdBuilder == null) {
        if (hasSomeListId()) {
          setSomeListIdBuilder(com.skaria.avro.model.SomeListId.newBuilder(someListId));
        } else {
          setSomeListIdBuilder(com.skaria.avro.model.SomeListId.newBuilder());
        }
      }
      return someListIdBuilder;
    }

    /**
     * Sets the Builder instance for the 'someListId' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder setSomeListIdBuilder(com.skaria.avro.model.SomeListId.Builder value) {
      clearSomeListId();
      someListIdBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'someListId' field has an active Builder instance
     * @return True if the 'someListId' field has an active Builder instance
     */
    public boolean hasSomeListIdBuilder() {
      return someListIdBuilder != null;
    }

    /**
      * Clears the value of the 'someListId' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.RemoveIdentifierFromListCommandRecord.Builder clearSomeListId() {
      someListId = null;
      someListIdBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RemoveIdentifierFromListCommandRecord build() {
      try {
        RemoveIdentifierFromListCommandRecord record = new RemoveIdentifierFromListCommandRecord();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (java.util.UUID) defaultValue(fields()[0]);
        record.creationTimestamp = fieldSetFlags()[1] ? this.creationTimestamp : (java.lang.String) defaultValue(fields()[1]);
        if (someListIdBuilder != null) {
          try {
            record.someListId = this.someListIdBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("someListId"));
            throw e;
          }
        } else {
          record.someListId = fieldSetFlags()[2] ? this.someListId : (com.skaria.avro.model.SomeListId) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RemoveIdentifierFromListCommandRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<RemoveIdentifierFromListCommandRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RemoveIdentifierFromListCommandRecord>
    READER$ = (org.apache.avro.io.DatumReader<RemoveIdentifierFromListCommandRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










