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
public class EnrichedEventRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8792345019728399921L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnrichedEventRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"fields\":[{\"name\":\"readUuid\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"someRecord\",\"type\":{\"type\":\"record\",\"name\":\"SomeRecord\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"record\",\"name\":\"Identifier\",\"fields\":[{\"name\":\"identifier\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"Id\",\"type\":{\"type\":\"record\",\"name\":\"Id\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"TIMESTAMP\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"RECEIVEDDATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"PRODUCEDDATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"POSITION\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}]},{\"name\":\"MEASURE\",\"type\":[\"null\",\"int\"]}]}},{\"name\":\"matches\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"SomeList\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"record\",\"name\":\"SomeListId\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"STOP\",\"GO\"]}}]},\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<EnrichedEventRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EnrichedEventRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EnrichedEventRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EnrichedEventRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EnrichedEventRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EnrichedEventRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EnrichedEventRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EnrichedEventRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EnrichedEventRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID readUuid;
  private com.skaria.avro.model.SomeRecord someRecord;
  private java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> matches;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EnrichedEventRecord() {}

  /**
   * All-args constructor.
   * @param readUuid The new value for readUuid
   * @param someRecord The new value for someRecord
   * @param matches The new value for matches
   */
  public EnrichedEventRecord(java.util.UUID readUuid, com.skaria.avro.model.SomeRecord someRecord, java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> matches) {
    this.readUuid = readUuid;
    this.someRecord = someRecord;
    this.matches = matches;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return readUuid;
    case 1: return someRecord;
    case 2: return matches;
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
    case 0: readUuid = (java.util.UUID)value$; break;
    case 1: someRecord = (com.skaria.avro.model.SomeRecord)value$; break;
    case 2: matches = (java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'readUuid' field.
   * @return The value of the 'readUuid' field.
   */
  public java.util.UUID getReadUuid() {
    return readUuid;
  }

  /**
   * Gets the value of the 'readUuid' field as an Optional&lt;java.util.UUID&gt;.
   * @return The value wrapped in an Optional&lt;java.util.UUID&gt;.
   */
  public Optional<java.util.UUID> getOptionalReadUuid() {
    return Optional.<java.util.UUID>ofNullable(readUuid);
  }

  /**
   * Sets the value of the 'readUuid' field.
   * @param value the value to set.
   */
  public void setReadUuid(java.util.UUID value) {
    this.readUuid = value;
  }

  /**
   * Gets the value of the 'someRecord' field.
   * @return The value of the 'someRecord' field.
   */
  public com.skaria.avro.model.SomeRecord getSomeRecord() {
    return someRecord;
  }

  /**
   * Gets the value of the 'someRecord' field as an Optional&lt;com.skaria.avro.model.SomeRecord&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeRecord&gt;.
   */
  public Optional<com.skaria.avro.model.SomeRecord> getOptionalSomeRecord() {
    return Optional.<com.skaria.avro.model.SomeRecord>ofNullable(someRecord);
  }

  /**
   * Sets the value of the 'someRecord' field.
   * @param value the value to set.
   */
  public void setSomeRecord(com.skaria.avro.model.SomeRecord value) {
    this.someRecord = value;
  }

  /**
   * Gets the value of the 'matches' field.
   * @return The value of the 'matches' field.
   */
  public java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> getMatches() {
    return matches;
  }

  /**
   * Gets the value of the 'matches' field as an Optional&lt;java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>&gt;.
   * @return The value wrapped in an Optional&lt;java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>&gt;.
   */
  public Optional<java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>> getOptionalMatches() {
    return Optional.<java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>>ofNullable(matches);
  }

  /**
   * Sets the value of the 'matches' field.
   * @param value the value to set.
   */
  public void setMatches(java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> value) {
    this.matches = value;
  }

  /**
   * Creates a new EnrichedEventRecord RecordBuilder.
   * @return A new EnrichedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder();
  }

  /**
   * Creates a new EnrichedEventRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EnrichedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder(other);
    }
  }

  /**
   * Creates a new EnrichedEventRecord RecordBuilder by copying an existing EnrichedEventRecord instance.
   * @param other The existing instance to copy.
   * @return A new EnrichedEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.EnrichedEventRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for EnrichedEventRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnrichedEventRecord>
    implements org.apache.avro.data.RecordBuilder<EnrichedEventRecord> {

    private java.util.UUID readUuid;
    private com.skaria.avro.model.SomeRecord someRecord;
    private com.skaria.avro.model.SomeRecord.Builder someRecordBuilder;
    private java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> matches;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.readUuid)) {
        this.readUuid = data().deepCopy(fields()[0].schema(), other.readUuid);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.someRecord)) {
        this.someRecord = data().deepCopy(fields()[1].schema(), other.someRecord);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasSomeRecordBuilder()) {
        this.someRecordBuilder = com.skaria.avro.model.SomeRecord.newBuilder(other.getSomeRecordBuilder());
      }
      if (isValidValue(fields()[2], other.matches)) {
        this.matches = data().deepCopy(fields()[2].schema(), other.matches);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing EnrichedEventRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.EnrichedEventRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.readUuid)) {
        this.readUuid = data().deepCopy(fields()[0].schema(), other.readUuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.someRecord)) {
        this.someRecord = data().deepCopy(fields()[1].schema(), other.someRecord);
        fieldSetFlags()[1] = true;
      }
      this.someRecordBuilder = null;
      if (isValidValue(fields()[2], other.matches)) {
        this.matches = data().deepCopy(fields()[2].schema(), other.matches);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'readUuid' field.
      * @return The value.
      */
    public java.util.UUID getReadUuid() {
      return readUuid;
    }

    /**
      * Gets the value of the 'readUuid' field as an Optional&lt;java.util.UUID&gt;.
      * @return The value wrapped in an Optional&lt;java.util.UUID&gt;.
      */
    public Optional<java.util.UUID> getOptionalReadUuid() {
      return Optional.<java.util.UUID>ofNullable(readUuid);
    }

    /**
      * Sets the value of the 'readUuid' field.
      * @param value The value of 'readUuid'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder setReadUuid(java.util.UUID value) {
      validate(fields()[0], value);
      this.readUuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'readUuid' field has been set.
      * @return True if the 'readUuid' field has been set, false otherwise.
      */
    public boolean hasReadUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'readUuid' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder clearReadUuid() {
      readUuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'someRecord' field.
      * @return The value.
      */
    public com.skaria.avro.model.SomeRecord getSomeRecord() {
      return someRecord;
    }

    /**
      * Gets the value of the 'someRecord' field as an Optional&lt;com.skaria.avro.model.SomeRecord&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeRecord&gt;.
      */
    public Optional<com.skaria.avro.model.SomeRecord> getOptionalSomeRecord() {
      return Optional.<com.skaria.avro.model.SomeRecord>ofNullable(someRecord);
    }

    /**
      * Sets the value of the 'someRecord' field.
      * @param value The value of 'someRecord'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder setSomeRecord(com.skaria.avro.model.SomeRecord value) {
      validate(fields()[1], value);
      this.someRecordBuilder = null;
      this.someRecord = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'someRecord' field has been set.
      * @return True if the 'someRecord' field has been set, false otherwise.
      */
    public boolean hasSomeRecord() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'someRecord' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.SomeRecord.Builder getSomeRecordBuilder() {
      if (someRecordBuilder == null) {
        if (hasSomeRecord()) {
          setSomeRecordBuilder(com.skaria.avro.model.SomeRecord.newBuilder(someRecord));
        } else {
          setSomeRecordBuilder(com.skaria.avro.model.SomeRecord.newBuilder());
        }
      }
      return someRecordBuilder;
    }

    /**
     * Sets the Builder instance for the 'someRecord' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder setSomeRecordBuilder(com.skaria.avro.model.SomeRecord.Builder value) {
      clearSomeRecord();
      someRecordBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'someRecord' field has an active Builder instance
     * @return True if the 'someRecord' field has an active Builder instance
     */
    public boolean hasSomeRecordBuilder() {
      return someRecordBuilder != null;
    }

    /**
      * Clears the value of the 'someRecord' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder clearSomeRecord() {
      someRecord = null;
      someRecordBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'matches' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> getMatches() {
      return matches;
    }

    /**
      * Gets the value of the 'matches' field as an Optional&lt;java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>&gt;.
      * @return The value wrapped in an Optional&lt;java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>&gt;.
      */
    public Optional<java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>> getOptionalMatches() {
      return Optional.<java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>>ofNullable(matches);
    }

    /**
      * Sets the value of the 'matches' field.
      * @param value The value of 'matches'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder setMatches(java.util.Map<java.lang.String,com.skaria.avro.model.SomeList> value) {
      validate(fields()[2], value);
      this.matches = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'matches' field has been set.
      * @return True if the 'matches' field has been set, false otherwise.
      */
    public boolean hasMatches() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'matches' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.EnrichedEventRecord.Builder clearMatches() {
      matches = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EnrichedEventRecord build() {
      try {
        EnrichedEventRecord record = new EnrichedEventRecord();
        record.readUuid = fieldSetFlags()[0] ? this.readUuid : (java.util.UUID) defaultValue(fields()[0]);
        if (someRecordBuilder != null) {
          try {
            record.someRecord = this.someRecordBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("someRecord"));
            throw e;
          }
        } else {
          record.someRecord = fieldSetFlags()[1] ? this.someRecord : (com.skaria.avro.model.SomeRecord) defaultValue(fields()[1]);
        }
        record.matches = fieldSetFlags()[2] ? this.matches : (java.util.Map<java.lang.String,com.skaria.avro.model.SomeList>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EnrichedEventRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<EnrichedEventRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EnrichedEventRecord>
    READER$ = (org.apache.avro.io.DatumReader<EnrichedEventRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










