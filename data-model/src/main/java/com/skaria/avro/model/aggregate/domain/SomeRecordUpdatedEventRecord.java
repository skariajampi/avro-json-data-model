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
public class SomeRecordUpdatedEventRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6150220465680378255L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SomeRecordUpdatedEventRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"creationTimestamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<SomeRecordUpdatedEventRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SomeRecordUpdatedEventRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SomeRecordUpdatedEventRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SomeRecordUpdatedEventRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SomeRecordUpdatedEventRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SomeRecordUpdatedEventRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SomeRecordUpdatedEventRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SomeRecordUpdatedEventRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SomeRecordUpdatedEventRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID eventId;
  private java.lang.String creationTimestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SomeRecordUpdatedEventRecord() {}

  /**
   * All-args constructor.
   * @param eventId The new value for eventId
   * @param creationTimestamp The new value for creationTimestamp
   */
  public SomeRecordUpdatedEventRecord(java.util.UUID eventId, java.lang.String creationTimestamp) {
    this.eventId = eventId;
    this.creationTimestamp = creationTimestamp;
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
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
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
   * Creates a new SomeRecordUpdatedEventRecord RecordBuilder.
   * @return A new SomeRecordUpdatedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder();
  }

  /**
   * Creates a new SomeRecordUpdatedEventRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SomeRecordUpdatedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder(other);
    }
  }

  /**
   * Creates a new SomeRecordUpdatedEventRecord RecordBuilder by copying an existing SomeRecordUpdatedEventRecord instance.
   * @param other The existing instance to copy.
   * @return A new SomeRecordUpdatedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for SomeRecordUpdatedEventRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SomeRecordUpdatedEventRecord>
    implements org.apache.avro.data.RecordBuilder<SomeRecordUpdatedEventRecord> {

    private java.util.UUID eventId;
    private java.lang.String creationTimestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[1].schema(), other.creationTimestamp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SomeRecordUpdatedEventRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.creationTimestamp)) {
        this.creationTimestamp = data().deepCopy(fields()[1].schema(), other.creationTimestamp);
        fieldSetFlags()[1] = true;
      }
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
    public com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder setEventId(java.util.UUID value) {
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
    public com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder clearEventId() {
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
    public com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder setCreationTimestamp(java.lang.String value) {
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
    public com.skaria.avro.model.aggregate.domain.SomeRecordUpdatedEventRecord.Builder clearCreationTimestamp() {
      creationTimestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SomeRecordUpdatedEventRecord build() {
      try {
        SomeRecordUpdatedEventRecord record = new SomeRecordUpdatedEventRecord();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (java.util.UUID) defaultValue(fields()[0]);
        record.creationTimestamp = fieldSetFlags()[1] ? this.creationTimestamp : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SomeRecordUpdatedEventRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<SomeRecordUpdatedEventRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SomeRecordUpdatedEventRecord>
    READER$ = (org.apache.avro.io.DatumReader<SomeRecordUpdatedEventRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










