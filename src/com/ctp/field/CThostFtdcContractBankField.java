/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcContractBankField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcContractBankField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcContractBankField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcContractBankField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcContractBankField_BrokerID_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcContractBankField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcContractBankField_BankID_get(swigCPtr, this);
	}

	public void setBankBrchID(String value) {
		CtpJNI.CThostFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
	}

	public String getBankBrchID() {
		return CtpJNI
				.CThostFtdcContractBankField_BankBrchID_get(swigCPtr, this);
	}

	public void setBankName(String value) {
		CtpJNI.CThostFtdcContractBankField_BankName_set(swigCPtr, this, value);
	}

	public String getBankName() {
		return CtpJNI.CThostFtdcContractBankField_BankName_get(swigCPtr, this);
	}

	public CThostFtdcContractBankField() {
		this(CtpJNI.new_CThostFtdcContractBankField(), true);
	}

}
