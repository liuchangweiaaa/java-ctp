/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcSyncDepositField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSyncDepositField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSyncDepositField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcSyncDepositField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setDepositSeqNo(String value) {
		CtpJNI.CThostFtdcSyncDepositField_DepositSeqNo_set(swigCPtr, this,
				value);
	}

	public String getDepositSeqNo() {
		return CtpJNI.CThostFtdcSyncDepositField_DepositSeqNo_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcSyncDepositField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcSyncDepositField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcSyncDepositField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcSyncDepositField_InvestorID_get(swigCPtr, this);
	}

	public void setDeposit(double value) {
		CtpJNI.CThostFtdcSyncDepositField_Deposit_set(swigCPtr, this, value);
	}

	public double getDeposit() {
		return CtpJNI.CThostFtdcSyncDepositField_Deposit_get(swigCPtr, this);
	}

	public void setIsForce(int value) {
		CtpJNI.CThostFtdcSyncDepositField_IsForce_set(swigCPtr, this, value);
	}

	public int getIsForce() {
		return CtpJNI.CThostFtdcSyncDepositField_IsForce_get(swigCPtr, this);
	}

	public CThostFtdcSyncDepositField() {
		this(CtpJNI.new_CThostFtdcSyncDepositField(), true);
	}

}
