/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryErrOrderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryErrOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryErrOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryErrOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryErrOrderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryErrOrderField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcQryErrOrderField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcQryErrOrderField_InvestorID_get(swigCPtr, this);
	}

	public CThostFtdcQryErrOrderField() {
		this(CtpJNI.new_CThostFtdcQryErrOrderField(), true);
	}

}