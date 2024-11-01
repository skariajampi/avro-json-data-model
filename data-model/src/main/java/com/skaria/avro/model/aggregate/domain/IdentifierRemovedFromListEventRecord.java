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
public class IdentifierRemovedFromListEventRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8929684424263789665L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IdentifierRemovedFromListEventRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"fields\":[{\"name\":\"Id\",\"type\":{\"type\":\"record\",\"name\":\"Id\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IdentifierRemovedFromListEventRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IdentifierRemovedFromListEventRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<IdentifierRemovedFromListEventRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<IdentifierRemovedFromListEventRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<IdentifierRemovedFromListEventRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this IdentifierRemovedFromListEventRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a IdentifierRemovedFromListEventRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a IdentifierRemovedFromListEventRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static IdentifierRemovedFromListEventRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.skaria.avro.model.Id Id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IdentifierRemovedFromListEventRecord() {}

  /**
   * All-args constructor.
   * @param Id The new value for Id
   */
  public IdentifierRemovedFromListEventRecord(com.skaria.avro.model.Id Id) {
    this.Id = Id;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Id;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Id = (com.skaria.avro.model.Id)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Id' field.
   * @return The value of the 'Id' field.
   */
  public com.skaria.avro.model.Id getId() {
    return Id;
  }

  /**
   * Gets the value of the 'Id' field as an Optional&lt;com.skaria.avro.model.Id&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Id&gt;.
   */
  public Optional<com.skaria.avro.model.Id> getOptionalId() {
    return Optional.<com.skaria.avro.model.Id>ofNullable(Id);
  }

  /**
   * Sets the value of the 'Id' field.
   * @param value the value to set.
   */
  public void setId(com.skaria.avro.model.Id value) {
    this.Id = value;
  }

  /**
   * Creates a new IdentifierRemovedFromListEventRecord RecordBuilder.
   * @return A new IdentifierRemovedFromListEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder();
  }

  /**
   * Creates a new IdentifierRemovedFromListEventRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IdentifierRemovedFromListEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder(other);
    }
  }

  /**
   * Creates a new IdentifierRemovedFromListEventRecord RecordBuilder by copying an existing IdentifierRemovedFromListEventRecord instance.
   * @param other The existing instance to copy.
   * @return A new IdentifierRemovedFromListEventRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for IdentifierRemovedFromListEventRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IdentifierRemovedFromListEventRecord>
    implements org.apache.avro.data.RecordBuilder<IdentifierRemovedFromListEventRecord> {

    private com.skaria.avro.model.Id Id;
    private com.skaria.avro.model.Id.Builder IdBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Id)) {
        this.Id = data().deepCopy(fields()[0].schema(), other.Id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasIdBuilder()) {
        this.IdBuilder = com.skaria.avro.model.Id.newBuilder(other.getIdBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing IdentifierRemovedFromListEventRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Id)) {
        this.Id = data().deepCopy(fields()[0].schema(), other.Id);
        fieldSetFlags()[0] = true;
      }
      this.IdBuilder = null;
    }

    /**
      * Gets the value of the 'Id' field.
      * @return The value.
      */
    public com.skaria.avro.model.Id getId() {
      return Id;
    }

    /**
      * Gets the value of the 'Id' field as an Optional&lt;com.skaria.avro.model.Id&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Id&gt;.
      */
    public Optional<com.skaria.avro.model.Id> getOptionalId() {
      return Optional.<com.skaria.avro.model.Id>ofNullable(Id);
    }

    /**
      * Sets the value of the 'Id' field.
      * @param value The value of 'Id'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder setId(com.skaria.avro.model.Id value) {
      validate(fields()[0], value);
      this.IdBuilder = null;
      this.Id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Id' field has been set.
      * @return True if the 'Id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'Id' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.Id.Builder getIdBuilder() {
      if (IdBuilder == null) {
        if (hasId()) {
          setIdBuilder(com.skaria.avro.model.Id.newBuilder(Id));
        } else {
          setIdBuilder(com.skaria.avro.model.Id.newBuilder());
        }
      }
      return IdBuilder;
    }

    /**
     * Sets the Builder instance for the 'Id' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder setIdBuilder(com.skaria.avro.model.Id.Builder value) {
      clearId();
      IdBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Id' field has an active Builder instance
     * @return True if the 'Id' field has an active Builder instance
     */
    public boolean hasIdBuilder() {
      return IdBuilder != null;
    }

    /**
      * Clears the value of the 'Id' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.IdentifierRemovedFromListEventRecord.Builder clearId() {
      Id = null;
      IdBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IdentifierRemovedFromListEventRecord build() {
      try {
        IdentifierRemovedFromListEventRecord record = new IdentifierRemovedFromListEventRecord();
        if (IdBuilder != null) {
          try {
            record.Id = this.IdBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Id"));
            throw e;
          }
        } else {
          record.Id = fieldSetFlags()[0] ? this.Id : (com.skaria.avro.model.Id) defaultValue(fields()[0]);
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
  private static final org.apache.avro.io.DatumWriter<IdentifierRemovedFromListEventRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<IdentifierRemovedFromListEventRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IdentifierRemovedFromListEventRecord>
    READER$ = (org.apache.avro.io.DatumReader<IdentifierRemovedFromListEventRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.Id.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.Id == null) {
        this.Id = new com.skaria.avro.model.Id();
      }
      this.Id.customDecode(in);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.Id == null) {
            this.Id = new com.skaria.avro.model.Id();
          }
          this.Id.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










