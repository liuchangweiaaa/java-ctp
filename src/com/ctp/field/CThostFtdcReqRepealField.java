/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcReqRepealField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcReqRepealField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqRepealField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcReqRepealField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setRepealTimeInterval(int value) {
		CtpJNI.CThostFtdcReqRepealField_RepealTimeInterval_set(swigCPtr, this,
				value);
	}

	public int getRepealTimeInterval() {
		return CtpJNI.CThostFtdcReqRepealField_RepealTimeInterval_get(swigCPtr,
				this);
	}

	public void setRepealedTimes(int value) {
		CtpJNI.CThostFtdcReqRepealField_RepealedTimes_set(swigCPtr, this, value);
	}

	public int getRepealedTimes() {
		return CtpJNI
				.CThostFtdcReqRepealField_RepealedTimes_get(swigCPtr, this);
	}

	public void setBankRepealFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_BankRepealFlag_set(swigCPtr, this,
				value);
	}

	public char getBankRepealFlag() {
		return CtpJNI.CThostFtdcReqRepealField_BankRepealFlag_get(swigCPtr,
				this);
	}

	public void setBrokerRepealFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_BrokerRepealFlag_set(swigCPtr, this,
				value);
	}

	public char getBrokerRepealFlag() {
		return CtpJNI.CThostFtdcReqRepealField_BrokerRepealFlag_get(swigCPtr,
				this);
	}

	public void setPlateRepealSerial(int value) {
		CtpJNI.CThostFtdcReqRepealField_PlateRepealSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateRepealSerial() {
		return CtpJNI.CThostFtdcReqRepealField_PlateRepealSerial_get(swigCPtr,
				this);
	}

	public void setBankRepealSerial(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankRepealSerial_set(swigCPtr, this,
				value);
	}

	public String getBankRepealSerial() {
		return CtpJNI.CThostFtdcReqRepealField_BankRepealSerial_get(swigCPtr,
				this);
	}

	public void setFutureRepealSerial(int value) {
		CtpJNI.CThostFtdcReqRepealField_FutureRepealSerial_set(swigCPtr, this,
				value);
	}

	public int getFutureRepealSerial() {
		return CtpJNI.CThostFtdcReqRepealField_FutureRepealSerial_get(swigCPtr,
				this);
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcReqRepealField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcReqRepealField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcReqRepealField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcReqRepealField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcReqRepealField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcReqRepealField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcReqRepealField_BrokerBranchID_set(swigCPtr, this,
				value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcReqRepealField_BrokerBranchID_get(swigCPtr,
				this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcReqRepealField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcReqRepealField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcReqRepealField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcReqRepealField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcReqRepealField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcReqRepealField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcReqRepealField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcReqRepealField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcReqRepealField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcReqRepealField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcReqRepealField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcReqRepealField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcReqRepealField_SessionID_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcReqRepealField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcReqRepealField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcReqRepealField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcReqRepealField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcReqRepealField_IdentifiedCardNo_set(swigCPtr, this,
				value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcReqRepealField_IdentifiedCardNo_get(swigCPtr,
				this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcReqRepealField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcReqRepealField_CustType_get(swigCPtr, this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcReqRepealField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcReqRepealField_BankPassWord_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcReqRepealField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcReqRepealField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcReqRepealField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcReqRepealField_Password_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcReqRepealField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcReqRepealField_InstallID_get(swigCPtr, this);
	}

	public void setFutureSerial(int value) {
		CtpJNI.CThostFtdcReqRepealField_FutureSerial_set(swigCPtr, this, value);
	}

	public int getFutureSerial() {
		return CtpJNI.CThostFtdcReqRepealField_FutureSerial_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcReqRepealField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcReqRepealField_UserID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_VerifyCertNoFlag_set(swigCPtr, this,
				value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcReqRepealField_VerifyCertNoFlag_get(swigCPtr,
				this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcReqRepealField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcReqRepealField_CurrencyID_get(swigCPtr, this);
	}

	public void setTradeAmount(double value) {
		CtpJNI.CThostFtdcReqRepealField_TradeAmount_set(swigCPtr, this, value);
	}

	public double getTradeAmount() {
		return CtpJNI.CThostFtdcReqRepealField_TradeAmount_get(swigCPtr, this);
	}

	public void setFutureFetchAmount(double value) {
		CtpJNI.CThostFtdcReqRepealField_FutureFetchAmount_set(swigCPtr, this,
				value);
	}

	public double getFutureFetchAmount() {
		return CtpJNI.CThostFtdcReqRepealField_FutureFetchAmount_get(swigCPtr,
				this);
	}

	public void setFeePayFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_FeePayFlag_set(swigCPtr, this, value);
	}

	public char getFeePayFlag() {
		return CtpJNI.CThostFtdcReqRepealField_FeePayFlag_get(swigCPtr, this);
	}

	public void setCustFee(double value) {
		CtpJNI.CThostFtdcReqRepealField_CustFee_set(swigCPtr, this, value);
	}

	public double getCustFee() {
		return CtpJNI.CThostFtdcReqRepealField_CustFee_get(swigCPtr, this);
	}

	public void setBrokerFee(double value) {
		CtpJNI.CThostFtdcReqRepealField_BrokerFee_set(swigCPtr, this, value);
	}

	public double getBrokerFee() {
		return CtpJNI.CThostFtdcReqRepealField_BrokerFee_get(swigCPtr, this);
	}

	public void setMessage(String value) {
		CtpJNI.CThostFtdcReqRepealField_Message_set(swigCPtr, this, value);
	}

	public String getMessage() {
		return CtpJNI.CThostFtdcReqRepealField_Message_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcReqRepealField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcReqRepealField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcReqRepealField_BankAccType_set(swigCPtr, this, value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcReqRepealField_BankAccType_get(swigCPtr, this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcReqRepealField_DeviceID_set(swigCPtr, this, value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcReqRepealField_DeviceID_get(swigCPtr, this);
	}

	public void setBankSecuAccType(char value) {
		CtpJNI.CThostFtdcReqRepealField_BankSecuAccType_set(swigCPtr, this,
				value);
	}

	public char getBankSecuAccType() {
		return CtpJNI.CThostFtdcReqRepealField_BankSecuAccType_get(swigCPtr,
				this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcReqRepealField_BrokerIDByBank_set(swigCPtr, this,
				value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcReqRepealField_BrokerIDByBank_get(swigCPtr,
				this);
	}

	public void setBankSecuAcc(String value) {
		CtpJNI.CThostFtdcReqRepealField_BankSecuAcc_set(swigCPtr, this, value);
	}

	public String getBankSecuAcc() {
		return CtpJNI.CThostFtdcReqRepealField_BankSecuAcc_get(swigCPtr, this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_BankPwdFlag_set(swigCPtr, this, value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcReqRepealField_BankPwdFlag_get(swigCPtr, this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcReqRepealField_SecuPwdFlag_set(swigCPtr, this, value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcReqRepealField_SecuPwdFlag_get(swigCPtr, this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcReqRepealField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcReqRepealField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcReqRepealField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcReqRepealField_RequestID_get(swigCPtr, this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcReqRepealField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcReqRepealField_TID_get(swigCPtr, this);
	}

	public void setTransferStatus(char value) {
		CtpJNI.CThostFtdcReqRepealField_TransferStatus_set(swigCPtr, this,
				value);
	}

	public char getTransferStatus() {
		return CtpJNI.CThostFtdcReqRepealField_TransferStatus_get(swigCPtr,
				this);
	}

	public CThostFtdcReqRepealField() {
		this(CtpJNI.new_CThostFtdcReqRepealField(), true);
	}

}
