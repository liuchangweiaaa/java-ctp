/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryLinkManField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryLinkManField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryLinkManField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryLinkManField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryLinkManField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryLinkManField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcQryLinkManField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcQryLinkManField_InvestorID_get(swigCPtr, this);
	}

	public CThostFtdcQryLinkManField() {
		this(CtpJNI.new_CThostFtdcQryLinkManField(), true);
	}

}
