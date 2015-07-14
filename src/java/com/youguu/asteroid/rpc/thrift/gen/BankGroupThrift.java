/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.youguu.asteroid.rpc.thrift.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 银行分组信息service
 */
public class BankGroupThrift implements org.apache.thrift.TBase<BankGroupThrift, BankGroupThrift._Fields>, java.io.Serializable, Cloneable, Comparable<BankGroupThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BankGroupThrift");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("groupType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BANK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("bankId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BANK_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("bankCode", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BankGroupThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BankGroupThriftTupleSchemeFactory());
  }

  public int id; // required
  public int groupType; // required
  public int bankId; // required
  public String bankCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    GROUP_TYPE((short)2, "groupType"),
    BANK_ID((short)3, "bankId"),
    BANK_CODE((short)4, "bankCode");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // GROUP_TYPE
          return GROUP_TYPE;
        case 3: // BANK_ID
          return BANK_ID;
        case 4: // BANK_CODE
          return BANK_CODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __GROUPTYPE_ISSET_ID = 1;
  private static final int __BANKID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.GROUP_TYPE, new org.apache.thrift.meta_data.FieldMetaData("groupType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BANK_ID, new org.apache.thrift.meta_data.FieldMetaData("bankId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BANK_CODE, new org.apache.thrift.meta_data.FieldMetaData("bankCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BankGroupThrift.class, metaDataMap);
  }

  public BankGroupThrift() {
  }

  public BankGroupThrift(
    int id,
    int groupType,
    int bankId,
    String bankCode)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.groupType = groupType;
    setGroupTypeIsSet(true);
    this.bankId = bankId;
    setBankIdIsSet(true);
    this.bankCode = bankCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BankGroupThrift(BankGroupThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.groupType = other.groupType;
    this.bankId = other.bankId;
    if (other.isSetBankCode()) {
      this.bankCode = other.bankCode;
    }
  }

  public BankGroupThrift deepCopy() {
    return new BankGroupThrift(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setGroupTypeIsSet(false);
    this.groupType = 0;
    setBankIdIsSet(false);
    this.bankId = 0;
    this.bankCode = null;
  }

  public int getId() {
    return this.id;
  }

  public BankGroupThrift setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getGroupType() {
    return this.groupType;
  }

  public BankGroupThrift setGroupType(int groupType) {
    this.groupType = groupType;
    setGroupTypeIsSet(true);
    return this;
  }

  public void unsetGroupType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GROUPTYPE_ISSET_ID);
  }

  /** Returns true if field groupType is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupType() {
    return EncodingUtils.testBit(__isset_bitfield, __GROUPTYPE_ISSET_ID);
  }

  public void setGroupTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GROUPTYPE_ISSET_ID, value);
  }

  public int getBankId() {
    return this.bankId;
  }

  public BankGroupThrift setBankId(int bankId) {
    this.bankId = bankId;
    setBankIdIsSet(true);
    return this;
  }

  public void unsetBankId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BANKID_ISSET_ID);
  }

  /** Returns true if field bankId is set (has been assigned a value) and false otherwise */
  public boolean isSetBankId() {
    return EncodingUtils.testBit(__isset_bitfield, __BANKID_ISSET_ID);
  }

  public void setBankIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BANKID_ISSET_ID, value);
  }

  public String getBankCode() {
    return this.bankCode;
  }

  public BankGroupThrift setBankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  public void unsetBankCode() {
    this.bankCode = null;
  }

  /** Returns true if field bankCode is set (has been assigned a value) and false otherwise */
  public boolean isSetBankCode() {
    return this.bankCode != null;
  }

  public void setBankCodeIsSet(boolean value) {
    if (!value) {
      this.bankCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case GROUP_TYPE:
      if (value == null) {
        unsetGroupType();
      } else {
        setGroupType((Integer)value);
      }
      break;

    case BANK_ID:
      if (value == null) {
        unsetBankId();
      } else {
        setBankId((Integer)value);
      }
      break;

    case BANK_CODE:
      if (value == null) {
        unsetBankCode();
      } else {
        setBankCode((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case GROUP_TYPE:
      return Integer.valueOf(getGroupType());

    case BANK_ID:
      return Integer.valueOf(getBankId());

    case BANK_CODE:
      return getBankCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case GROUP_TYPE:
      return isSetGroupType();
    case BANK_ID:
      return isSetBankId();
    case BANK_CODE:
      return isSetBankCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BankGroupThrift)
      return this.equals((BankGroupThrift)that);
    return false;
  }

  public boolean equals(BankGroupThrift that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_groupType = true;
    boolean that_present_groupType = true;
    if (this_present_groupType || that_present_groupType) {
      if (!(this_present_groupType && that_present_groupType))
        return false;
      if (this.groupType != that.groupType)
        return false;
    }

    boolean this_present_bankId = true;
    boolean that_present_bankId = true;
    if (this_present_bankId || that_present_bankId) {
      if (!(this_present_bankId && that_present_bankId))
        return false;
      if (this.bankId != that.bankId)
        return false;
    }

    boolean this_present_bankCode = true && this.isSetBankCode();
    boolean that_present_bankCode = true && that.isSetBankCode();
    if (this_present_bankCode || that_present_bankCode) {
      if (!(this_present_bankCode && that_present_bankCode))
        return false;
      if (!this.bankCode.equals(that.bankCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BankGroupThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupType()).compareTo(other.isSetGroupType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupType, other.groupType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBankId()).compareTo(other.isSetBankId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBankId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankId, other.bankId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBankCode()).compareTo(other.isSetBankCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBankCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankCode, other.bankCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BankGroupThrift(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupType:");
    sb.append(this.groupType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bankId:");
    sb.append(this.bankId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bankCode:");
    if (this.bankCode == null) {
      sb.append("null");
    } else {
      sb.append(this.bankCode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BankGroupThriftStandardSchemeFactory implements SchemeFactory {
    public BankGroupThriftStandardScheme getScheme() {
      return new BankGroupThriftStandardScheme();
    }
  }

  private static class BankGroupThriftStandardScheme extends StandardScheme<BankGroupThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BankGroupThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.groupType = iprot.readI32();
              struct.setGroupTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BANK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bankId = iprot.readI32();
              struct.setBankIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BANK_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bankCode = iprot.readString();
              struct.setBankCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BankGroupThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GROUP_TYPE_FIELD_DESC);
      oprot.writeI32(struct.groupType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BANK_ID_FIELD_DESC);
      oprot.writeI32(struct.bankId);
      oprot.writeFieldEnd();
      if (struct.bankCode != null) {
        oprot.writeFieldBegin(BANK_CODE_FIELD_DESC);
        oprot.writeString(struct.bankCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BankGroupThriftTupleSchemeFactory implements SchemeFactory {
    public BankGroupThriftTupleScheme getScheme() {
      return new BankGroupThriftTupleScheme();
    }
  }

  private static class BankGroupThriftTupleScheme extends TupleScheme<BankGroupThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BankGroupThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetGroupType()) {
        optionals.set(1);
      }
      if (struct.isSetBankId()) {
        optionals.set(2);
      }
      if (struct.isSetBankCode()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetGroupType()) {
        oprot.writeI32(struct.groupType);
      }
      if (struct.isSetBankId()) {
        oprot.writeI32(struct.bankId);
      }
      if (struct.isSetBankCode()) {
        oprot.writeString(struct.bankCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BankGroupThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.groupType = iprot.readI32();
        struct.setGroupTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bankId = iprot.readI32();
        struct.setBankIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.bankCode = iprot.readString();
        struct.setBankCodeIsSet(true);
      }
    }
  }

}

