/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcFrontStatusField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcFrontStatusField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcFrontStatusField obj)
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
				ctpJNI.delete_CThostFtdcFrontStatusField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFrontID(int value)
	{
		ctpJNI.CThostFtdcFrontStatusField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID()
	{
		return ctpJNI.CThostFtdcFrontStatusField_FrontID_get(swigCPtr, this);
	}

	public void setLastReportDate(String value)
	{
		ctpJNI.CThostFtdcFrontStatusField_LastReportDate_set(swigCPtr, this, value);
	}

	public String getLastReportDate()
	{
		return ctpJNI.CThostFtdcFrontStatusField_LastReportDate_get(swigCPtr, this);
	}

	public void setLastReportTime(String value)
	{
		ctpJNI.CThostFtdcFrontStatusField_LastReportTime_set(swigCPtr, this, value);
	}

	public String getLastReportTime()
	{
		return ctpJNI.CThostFtdcFrontStatusField_LastReportTime_get(swigCPtr, this);
	}

	public void setIsActive(int value)
	{
		ctpJNI.CThostFtdcFrontStatusField_IsActive_set(swigCPtr, this, value);
	}

	public int getIsActive()
	{
		return ctpJNI.CThostFtdcFrontStatusField_IsActive_get(swigCPtr, this);
	}

	public CThostFtdcFrontStatusField()
	{
		this(ctpJNI.new_CThostFtdcFrontStatusField(), true);
	}
}
