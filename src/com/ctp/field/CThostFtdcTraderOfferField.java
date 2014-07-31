/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTraderOfferField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcTraderOfferField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTraderOfferField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTraderOfferField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcTraderOfferField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return CtpJNI.CThostFtdcTraderOfferField_TraderID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ParticipantID_set(swigCPtr, this,
				value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcTraderOfferField_ParticipantID_get(swigCPtr,
				this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcTraderOfferField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcTraderOfferField_Password_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcTraderOfferField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcTraderOfferField_InstallID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_OrderLocalID_set(swigCPtr, this,
				value);
	}

	public String getOrderLocalID() {
		return CtpJNI.CThostFtdcTraderOfferField_OrderLocalID_get(swigCPtr,
				this);
	}

	public void setTraderConnectStatus(char value) {
		CtpJNI.CThostFtdcTraderOfferField_TraderConnectStatus_set(swigCPtr,
				this, value);
	}

	public char getTraderConnectStatus() {
		return CtpJNI.CThostFtdcTraderOfferField_TraderConnectStatus_get(
				swigCPtr, this);
	}

	public void setConnectRequestDate(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ConnectRequestDate_set(swigCPtr,
				this, value);
	}

	public String getConnectRequestDate() {
		return CtpJNI.CThostFtdcTraderOfferField_ConnectRequestDate_get(
				swigCPtr, this);
	}

	public void setConnectRequestTime(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ConnectRequestTime_set(swigCPtr,
				this, value);
	}

	public String getConnectRequestTime() {
		return CtpJNI.CThostFtdcTraderOfferField_ConnectRequestTime_get(
				swigCPtr, this);
	}

	public void setLastReportDate(String value) {
		CtpJNI.CThostFtdcTraderOfferField_LastReportDate_set(swigCPtr, this,
				value);
	}

	public String getLastReportDate() {
		return CtpJNI.CThostFtdcTraderOfferField_LastReportDate_get(swigCPtr,
				this);
	}

	public void setLastReportTime(String value) {
		CtpJNI.CThostFtdcTraderOfferField_LastReportTime_set(swigCPtr, this,
				value);
	}

	public String getLastReportTime() {
		return CtpJNI.CThostFtdcTraderOfferField_LastReportTime_get(swigCPtr,
				this);
	}

	public void setConnectDate(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ConnectDate_set(swigCPtr, this, value);
	}

	public String getConnectDate() {
		return CtpJNI
				.CThostFtdcTraderOfferField_ConnectDate_get(swigCPtr, this);
	}

	public void setConnectTime(String value) {
		CtpJNI.CThostFtdcTraderOfferField_ConnectTime_set(swigCPtr, this, value);
	}

	public String getConnectTime() {
		return CtpJNI
				.CThostFtdcTraderOfferField_ConnectTime_get(swigCPtr, this);
	}

	public void setStartDate(String value) {
		CtpJNI.CThostFtdcTraderOfferField_StartDate_set(swigCPtr, this, value);
	}

	public String getStartDate() {
		return CtpJNI.CThostFtdcTraderOfferField_StartDate_get(swigCPtr, this);
	}

	public void setStartTime(String value) {
		CtpJNI.CThostFtdcTraderOfferField_StartTime_set(swigCPtr, this, value);
	}

	public String getStartTime() {
		return CtpJNI.CThostFtdcTraderOfferField_StartTime_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcTraderOfferField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcTraderOfferField_TradingDay_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcTraderOfferField_BrokerID_get(swigCPtr, this);
	}

	public void setMaxTradeID(String value) {
		CtpJNI.CThostFtdcTraderOfferField_MaxTradeID_set(swigCPtr, this, value);
	}

	public String getMaxTradeID() {
		return CtpJNI.CThostFtdcTraderOfferField_MaxTradeID_get(swigCPtr, this);
	}

	public void setMaxOrderMessageReference(String value) {
		CtpJNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_set(
				swigCPtr, this, value);
	}

	public String getMaxOrderMessageReference() {
		return CtpJNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_get(
				swigCPtr, this);
	}

	public CThostFtdcTraderOfferField() {
		this(CtpJNI.new_CThostFtdcTraderOfferField(), true);
	}

}
