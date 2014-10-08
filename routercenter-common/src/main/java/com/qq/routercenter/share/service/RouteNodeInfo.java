/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.qq.routercenter.share.service;

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

public class RouteNodeInfo implements org.apache.thrift.TBase<RouteNodeInfo, RouteNodeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RouteNodeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RouteNodeInfo");

  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SERVICE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceURL", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SID_FIELD_DESC = new org.apache.thrift.protocol.TField("sid", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RouteNodeInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RouteNodeInfoTupleSchemeFactory());
  }

  public String host; // required
  public int port; // required
  public String serviceURL; // optional
  public int weight; // optional
  public String sid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST((short)1, "host"),
    PORT((short)2, "port"),
    SERVICE_URL((short)3, "serviceURL"),
    WEIGHT((short)4, "weight"),
    SID((short)5, "sid");

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
        case 1: // HOST
          return HOST;
        case 2: // PORT
          return PORT;
        case 3: // SERVICE_URL
          return SERVICE_URL;
        case 4: // WEIGHT
          return WEIGHT;
        case 5: // SID
          return SID;
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
  private static final int __PORT_ISSET_ID = 0;
  private static final int __WEIGHT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.SERVICE_URL,_Fields.WEIGHT,_Fields.SID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.SERVICE_URL, new org.apache.thrift.meta_data.FieldMetaData("serviceURL", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.SID, new org.apache.thrift.meta_data.FieldMetaData("sid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RouteNodeInfo.class, metaDataMap);
  }

  public RouteNodeInfo() {
    this.weight = 100;

  }

  public RouteNodeInfo(
    String host,
    int port)
  {
    this();
    this.host = host;
    this.port = port;
    setPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RouteNodeInfo(RouteNodeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHost()) {
      this.host = other.host;
    }
    this.port = other.port;
    if (other.isSetServiceURL()) {
      this.serviceURL = other.serviceURL;
    }
    this.weight = other.weight;
    if (other.isSetSid()) {
      this.sid = other.sid;
    }
  }

  public RouteNodeInfo deepCopy() {
    return new RouteNodeInfo(this);
  }

  @Override
  public void clear() {
    this.host = null;
    setPortIsSet(false);
    this.port = 0;
    this.serviceURL = null;
    this.weight = 100;

    this.sid = null;
  }

  public String getHost() {
    return this.host;
  }

  public RouteNodeInfo setHost(String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public RouteNodeInfo setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public String getServiceURL() {
    return this.serviceURL;
  }

  public RouteNodeInfo setServiceURL(String serviceURL) {
    this.serviceURL = serviceURL;
    return this;
  }

  public void unsetServiceURL() {
    this.serviceURL = null;
  }

  /** Returns true if field serviceURL is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceURL() {
    return this.serviceURL != null;
  }

  public void setServiceURLIsSet(boolean value) {
    if (!value) {
      this.serviceURL = null;
    }
  }

  public int getWeight() {
    return this.weight;
  }

  public RouteNodeInfo setWeight(int weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public String getSid() {
    return this.sid;
  }

  public RouteNodeInfo setSid(String sid) {
    this.sid = sid;
    return this;
  }

  public void unsetSid() {
    this.sid = null;
  }

  /** Returns true if field sid is set (has been assigned a value) and false otherwise */
  public boolean isSetSid() {
    return this.sid != null;
  }

  public void setSidIsSet(boolean value) {
    if (!value) {
      this.sid = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Integer)value);
      }
      break;

    case SERVICE_URL:
      if (value == null) {
        unsetServiceURL();
      } else {
        setServiceURL((String)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Integer)value);
      }
      break;

    case SID:
      if (value == null) {
        unsetSid();
      } else {
        setSid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST:
      return getHost();

    case PORT:
      return Integer.valueOf(getPort());

    case SERVICE_URL:
      return getServiceURL();

    case WEIGHT:
      return Integer.valueOf(getWeight());

    case SID:
      return getSid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOST:
      return isSetHost();
    case PORT:
      return isSetPort();
    case SERVICE_URL:
      return isSetServiceURL();
    case WEIGHT:
      return isSetWeight();
    case SID:
      return isSetSid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RouteNodeInfo)
      return this.equals((RouteNodeInfo)that);
    return false;
  }

  public boolean equals(RouteNodeInfo that) {
    if (that == null)
      return false;

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_serviceURL = true && this.isSetServiceURL();
    boolean that_present_serviceURL = true && that.isSetServiceURL();
    if (this_present_serviceURL || that_present_serviceURL) {
      if (!(this_present_serviceURL && that_present_serviceURL))
        return false;
      if (!this.serviceURL.equals(that.serviceURL))
        return false;
    }

    boolean this_present_weight = true && this.isSetWeight();
    boolean that_present_weight = true && that.isSetWeight();
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    boolean this_present_sid = true && this.isSetSid();
    boolean that_present_sid = true && that.isSetSid();
    if (this_present_sid || that_present_sid) {
      if (!(this_present_sid && that_present_sid))
        return false;
      if (!this.sid.equals(that.sid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(RouteNodeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceURL()).compareTo(other.isSetServiceURL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceURL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceURL, other.serviceURL);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSid()).compareTo(other.isSetSid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sid, other.sid);
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
    StringBuilder sb = new StringBuilder("RouteNodeInfo(");
    boolean first = true;

    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (isSetServiceURL()) {
      if (!first) sb.append(", ");
      sb.append("serviceURL:");
      if (this.serviceURL == null) {
        sb.append("null");
      } else {
        sb.append(this.serviceURL);
      }
      first = false;
    }
    if (isSetWeight()) {
      if (!first) sb.append(", ");
      sb.append("weight:");
      sb.append(this.weight);
      first = false;
    }
    if (isSetSid()) {
      if (!first) sb.append(", ");
      sb.append("sid:");
      if (this.sid == null) {
        sb.append("null");
      } else {
        sb.append(this.sid);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (host == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'host' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'port' because it's a primitive and you chose the non-beans generator.
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

  private static class RouteNodeInfoStandardSchemeFactory implements SchemeFactory {
    public RouteNodeInfoStandardScheme getScheme() {
      return new RouteNodeInfoStandardScheme();
    }
  }

  private static class RouteNodeInfoStandardScheme extends StandardScheme<RouteNodeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RouteNodeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERVICE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceURL = iprot.readString();
              struct.setServiceURLIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.weight = iprot.readI32();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sid = iprot.readString();
              struct.setSidIsSet(true);
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
      if (!struct.isSetPort()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'port' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RouteNodeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.serviceURL != null) {
        if (struct.isSetServiceURL()) {
          oprot.writeFieldBegin(SERVICE_URL_FIELD_DESC);
          oprot.writeString(struct.serviceURL);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWeight()) {
        oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
        oprot.writeI32(struct.weight);
        oprot.writeFieldEnd();
      }
      if (struct.sid != null) {
        if (struct.isSetSid()) {
          oprot.writeFieldBegin(SID_FIELD_DESC);
          oprot.writeString(struct.sid);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RouteNodeInfoTupleSchemeFactory implements SchemeFactory {
    public RouteNodeInfoTupleScheme getScheme() {
      return new RouteNodeInfoTupleScheme();
    }
  }

  private static class RouteNodeInfoTupleScheme extends TupleScheme<RouteNodeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RouteNodeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.host);
      oprot.writeI32(struct.port);
      BitSet optionals = new BitSet();
      if (struct.isSetServiceURL()) {
        optionals.set(0);
      }
      if (struct.isSetWeight()) {
        optionals.set(1);
      }
      if (struct.isSetSid()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetServiceURL()) {
        oprot.writeString(struct.serviceURL);
      }
      if (struct.isSetWeight()) {
        oprot.writeI32(struct.weight);
      }
      if (struct.isSetSid()) {
        oprot.writeString(struct.sid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RouteNodeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.host = iprot.readString();
      struct.setHostIsSet(true);
      struct.port = iprot.readI32();
      struct.setPortIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.serviceURL = iprot.readString();
        struct.setServiceURLIsSet(true);
      }
      if (incoming.get(1)) {
        struct.weight = iprot.readI32();
        struct.setWeightIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sid = iprot.readString();
        struct.setSidIsSet(true);
      }
    }
  }

}

