/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQueryMaxOrderVolumeWithPriceField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQueryMaxOrderVolumeWithPriceField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(
			CThostFtdcQueryMaxOrderVolumeWithPriceField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQueryMaxOrderVolumeWithPriceField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_set(
				swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_set(
				swigCPtr, this, value);
	}

	public String getInvestorID() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_get(
						swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_set(
				swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_get(
						swigCPtr, this);
	}

	public void setDirection(char value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_set(
				swigCPtr, this, value);
	}

	public char getDirection() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_get(
						swigCPtr, this);
	}

	public void setOffsetFlag(char value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_set(
				swigCPtr, this, value);
	}

	public char getOffsetFlag() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_get(
						swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_set(
				swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_get(
						swigCPtr, this);
	}

	public void setMaxVolume(int value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_set(
				swigCPtr, this, value);
	}

	public int getMaxVolume() {
		return CtpJNI
				.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_get(
						swigCPtr, this);
	}

	public void setPrice(double value) {
		CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_set(swigCPtr,
				this, value);
	}

	public double getPrice() {
		return CtpJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_get(
				swigCPtr, this);
	}

	public CThostFtdcQueryMaxOrderVolumeWithPriceField() {
		this(CtpJNI.new_CThostFtdcQueryMaxOrderVolumeWithPriceField(), true);
	}

}
