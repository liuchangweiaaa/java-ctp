/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcForQuoteRspField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcForQuoteRspField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcForQuoteRspField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcForQuoteRspField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_TradingDay_get(swigCPtr, this);
	}

	public void setInstrumentID(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_InstrumentID_get(swigCPtr, this);
	}

	public void setForQuoteSysID(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_set(swigCPtr, this, value);
	}

	public String getForQuoteSysID()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_get(swigCPtr, this);
	}

	public void setForQuoteTime(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_ForQuoteTime_set(swigCPtr, this, value);
	}

	public String getForQuoteTime()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_ForQuoteTime_get(swigCPtr, this);
	}

	public void setActionDay(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_ActionDay_set(swigCPtr, this, value);
	}

	public String getActionDay()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_ActionDay_get(swigCPtr, this);
	}

	public void setExchangeID(String value)
	{
		ctpJNI.CThostFtdcForQuoteRspField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID()
	{
		return ctpJNI.CThostFtdcForQuoteRspField_ExchangeID_get(swigCPtr, this);
	}

	public CThostFtdcForQuoteRspField()
	{
		this(ctpJNI.new_CThostFtdcForQuoteRspField(), true);
	}
}