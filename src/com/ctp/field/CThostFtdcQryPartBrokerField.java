/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryPartBrokerField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryPartBrokerField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryPartBrokerField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryPartBrokerField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcQryPartBrokerField_ExchangeID_set(swigCPtr, this,
				value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcQryPartBrokerField_ExchangeID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryPartBrokerField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryPartBrokerField_BrokerID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcQryPartBrokerField_ParticipantID_set(swigCPtr, this,
				value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcQryPartBrokerField_ParticipantID_get(swigCPtr,
				this);
	}

	public CThostFtdcQryPartBrokerField() {
		this(CtpJNI.new_CThostFtdcQryPartBrokerField(), true);
	}

}
