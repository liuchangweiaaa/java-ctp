/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryProductField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryProductField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryProductField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setProductID(String value) {
		CtpJNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
	}

	public String getProductID() {
		return CtpJNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
	}

	public CThostFtdcQryProductField() {
		this(CtpJNI.new_CThostFtdcQryProductField(), true);
	}

}