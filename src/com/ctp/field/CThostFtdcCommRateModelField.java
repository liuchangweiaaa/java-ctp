/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcCommRateModelField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcCommRateModelField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcCommRateModelField obj)
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
				ctpJNI.delete_CThostFtdcCommRateModelField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value)
	{
		ctpJNI.CThostFtdcCommRateModelField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID()
	{
		return ctpJNI.CThostFtdcCommRateModelField_BrokerID_get(swigCPtr, this);
	}

	public void setCommModelID(String value)
	{
		ctpJNI.CThostFtdcCommRateModelField_CommModelID_set(swigCPtr, this, value);
	}

	public String getCommModelID()
	{
		return ctpJNI.CThostFtdcCommRateModelField_CommModelID_get(swigCPtr, this);
	}

	public void setCommModelName(String value)
	{
		ctpJNI.CThostFtdcCommRateModelField_CommModelName_set(swigCPtr, this, value);
	}

	public String getCommModelName()
	{
		return ctpJNI.CThostFtdcCommRateModelField_CommModelName_get(swigCPtr, this);
	}

	public CThostFtdcCommRateModelField()
	{
		this(ctpJNI.new_CThostFtdcCommRateModelField(), true);
	}
}
