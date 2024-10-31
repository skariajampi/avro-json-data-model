/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model.model.sourcealigned;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class SourcePerson extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7388800082704708004L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SourcePerson\",\"namespace\":\"com.skaria.avro.model.model.sourcealigned\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"taxStatus\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SourcePerson> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SourcePerson> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SourcePerson> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SourcePerson> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SourcePerson> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SourcePerson to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SourcePerson from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SourcePerson instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SourcePerson fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String name;
  private java.lang.String middlename;
  private int age;
  private java.lang.String taxStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SourcePerson() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param middlename The new value for middlename
   * @param age The new value for age
   * @param taxStatus The new value for taxStatus
   */
  public SourcePerson(java.lang.String name, java.lang.String middlename, java.lang.Integer age, java.lang.String taxStatus) {
    this.name = name;
    this.middlename = middlename;
    this.age = age;
    this.taxStatus = taxStatus;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return middlename;
    case 2: return age;
    case 3: return taxStatus;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = value$ != null ? value$.toString() : null; break;
    case 1: middlename = value$ != null ? value$.toString() : null; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: taxStatus = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Gets the value of the 'name' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalName() {
    return Optional.<java.lang.String>ofNullable(name);
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'middlename' field.
   * @return The value of the 'middlename' field.
   */
  public java.lang.String getMiddlename() {
    return middlename;
  }

  /**
   * Gets the value of the 'middlename' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalMiddlename() {
    return Optional.<java.lang.String>ofNullable(middlename);
  }

  /**
   * Sets the value of the 'middlename' field.
   * @param value the value to set.
   */
  public void setMiddlename(java.lang.String value) {
    this.middlename = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public int getAge() {
    return age;
  }

  /**
   * Gets the value of the 'age' field as an Optional&lt;java.lang.Integer&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
   */
  public Optional<java.lang.Integer> getOptionalAge() {
    return Optional.<java.lang.Integer>ofNullable(age);
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'taxStatus' field.
   * @return The value of the 'taxStatus' field.
   */
  public java.lang.String getTaxStatus() {
    return taxStatus;
  }

  /**
   * Gets the value of the 'taxStatus' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalTaxStatus() {
    return Optional.<java.lang.String>ofNullable(taxStatus);
  }

  /**
   * Sets the value of the 'taxStatus' field.
   * @param value the value to set.
   */
  public void setTaxStatus(java.lang.String value) {
    this.taxStatus = value;
  }

  /**
   * Creates a new SourcePerson RecordBuilder.
   * @return A new SourcePerson RecordBuilder
   */
  public static com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder newBuilder() {
    return new com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder();
  }

  /**
   * Creates a new SourcePerson RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SourcePerson RecordBuilder
   */
  public static com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder newBuilder(com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder();
    } else {
      return new com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder(other);
    }
  }

  /**
   * Creates a new SourcePerson RecordBuilder by copying an existing SourcePerson instance.
   * @param other The existing instance to copy.
   * @return A new SourcePerson RecordBuilder
   */
  public static com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder newBuilder(com.skaria.avro.model.model.sourcealigned.SourcePerson other) {
    if (other == null) {
      return new com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder();
    } else {
      return new com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder(other);
    }
  }

  /**
   * RecordBuilder for SourcePerson instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SourcePerson>
    implements org.apache.avro.data.RecordBuilder<SourcePerson> {

    private java.lang.String name;
    private java.lang.String middlename;
    private int age;
    private java.lang.String taxStatus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.middlename)) {
        this.middlename = data().deepCopy(fields()[1].schema(), other.middlename);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.taxStatus)) {
        this.taxStatus = data().deepCopy(fields()[3].schema(), other.taxStatus);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing SourcePerson instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.model.sourcealigned.SourcePerson other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.middlename)) {
        this.middlename = data().deepCopy(fields()[1].schema(), other.middlename);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taxStatus)) {
        this.taxStatus = data().deepCopy(fields()[3].schema(), other.taxStatus);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Gets the value of the 'name' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalName() {
      return Optional.<java.lang.String>ofNullable(name);
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'middlename' field.
      * @return The value.
      */
    public java.lang.String getMiddlename() {
      return middlename;
    }

    /**
      * Gets the value of the 'middlename' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalMiddlename() {
      return Optional.<java.lang.String>ofNullable(middlename);
    }

    /**
      * Sets the value of the 'middlename' field.
      * @param value The value of 'middlename'.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder setMiddlename(java.lang.String value) {
      validate(fields()[1], value);
      this.middlename = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'middlename' field has been set.
      * @return True if the 'middlename' field has been set, false otherwise.
      */
    public boolean hasMiddlename() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'middlename' field.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder clearMiddlename() {
      middlename = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public int getAge() {
      return age;
    }

    /**
      * Gets the value of the 'age' field as an Optional&lt;java.lang.Integer&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Integer&gt;.
      */
    public Optional<java.lang.Integer> getOptionalAge() {
      return Optional.<java.lang.Integer>ofNullable(age);
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'taxStatus' field.
      * @return The value.
      */
    public java.lang.String getTaxStatus() {
      return taxStatus;
    }

    /**
      * Gets the value of the 'taxStatus' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalTaxStatus() {
      return Optional.<java.lang.String>ofNullable(taxStatus);
    }

    /**
      * Sets the value of the 'taxStatus' field.
      * @param value The value of 'taxStatus'.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder setTaxStatus(java.lang.String value) {
      validate(fields()[3], value);
      this.taxStatus = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'taxStatus' field has been set.
      * @return True if the 'taxStatus' field has been set, false otherwise.
      */
    public boolean hasTaxStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'taxStatus' field.
      * @return This builder.
      */
    public com.skaria.avro.model.model.sourcealigned.SourcePerson.Builder clearTaxStatus() {
      taxStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SourcePerson build() {
      try {
        SourcePerson record = new SourcePerson();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.middlename = fieldSetFlags()[1] ? this.middlename : (java.lang.String) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.taxStatus = fieldSetFlags()[3] ? this.taxStatus : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SourcePerson>
    WRITER$ = (org.apache.avro.io.DatumWriter<SourcePerson>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SourcePerson>
    READER$ = (org.apache.avro.io.DatumReader<SourcePerson>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.middlename == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.middlename);
    }

    out.writeInt(this.age);

    out.writeString(this.taxStatus);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.middlename = null;
      } else {
        this.middlename = in.readString();
      }

      this.age = in.readInt();

      this.taxStatus = in.readString();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.middlename = null;
          } else {
            this.middlename = in.readString();
          }
          break;

        case 2:
          this.age = in.readInt();
          break;

        case 3:
          this.taxStatus = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









