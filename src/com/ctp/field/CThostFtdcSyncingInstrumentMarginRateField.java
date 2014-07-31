/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcSyncingInstrumentMarginRateField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSyncingInstrumentMarginRateField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSyncingInstrumentMarginRateField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcSyncingInstrumentMarginRateField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_set(
				swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_get(
						swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_set(
				swigCPtr, this, value);
	}

	public char getInvestorRange() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_get(
						swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_set(
				swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_set(
				swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_get(
						swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_set(
				swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_get(
				swigCPtr, this);
	}

	public void setLongMarginRatioByMoney(double value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_set(
				swigCPtr, this, value);
	}

	public double getLongMarginRatioByMoney() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_get(
						swigCPtr, this);
	}

	public void setLongMarginRatioByVolume(double value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_set(
				swigCPtr, this, value);
	}

	public double getLongMarginRatioByVolume() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_get(
						swigCPtr, this);
	}

	public void setShortMarginRatioByMoney(double value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_set(
				swigCPtr, this, value);
	}

	public double getShortMarginRatioByMoney() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_get(
						swigCPtr, this);
	}

	public void setShortMarginRatioByVolume(double value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_set(
				swigCPtr, this, value);
	}

	public double getShortMarginRatioByVolume() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_get(
						swigCPtr, this);
	}

	public void setIsRelative(int value) {
		CtpJNI.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_set(
				swigCPtr, this, value);
	}

	public int getIsRelative() {
		return CtpJNI
				.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_get(
						swigCPtr, this);
	}

	public CThostFtdcSyncingInstrumentMarginRateField() {
		this(CtpJNI.new_CThostFtdcSyncingInstrumentMarginRateField(), true);
	}

}