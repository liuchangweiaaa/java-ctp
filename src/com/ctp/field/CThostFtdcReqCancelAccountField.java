/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcReqCancelAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcReqCancelAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqCancelAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcReqCancelAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcReqCancelAccountField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI
				.CThostFtdcReqCancelAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankBranchID_get(
				swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcReqCancelAccountField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcReqCancelAccountField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcReqCancelAccountField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcReqCancelAccountField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcReqCancelAccountField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcReqCancelAccountField_LastFragment_get(
				swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcReqCancelAccountField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_SessionID_get(swigCPtr,
				this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcReqCancelAccountField_CustomerName_get(
				swigCPtr, this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcReqCancelAccountField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setGender(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender() {
		return CtpJNI
				.CThostFtdcReqCancelAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_CountryCode_set(swigCPtr, this,
				value);
	}

	public String getCountryCode() {
		return CtpJNI.CThostFtdcReqCancelAccountField_CountryCode_get(swigCPtr,
				this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_CustType_set(swigCPtr, this,
				value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcReqCancelAccountField_CustType_get(swigCPtr,
				this);
	}

	public void setAddress(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Address_set(swigCPtr, this,
				value);
	}

	public String getAddress() {
		return CtpJNI.CThostFtdcReqCancelAccountField_Address_get(swigCPtr,
				this);
	}

	public void setZipCode(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_ZipCode_set(swigCPtr, this,
				value);
	}

	public String getZipCode() {
		return CtpJNI.CThostFtdcReqCancelAccountField_ZipCode_get(swigCPtr,
				this);
	}

	public void setTelephone(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Telephone_set(swigCPtr, this,
				value);
	}

	public String getTelephone() {
		return CtpJNI.CThostFtdcReqCancelAccountField_Telephone_get(swigCPtr,
				this);
	}

	public void setMobilePhone(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_MobilePhone_set(swigCPtr, this,
				value);
	}

	public String getMobilePhone() {
		return CtpJNI.CThostFtdcReqCancelAccountField_MobilePhone_get(swigCPtr,
				this);
	}

	public void setFax(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax() {
		return CtpJNI.CThostFtdcReqCancelAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail() {
		return CtpJNI.CThostFtdcReqCancelAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_set(swigCPtr,
				this, value);
	}

	public char getMoneyAccountStatus() {
		return CtpJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_get(
				swigCPtr, this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankPassWord_set(swigCPtr, this,
				value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankPassWord_get(
				swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_AccountID_get(swigCPtr,
				this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Password_set(swigCPtr, this,
				value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcReqCancelAccountField_Password_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcReqCancelAccountField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_InstallID_get(swigCPtr,
				this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_set(swigCPtr,
				this, value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setCashExchangeCode(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_set(swigCPtr,
				this, value);
	}

	public char getCashExchangeCode() {
		return CtpJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_get(
				swigCPtr, this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI
				.CThostFtdcReqCancelAccountField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankAccType_get(swigCPtr,
				this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_DeviceID_set(swigCPtr, this,
				value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_DeviceID_get(swigCPtr,
				this);
	}

	public void setBankSecuAccType(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_set(swigCPtr,
				this, value);
	}

	public char getBankSecuAccType() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_get(
				swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_set(swigCPtr,
				this, value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setBankSecuAcc(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_set(swigCPtr, this,
				value);
	}

	public String getBankSecuAcc() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_get(swigCPtr,
				this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_get(swigCPtr,
				this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_get(swigCPtr,
				this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI
				.CThostFtdcReqCancelAccountField_OperNo_get(swigCPtr, this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcReqCancelAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcReqCancelAccountField_TID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcReqCancelAccountField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI
				.CThostFtdcReqCancelAccountField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcReqCancelAccountField() {
		this(CtpJNI.new_CThostFtdcReqCancelAccountField(), true);
	}

}
