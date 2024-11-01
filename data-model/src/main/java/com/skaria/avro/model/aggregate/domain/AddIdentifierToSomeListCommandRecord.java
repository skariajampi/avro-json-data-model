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
public class AddIdentifierToSomeListCommandRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3349281910722512349L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AddIdentifierToSomeListCommandRecord\",\"namespace\":\"com.skaria.avro.model.aggregate.domain\",\"fields\":[{\"name\":\"someList\",\"type\":{\"type\":\"record\",\"name\":\"SomeList\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"record\",\"name\":\"SomeListId\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"STOP\",\"GO\"]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AddIdentifierToSomeListCommandRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AddIdentifierToSomeListCommandRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AddIdentifierToSomeListCommandRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AddIdentifierToSomeListCommandRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AddIdentifierToSomeListCommandRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AddIdentifierToSomeListCommandRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AddIdentifierToSomeListCommandRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AddIdentifierToSomeListCommandRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AddIdentifierToSomeListCommandRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.skaria.avro.model.SomeList someList;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AddIdentifierToSomeListCommandRecord() {}

  /**
   * All-args constructor.
   * @param someList The new value for someList
   */
  public AddIdentifierToSomeListCommandRecord(com.skaria.avro.model.SomeList someList) {
    this.someList = someList;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return someList;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: someList = (com.skaria.avro.model.SomeList)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'someList' field.
   * @return The value of the 'someList' field.
   */
  public com.skaria.avro.model.SomeList getSomeList() {
    return someList;
  }

  /**
   * Gets the value of the 'someList' field as an Optional&lt;com.skaria.avro.model.SomeList&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeList&gt;.
   */
  public Optional<com.skaria.avro.model.SomeList> getOptionalSomeList() {
    return Optional.<com.skaria.avro.model.SomeList>ofNullable(someList);
  }

  /**
   * Sets the value of the 'someList' field.
   * @param value the value to set.
   */
  public void setSomeList(com.skaria.avro.model.SomeList value) {
    this.someList = value;
  }

  /**
   * Creates a new AddIdentifierToSomeListCommandRecord RecordBuilder.
   * @return A new AddIdentifierToSomeListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder newBuilder() {
    return new com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder();
  }

  /**
   * Creates a new AddIdentifierToSomeListCommandRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AddIdentifierToSomeListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder(other);
    }
  }

  /**
   * Creates a new AddIdentifierToSomeListCommandRecord RecordBuilder by copying an existing AddIdentifierToSomeListCommandRecord instance.
   * @param other The existing instance to copy.
   * @return A new AddIdentifierToSomeListCommandRecord RecordBuilder
   */
  public static com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder newBuilder(com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord other) {
    if (other == null) {
      return new com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder();
    } else {
      return new com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for AddIdentifierToSomeListCommandRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AddIdentifierToSomeListCommandRecord>
    implements org.apache.avro.data.RecordBuilder<AddIdentifierToSomeListCommandRecord> {

    private com.skaria.avro.model.SomeList someList;
    private com.skaria.avro.model.SomeList.Builder someListBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.someList)) {
        this.someList = data().deepCopy(fields()[0].schema(), other.someList);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasSomeListBuilder()) {
        this.someListBuilder = com.skaria.avro.model.SomeList.newBuilder(other.getSomeListBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing AddIdentifierToSomeListCommandRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.someList)) {
        this.someList = data().deepCopy(fields()[0].schema(), other.someList);
        fieldSetFlags()[0] = true;
      }
      this.someListBuilder = null;
    }

    /**
      * Gets the value of the 'someList' field.
      * @return The value.
      */
    public com.skaria.avro.model.SomeList getSomeList() {
      return someList;
    }

    /**
      * Gets the value of the 'someList' field as an Optional&lt;com.skaria.avro.model.SomeList&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeList&gt;.
      */
    public Optional<com.skaria.avro.model.SomeList> getOptionalSomeList() {
      return Optional.<com.skaria.avro.model.SomeList>ofNullable(someList);
    }

    /**
      * Sets the value of the 'someList' field.
      * @param value The value of 'someList'.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder setSomeList(com.skaria.avro.model.SomeList value) {
      validate(fields()[0], value);
      this.someListBuilder = null;
      this.someList = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'someList' field has been set.
      * @return True if the 'someList' field has been set, false otherwise.
      */
    public boolean hasSomeList() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'someList' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.SomeList.Builder getSomeListBuilder() {
      if (someListBuilder == null) {
        if (hasSomeList()) {
          setSomeListBuilder(com.skaria.avro.model.SomeList.newBuilder(someList));
        } else {
          setSomeListBuilder(com.skaria.avro.model.SomeList.newBuilder());
        }
      }
      return someListBuilder;
    }

    /**
     * Sets the Builder instance for the 'someList' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder setSomeListBuilder(com.skaria.avro.model.SomeList.Builder value) {
      clearSomeList();
      someListBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'someList' field has an active Builder instance
     * @return True if the 'someList' field has an active Builder instance
     */
    public boolean hasSomeListBuilder() {
      return someListBuilder != null;
    }

    /**
      * Clears the value of the 'someList' field.
      * @return This builder.
      */
    public com.skaria.avro.model.aggregate.domain.AddIdentifierToSomeListCommandRecord.Builder clearSomeList() {
      someList = null;
      someListBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AddIdentifierToSomeListCommandRecord build() {
      try {
        AddIdentifierToSomeListCommandRecord record = new AddIdentifierToSomeListCommandRecord();
        if (someListBuilder != null) {
          try {
            record.someList = this.someListBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("someList"));
            throw e;
          }
        } else {
          record.someList = fieldSetFlags()[0] ? this.someList : (com.skaria.avro.model.SomeList) defaultValue(fields()[0]);
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
  private static final org.apache.avro.io.DatumWriter<AddIdentifierToSomeListCommandRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<AddIdentifierToSomeListCommandRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AddIdentifierToSomeListCommandRecord>
    READER$ = (org.apache.avro.io.DatumReader<AddIdentifierToSomeListCommandRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.someList.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.someList == null) {
        this.someList = new com.skaria.avro.model.SomeList();
      }
      this.someList.customDecode(in);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.someList == null) {
            this.someList = new com.skaria.avro.model.SomeList();
          }
          this.someList.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










