/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcSpecificInstrumentField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcSpecificInstrumentField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSpecificInstrumentField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcSpecificInstrumentField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcSpecificInstrumentField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcSpecificInstrumentField_InstrumentID_get(
				swigCPtr, this);
	}

	public CThostFtdcSpecificInstrumentField() {
		this(CtpJNI.new_CThostFtdcSpecificInstrumentField(), true);
	}

}
