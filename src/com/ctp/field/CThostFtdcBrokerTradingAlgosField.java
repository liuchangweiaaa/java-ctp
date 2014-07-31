/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcBrokerTradingAlgosField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcBrokerTradingAlgosField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcBrokerTradingAlgosField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_get(swigCPtr,
				this);
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this,
				value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_get(
				swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_get(
				swigCPtr, this);
	}

	public void setHandlePositionAlgoID(char value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_set(
				swigCPtr, this, value);
	}

	public char getHandlePositionAlgoID() {
		return CtpJNI
				.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_get(
						swigCPtr, this);
	}

	public void setFindMarginRateAlgoID(char value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_set(
				swigCPtr, this, value);
	}

	public char getFindMarginRateAlgoID() {
		return CtpJNI
				.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_get(
						swigCPtr, this);
	}

	public void setHandleTradingAccountAlgoID(char value) {
		CtpJNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_set(
				swigCPtr, this, value);
	}

	public char getHandleTradingAccountAlgoID() {
		return CtpJNI
				.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_get(
						swigCPtr, this);
	}

	public CThostFtdcBrokerTradingAlgosField() {
		this(CtpJNI.new_CThostFtdcBrokerTradingAlgosField(), true);
	}

}
