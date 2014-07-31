/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcBrokerWithdrawAlgorithmField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcBrokerWithdrawAlgorithmField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcBrokerWithdrawAlgorithmField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcBrokerWithdrawAlgorithmField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr,
				this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_get(
				swigCPtr, this);
	}

	public void setWithdrawAlgorithm(char value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(
				swigCPtr, this, value);
	}

	public char getWithdrawAlgorithm() {
		return CtpJNI
				.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(
						swigCPtr, this);
	}

	public void setUsingRatio(double value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr,
				this, value);
	}

	public double getUsingRatio() {
		return CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(
				swigCPtr, this);
	}

	public void setIncludeCloseProfit(char value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(
				swigCPtr, this, value);
	}

	public char getIncludeCloseProfit() {
		return CtpJNI
				.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(
						swigCPtr, this);
	}

	public void setAllWithoutTrade(char value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(
				swigCPtr, this, value);
	}

	public char getAllWithoutTrade() {
		return CtpJNI
				.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(
						swigCPtr, this);
	}

	public void setAvailIncludeCloseProfit(char value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(
				swigCPtr, this, value);
	}

	public char getAvailIncludeCloseProfit() {
		return CtpJNI
				.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(
						swigCPtr, this);
	}

	public void setIsBrokerUserEvent(int value) {
		CtpJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(
				swigCPtr, this, value);
	}

	public int getIsBrokerUserEvent() {
		return CtpJNI
				.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(
						swigCPtr, this);
	}

	public CThostFtdcBrokerWithdrawAlgorithmField() {
		this(CtpJNI.new_CThostFtdcBrokerWithdrawAlgorithmField(), true);
	}

}
