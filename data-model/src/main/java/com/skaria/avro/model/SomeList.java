/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.skaria.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class SomeList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9006484386967127449L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SomeList\",\"namespace\":\"com.skaria.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"record\",\"name\":\"SomeListId\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"middlename\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"age\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"action\",\"type\":{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"STOP\",\"GO\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SomeList> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SomeList> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SomeList> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SomeList> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SomeList> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SomeList to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SomeList from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SomeList instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SomeList fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.skaria.avro.model.SomeListId id;
  private java.lang.String firstName;
  private java.lang.String lastName;
  private java.lang.String middlename;
  private java.lang.String age;
  private com.skaria.avro.model.Action action;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SomeList() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param middlename The new value for middlename
   * @param age The new value for age
   * @param action The new value for action
   */
  public SomeList(com.skaria.avro.model.SomeListId id, java.lang.String firstName, java.lang.String lastName, java.lang.String middlename, java.lang.String age, com.skaria.avro.model.Action action) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middlename = middlename;
    this.age = age;
    this.action = action;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return firstName;
    case 2: return lastName;
    case 3: return middlename;
    case 4: return age;
    case 5: return action;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (com.skaria.avro.model.SomeListId)value$; break;
    case 1: firstName = value$ != null ? value$.toString() : null; break;
    case 2: lastName = value$ != null ? value$.toString() : null; break;
    case 3: middlename = value$ != null ? value$.toString() : null; break;
    case 4: age = value$ != null ? value$.toString() : null; break;
    case 5: action = (com.skaria.avro.model.Action)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public com.skaria.avro.model.SomeListId getId() {
    return id;
  }

  /**
   * Gets the value of the 'id' field as an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
   */
  public Optional<com.skaria.avro.model.SomeListId> getOptionalId() {
    return Optional.<com.skaria.avro.model.SomeListId>ofNullable(id);
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(com.skaria.avro.model.SomeListId value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.String getFirstName() {
    return firstName;
  }

  /**
   * Gets the value of the 'firstName' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalFirstName() {
    return Optional.<java.lang.String>ofNullable(firstName);
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.String value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.String getLastName() {
    return lastName;
  }

  /**
   * Gets the value of the 'lastName' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalLastName() {
    return Optional.<java.lang.String>ofNullable(lastName);
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.String value) {
    this.lastName = value;
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
  public java.lang.String getAge() {
    return age;
  }

  /**
   * Gets the value of the 'age' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalAge() {
    return Optional.<java.lang.String>ofNullable(age);
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.String value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'action' field.
   * @return The value of the 'action' field.
   */
  public com.skaria.avro.model.Action getAction() {
    return action;
  }

  /**
   * Gets the value of the 'action' field as an Optional&lt;com.skaria.avro.model.Action&gt;.
   * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Action&gt;.
   */
  public Optional<com.skaria.avro.model.Action> getOptionalAction() {
    return Optional.<com.skaria.avro.model.Action>ofNullable(action);
  }

  /**
   * Sets the value of the 'action' field.
   * @param value the value to set.
   */
  public void setAction(com.skaria.avro.model.Action value) {
    this.action = value;
  }

  /**
   * Creates a new SomeList RecordBuilder.
   * @return A new SomeList RecordBuilder
   */
  public static com.skaria.avro.model.SomeList.Builder newBuilder() {
    return new com.skaria.avro.model.SomeList.Builder();
  }

  /**
   * Creates a new SomeList RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SomeList RecordBuilder
   */
  public static com.skaria.avro.model.SomeList.Builder newBuilder(com.skaria.avro.model.SomeList.Builder other) {
    if (other == null) {
      return new com.skaria.avro.model.SomeList.Builder();
    } else {
      return new com.skaria.avro.model.SomeList.Builder(other);
    }
  }

  /**
   * Creates a new SomeList RecordBuilder by copying an existing SomeList instance.
   * @param other The existing instance to copy.
   * @return A new SomeList RecordBuilder
   */
  public static com.skaria.avro.model.SomeList.Builder newBuilder(com.skaria.avro.model.SomeList other) {
    if (other == null) {
      return new com.skaria.avro.model.SomeList.Builder();
    } else {
      return new com.skaria.avro.model.SomeList.Builder(other);
    }
  }

  /**
   * RecordBuilder for SomeList instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SomeList>
    implements org.apache.avro.data.RecordBuilder<SomeList> {

    private com.skaria.avro.model.SomeListId id;
    private com.skaria.avro.model.SomeListId.Builder idBuilder;
    private java.lang.String firstName;
    private java.lang.String lastName;
    private java.lang.String middlename;
    private java.lang.String age;
    private com.skaria.avro.model.Action action;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.skaria.avro.model.SomeList.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasIdBuilder()) {
        this.idBuilder = com.skaria.avro.model.SomeListId.newBuilder(other.getIdBuilder());
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.middlename)) {
        this.middlename = data().deepCopy(fields()[3].schema(), other.middlename);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.action)) {
        this.action = data().deepCopy(fields()[5].schema(), other.action);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing SomeList instance
     * @param other The existing instance to copy.
     */
    private Builder(com.skaria.avro.model.SomeList other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      this.idBuilder = null;
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.middlename)) {
        this.middlename = data().deepCopy(fields()[3].schema(), other.middlename);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.action)) {
        this.action = data().deepCopy(fields()[5].schema(), other.action);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public com.skaria.avro.model.SomeListId getId() {
      return id;
    }

    /**
      * Gets the value of the 'id' field as an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.SomeListId&gt;.
      */
    public Optional<com.skaria.avro.model.SomeListId> getOptionalId() {
      return Optional.<com.skaria.avro.model.SomeListId>ofNullable(id);
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder setId(com.skaria.avro.model.SomeListId value) {
      validate(fields()[0], value);
      this.idBuilder = null;
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'id' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.skaria.avro.model.SomeListId.Builder getIdBuilder() {
      if (idBuilder == null) {
        if (hasId()) {
          setIdBuilder(com.skaria.avro.model.SomeListId.newBuilder(id));
        } else {
          setIdBuilder(com.skaria.avro.model.SomeListId.newBuilder());
        }
      }
      return idBuilder;
    }

    /**
     * Sets the Builder instance for the 'id' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.skaria.avro.model.SomeList.Builder setIdBuilder(com.skaria.avro.model.SomeListId.Builder value) {
      clearId();
      idBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'id' field has an active Builder instance
     * @return True if the 'id' field has an active Builder instance
     */
    public boolean hasIdBuilder() {
      return idBuilder != null;
    }

    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearId() {
      id = null;
      idBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.String getFirstName() {
      return firstName;
    }

    /**
      * Gets the value of the 'firstName' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalFirstName() {
      return Optional.<java.lang.String>ofNullable(firstName);
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder setFirstName(java.lang.String value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.String getLastName() {
      return lastName;
    }

    /**
      * Gets the value of the 'lastName' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalLastName() {
      return Optional.<java.lang.String>ofNullable(lastName);
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder setLastName(java.lang.String value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
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
    public com.skaria.avro.model.SomeList.Builder setMiddlename(java.lang.String value) {
      validate(fields()[3], value);
      this.middlename = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'middlename' field has been set.
      * @return True if the 'middlename' field has been set, false otherwise.
      */
    public boolean hasMiddlename() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'middlename' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearMiddlename() {
      middlename = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.String getAge() {
      return age;
    }

    /**
      * Gets the value of the 'age' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalAge() {
      return Optional.<java.lang.String>ofNullable(age);
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder setAge(java.lang.String value) {
      validate(fields()[4], value);
      this.age = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearAge() {
      age = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'action' field.
      * @return The value.
      */
    public com.skaria.avro.model.Action getAction() {
      return action;
    }

    /**
      * Gets the value of the 'action' field as an Optional&lt;com.skaria.avro.model.Action&gt;.
      * @return The value wrapped in an Optional&lt;com.skaria.avro.model.Action&gt;.
      */
    public Optional<com.skaria.avro.model.Action> getOptionalAction() {
      return Optional.<com.skaria.avro.model.Action>ofNullable(action);
    }

    /**
      * Sets the value of the 'action' field.
      * @param value The value of 'action'.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder setAction(com.skaria.avro.model.Action value) {
      validate(fields()[5], value);
      this.action = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.skaria.avro.model.SomeList.Builder clearAction() {
      action = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SomeList build() {
      try {
        SomeList record = new SomeList();
        if (idBuilder != null) {
          try {
            record.id = this.idBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("id"));
            throw e;
          }
        } else {
          record.id = fieldSetFlags()[0] ? this.id : (com.skaria.avro.model.SomeListId) defaultValue(fields()[0]);
        }
        record.firstName = fieldSetFlags()[1] ? this.firstName : (java.lang.String) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.String) defaultValue(fields()[2]);
        record.middlename = fieldSetFlags()[3] ? this.middlename : (java.lang.String) defaultValue(fields()[3]);
        record.age = fieldSetFlags()[4] ? this.age : (java.lang.String) defaultValue(fields()[4]);
        record.action = fieldSetFlags()[5] ? this.action : (com.skaria.avro.model.Action) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SomeList>
    WRITER$ = (org.apache.avro.io.DatumWriter<SomeList>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SomeList>
    READER$ = (org.apache.avro.io.DatumReader<SomeList>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.id.customEncode(out);

    out.writeString(this.firstName);

    out.writeString(this.lastName);

    if (this.middlename == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.middlename);
    }

    if (this.age == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.age);
    }

    out.writeEnum(this.action.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.id == null) {
        this.id = new com.skaria.avro.model.SomeListId();
      }
      this.id.customDecode(in);

      this.firstName = in.readString();

      this.lastName = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.middlename = null;
      } else {
        this.middlename = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.age = null;
      } else {
        this.age = in.readString();
      }

      this.action = com.skaria.avro.model.Action.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.id == null) {
            this.id = new com.skaria.avro.model.SomeListId();
          }
          this.id.customDecode(in);
          break;

        case 1:
          this.firstName = in.readString();
          break;

        case 2:
          this.lastName = in.readString();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.middlename = null;
          } else {
            this.middlename = in.readString();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.age = null;
          } else {
            this.age = in.readString();
          }
          break;

        case 5:
          this.action = com.skaria.avro.model.Action.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










