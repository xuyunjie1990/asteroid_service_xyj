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
 * 工资纳税标准等级
 */
public class TaxLevelThrift implements org.apache.thrift.TBase<TaxLevelThrift, TaxLevelThrift._Fields>, java.io.Serializable, Cloneable, Comparable<TaxLevelThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaxLevelThrift");

  private static final org.apache.thrift.protocol.TField TAX_RATE_FIELD_DESC = new org.apache.thrift.protocol.TField("taxRate", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField SALARY_START_FIELD_DESC = new org.apache.thrift.protocol.TField("salaryStart", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SALARY_END_FIELD_DESC = new org.apache.thrift.protocol.TField("salaryEnd", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField QUICK_DEDUCTION_FIELD_DESC = new org.apache.thrift.protocol.TField("quickDeduction", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaxLevelThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaxLevelThriftTupleSchemeFactory());
  }

  public double taxRate; // required
  public int salaryStart; // required
  public long updateTime; // required
  public int salaryEnd; // required
  public int id; // required
  public int quickDeduction; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TAX_RATE((short)1, "taxRate"),
    SALARY_START((short)2, "salaryStart"),
    UPDATE_TIME((short)3, "updateTime"),
    SALARY_END((short)4, "salaryEnd"),
    ID((short)5, "id"),
    QUICK_DEDUCTION((short)6, "quickDeduction");

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
        case 1: // TAX_RATE
          return TAX_RATE;
        case 2: // SALARY_START
          return SALARY_START;
        case 3: // UPDATE_TIME
          return UPDATE_TIME;
        case 4: // SALARY_END
          return SALARY_END;
        case 5: // ID
          return ID;
        case 6: // QUICK_DEDUCTION
          return QUICK_DEDUCTION;
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
  private static final int __TAXRATE_ISSET_ID = 0;
  private static final int __SALARYSTART_ISSET_ID = 1;
  private static final int __UPDATETIME_ISSET_ID = 2;
  private static final int __SALARYEND_ISSET_ID = 3;
  private static final int __ID_ISSET_ID = 4;
  private static final int __QUICKDEDUCTION_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TAX_RATE, new org.apache.thrift.meta_data.FieldMetaData("taxRate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SALARY_START, new org.apache.thrift.meta_data.FieldMetaData("salaryStart", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SALARY_END, new org.apache.thrift.meta_data.FieldMetaData("salaryEnd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QUICK_DEDUCTION, new org.apache.thrift.meta_data.FieldMetaData("quickDeduction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaxLevelThrift.class, metaDataMap);
  }

  public TaxLevelThrift() {
  }

  public TaxLevelThrift(
    double taxRate,
    int salaryStart,
    long updateTime,
    int salaryEnd,
    int id,
    int quickDeduction)
  {
    this();
    this.taxRate = taxRate;
    setTaxRateIsSet(true);
    this.salaryStart = salaryStart;
    setSalaryStartIsSet(true);
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    this.salaryEnd = salaryEnd;
    setSalaryEndIsSet(true);
    this.id = id;
    setIdIsSet(true);
    this.quickDeduction = quickDeduction;
    setQuickDeductionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaxLevelThrift(TaxLevelThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.taxRate = other.taxRate;
    this.salaryStart = other.salaryStart;
    this.updateTime = other.updateTime;
    this.salaryEnd = other.salaryEnd;
    this.id = other.id;
    this.quickDeduction = other.quickDeduction;
  }

  public TaxLevelThrift deepCopy() {
    return new TaxLevelThrift(this);
  }

  @Override
  public void clear() {
    setTaxRateIsSet(false);
    this.taxRate = 0.0;
    setSalaryStartIsSet(false);
    this.salaryStart = 0;
    setUpdateTimeIsSet(false);
    this.updateTime = 0;
    setSalaryEndIsSet(false);
    this.salaryEnd = 0;
    setIdIsSet(false);
    this.id = 0;
    setQuickDeductionIsSet(false);
    this.quickDeduction = 0;
  }

  public double getTaxRate() {
    return this.taxRate;
  }

  public TaxLevelThrift setTaxRate(double taxRate) {
    this.taxRate = taxRate;
    setTaxRateIsSet(true);
    return this;
  }

  public void unsetTaxRate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TAXRATE_ISSET_ID);
  }

  /** Returns true if field taxRate is set (has been assigned a value) and false otherwise */
  public boolean isSetTaxRate() {
    return EncodingUtils.testBit(__isset_bitfield, __TAXRATE_ISSET_ID);
  }

  public void setTaxRateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TAXRATE_ISSET_ID, value);
  }

  public int getSalaryStart() {
    return this.salaryStart;
  }

  public TaxLevelThrift setSalaryStart(int salaryStart) {
    this.salaryStart = salaryStart;
    setSalaryStartIsSet(true);
    return this;
  }

  public void unsetSalaryStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SALARYSTART_ISSET_ID);
  }

  /** Returns true if field salaryStart is set (has been assigned a value) and false otherwise */
  public boolean isSetSalaryStart() {
    return EncodingUtils.testBit(__isset_bitfield, __SALARYSTART_ISSET_ID);
  }

  public void setSalaryStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SALARYSTART_ISSET_ID, value);
  }

  public long getUpdateTime() {
    return this.updateTime;
  }

  public TaxLevelThrift setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    return this;
  }

  public void unsetUpdateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  public void setUpdateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATETIME_ISSET_ID, value);
  }

  public int getSalaryEnd() {
    return this.salaryEnd;
  }

  public TaxLevelThrift setSalaryEnd(int salaryEnd) {
    this.salaryEnd = salaryEnd;
    setSalaryEndIsSet(true);
    return this;
  }

  public void unsetSalaryEnd() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SALARYEND_ISSET_ID);
  }

  /** Returns true if field salaryEnd is set (has been assigned a value) and false otherwise */
  public boolean isSetSalaryEnd() {
    return EncodingUtils.testBit(__isset_bitfield, __SALARYEND_ISSET_ID);
  }

  public void setSalaryEndIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SALARYEND_ISSET_ID, value);
  }

  public int getId() {
    return this.id;
  }

  public TaxLevelThrift setId(int id) {
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

  public int getQuickDeduction() {
    return this.quickDeduction;
  }

  public TaxLevelThrift setQuickDeduction(int quickDeduction) {
    this.quickDeduction = quickDeduction;
    setQuickDeductionIsSet(true);
    return this;
  }

  public void unsetQuickDeduction() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUICKDEDUCTION_ISSET_ID);
  }

  /** Returns true if field quickDeduction is set (has been assigned a value) and false otherwise */
  public boolean isSetQuickDeduction() {
    return EncodingUtils.testBit(__isset_bitfield, __QUICKDEDUCTION_ISSET_ID);
  }

  public void setQuickDeductionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUICKDEDUCTION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TAX_RATE:
      if (value == null) {
        unsetTaxRate();
      } else {
        setTaxRate((Double)value);
      }
      break;

    case SALARY_START:
      if (value == null) {
        unsetSalaryStart();
      } else {
        setSalaryStart((Integer)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((Long)value);
      }
      break;

    case SALARY_END:
      if (value == null) {
        unsetSalaryEnd();
      } else {
        setSalaryEnd((Integer)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case QUICK_DEDUCTION:
      if (value == null) {
        unsetQuickDeduction();
      } else {
        setQuickDeduction((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TAX_RATE:
      return Double.valueOf(getTaxRate());

    case SALARY_START:
      return Integer.valueOf(getSalaryStart());

    case UPDATE_TIME:
      return Long.valueOf(getUpdateTime());

    case SALARY_END:
      return Integer.valueOf(getSalaryEnd());

    case ID:
      return Integer.valueOf(getId());

    case QUICK_DEDUCTION:
      return Integer.valueOf(getQuickDeduction());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TAX_RATE:
      return isSetTaxRate();
    case SALARY_START:
      return isSetSalaryStart();
    case UPDATE_TIME:
      return isSetUpdateTime();
    case SALARY_END:
      return isSetSalaryEnd();
    case ID:
      return isSetId();
    case QUICK_DEDUCTION:
      return isSetQuickDeduction();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaxLevelThrift)
      return this.equals((TaxLevelThrift)that);
    return false;
  }

  public boolean equals(TaxLevelThrift that) {
    if (that == null)
      return false;

    boolean this_present_taxRate = true;
    boolean that_present_taxRate = true;
    if (this_present_taxRate || that_present_taxRate) {
      if (!(this_present_taxRate && that_present_taxRate))
        return false;
      if (this.taxRate != that.taxRate)
        return false;
    }

    boolean this_present_salaryStart = true;
    boolean that_present_salaryStart = true;
    if (this_present_salaryStart || that_present_salaryStart) {
      if (!(this_present_salaryStart && that_present_salaryStart))
        return false;
      if (this.salaryStart != that.salaryStart)
        return false;
    }

    boolean this_present_updateTime = true;
    boolean that_present_updateTime = true;
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (this.updateTime != that.updateTime)
        return false;
    }

    boolean this_present_salaryEnd = true;
    boolean that_present_salaryEnd = true;
    if (this_present_salaryEnd || that_present_salaryEnd) {
      if (!(this_present_salaryEnd && that_present_salaryEnd))
        return false;
      if (this.salaryEnd != that.salaryEnd)
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_quickDeduction = true;
    boolean that_present_quickDeduction = true;
    if (this_present_quickDeduction || that_present_quickDeduction) {
      if (!(this_present_quickDeduction && that_present_quickDeduction))
        return false;
      if (this.quickDeduction != that.quickDeduction)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TaxLevelThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaxRate()).compareTo(other.isSetTaxRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaxRate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taxRate, other.taxRate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSalaryStart()).compareTo(other.isSetSalaryStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSalaryStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.salaryStart, other.salaryStart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSalaryEnd()).compareTo(other.isSetSalaryEnd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSalaryEnd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.salaryEnd, other.salaryEnd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetQuickDeduction()).compareTo(other.isSetQuickDeduction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuickDeduction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.quickDeduction, other.quickDeduction);
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
    StringBuilder sb = new StringBuilder("TaxLevelThrift(");
    boolean first = true;

    sb.append("taxRate:");
    sb.append(this.taxRate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("salaryStart:");
    sb.append(this.salaryStart);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateTime:");
    sb.append(this.updateTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("salaryEnd:");
    sb.append(this.salaryEnd);
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("quickDeduction:");
    sb.append(this.quickDeduction);
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

  private static class TaxLevelThriftStandardSchemeFactory implements SchemeFactory {
    public TaxLevelThriftStandardScheme getScheme() {
      return new TaxLevelThriftStandardScheme();
    }
  }

  private static class TaxLevelThriftStandardScheme extends StandardScheme<TaxLevelThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaxLevelThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TAX_RATE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.taxRate = iprot.readDouble();
              struct.setTaxRateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SALARY_START
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.salaryStart = iprot.readI32();
              struct.setSalaryStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updateTime = iprot.readI64();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SALARY_END
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.salaryEnd = iprot.readI32();
              struct.setSalaryEndIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // QUICK_DEDUCTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.quickDeduction = iprot.readI32();
              struct.setQuickDeductionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaxLevelThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TAX_RATE_FIELD_DESC);
      oprot.writeDouble(struct.taxRate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SALARY_START_FIELD_DESC);
      oprot.writeI32(struct.salaryStart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
      oprot.writeI64(struct.updateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SALARY_END_FIELD_DESC);
      oprot.writeI32(struct.salaryEnd);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUICK_DEDUCTION_FIELD_DESC);
      oprot.writeI32(struct.quickDeduction);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaxLevelThriftTupleSchemeFactory implements SchemeFactory {
    public TaxLevelThriftTupleScheme getScheme() {
      return new TaxLevelThriftTupleScheme();
    }
  }

  private static class TaxLevelThriftTupleScheme extends TupleScheme<TaxLevelThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaxLevelThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaxRate()) {
        optionals.set(0);
      }
      if (struct.isSetSalaryStart()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(2);
      }
      if (struct.isSetSalaryEnd()) {
        optionals.set(3);
      }
      if (struct.isSetId()) {
        optionals.set(4);
      }
      if (struct.isSetQuickDeduction()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTaxRate()) {
        oprot.writeDouble(struct.taxRate);
      }
      if (struct.isSetSalaryStart()) {
        oprot.writeI32(struct.salaryStart);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeI64(struct.updateTime);
      }
      if (struct.isSetSalaryEnd()) {
        oprot.writeI32(struct.salaryEnd);
      }
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetQuickDeduction()) {
        oprot.writeI32(struct.quickDeduction);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaxLevelThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.taxRate = iprot.readDouble();
        struct.setTaxRateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.salaryStart = iprot.readI32();
        struct.setSalaryStartIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateTime = iprot.readI64();
        struct.setUpdateTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.salaryEnd = iprot.readI32();
        struct.setSalaryEndIsSet(true);
      }
      if (incoming.get(4)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.quickDeduction = iprot.readI32();
        struct.setQuickDeductionIsSet(true);
      }
    }
  }

}

