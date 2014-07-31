/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcCFMMCBrokerKeyField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcCFMMCBrokerKeyField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcCFMMCBrokerKeyField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcCFMMCBrokerKeyField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI
				.CThostFtdcCFMMCBrokerKeyField_BrokerID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_set(swigCPtr, this,
				value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_get(swigCPtr,
				this);
	}

	public void setCreateDate(String value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_set(swigCPtr, this,
				value);
	}

	public String getCreateDate() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_get(swigCPtr,
				this);
	}

	public void setCreateTime(String value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_set(swigCPtr, this,
				value);
	}

	public String getCreateTime() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_get(swigCPtr,
				this);
	}

	public void setKeyID(int value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_KeyID_set(swigCPtr, this, value);
	}

	public int getKeyID() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_KeyID_get(swigCPtr, this);
	}

	public void setCurrentKey(String value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_set(swigCPtr, this,
				value);
	}

	public String getCurrentKey() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_get(swigCPtr,
				this);
	}

	public void setKeyKind(char value) {
		CtpJNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_set(swigCPtr, this, value);
	}

	public char getKeyKind() {
		return CtpJNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_get(swigCPtr, this);
	}

	public CThostFtdcCFMMCBrokerKeyField() {
		this(CtpJNI.new_CThostFtdcCFMMCBrokerKeyField(), true);
	}

}
