/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryBrokerUserEventField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryBrokerUserEventField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryBrokerUserEventField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryBrokerUserEventField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryBrokerUserEventField_BrokerID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcQryBrokerUserEventField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcQryBrokerUserEventField_UserID_get(swigCPtr,
				this);
	}

	public void setUserEventType(char value) {
		CtpJNI.CThostFtdcQryBrokerUserEventField_UserEventType_set(swigCPtr,
				this, value);
	}

	public char getUserEventType() {
		return CtpJNI.CThostFtdcQryBrokerUserEventField_UserEventType_get(
				swigCPtr, this);
	}

	public CThostFtdcQryBrokerUserEventField() {
		this(CtpJNI.new_CThostFtdcQryBrokerUserEventField(), true);
	}

}