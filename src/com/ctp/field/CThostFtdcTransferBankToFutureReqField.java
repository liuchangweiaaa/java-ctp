/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTransferBankToFutureReqField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcTransferBankToFutureReqField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTransferBankToFutureReqField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTransferBankToFutureReqField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFutureAccount(String value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_set(
				swigCPtr, this, value);
	}

	public String getFutureAccount() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_get(
				swigCPtr, this);
	}

	public void setFuturePwdFlag(char value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_set(
				swigCPtr, this, value);
	}

	public char getFuturePwdFlag() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_get(
				swigCPtr, this);
	}

	public void setFutureAccPwd(String value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_set(
				swigCPtr, this, value);
	}

	public String getFutureAccPwd() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_get(
				swigCPtr, this);
	}

	public void setTradeAmt(double value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr,
				this, value);
	}

	public double getTradeAmt() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_get(
				swigCPtr, this);
	}

	public void setCustFee(double value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr,
				this, value);
	}

	public double getCustFee() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_CustFee_get(
				swigCPtr, this);
	}

	public void setCurrencyCode(String value) {
		CtpJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_set(
				swigCPtr, this, value);
	}

	public String getCurrencyCode() {
		return CtpJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_get(
				swigCPtr, this);
	}

	public CThostFtdcTransferBankToFutureReqField() {
		this(CtpJNI.new_CThostFtdcTransferBankToFutureReqField(), true);
	}

}
