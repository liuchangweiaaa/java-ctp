/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcChangeAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcChangeAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcChangeAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcChangeAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcChangeAccountField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return CtpJNI
				.CThostFtdcChangeAccountField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcChangeAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcChangeAccountField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcChangeAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BrokerBranchID_set(swigCPtr, this,
				value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcChangeAccountField_BrokerBranchID_get(swigCPtr,
				this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcChangeAccountField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return CtpJNI
				.CThostFtdcChangeAccountField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcChangeAccountField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return CtpJNI
				.CThostFtdcChangeAccountField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcChangeAccountField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcChangeAccountField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcChangeAccountField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcChangeAccountField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcChangeAccountField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcChangeAccountField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcChangeAccountField_LastFragment_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcChangeAccountField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return CtpJNI
				.CThostFtdcChangeAccountField_SessionID_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcChangeAccountField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcChangeAccountField_CustomerName_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcChangeAccountField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcChangeAccountField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcChangeAccountField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setGender(char value) {
		CtpJNI.CThostFtdcChangeAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender() {
		return CtpJNI.CThostFtdcChangeAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value) {
		CtpJNI.CThostFtdcChangeAccountField_CountryCode_set(swigCPtr, this,
				value);
	}

	public String getCountryCode() {
		return CtpJNI.CThostFtdcChangeAccountField_CountryCode_get(swigCPtr,
				this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcChangeAccountField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcChangeAccountField_CustType_get(swigCPtr, this);
	}

	public void setAddress(String value) {
		CtpJNI.CThostFtdcChangeAccountField_Address_set(swigCPtr, this, value);
	}

	public String getAddress() {
		return CtpJNI.CThostFtdcChangeAccountField_Address_get(swigCPtr, this);
	}

	public void setZipCode(String value) {
		CtpJNI.CThostFtdcChangeAccountField_ZipCode_set(swigCPtr, this, value);
	}

	public String getZipCode() {
		return CtpJNI.CThostFtdcChangeAccountField_ZipCode_get(swigCPtr, this);
	}

	public void setTelephone(String value) {
		CtpJNI.CThostFtdcChangeAccountField_Telephone_set(swigCPtr, this, value);
	}

	public String getTelephone() {
		return CtpJNI
				.CThostFtdcChangeAccountField_Telephone_get(swigCPtr, this);
	}

	public void setMobilePhone(String value) {
		CtpJNI.CThostFtdcChangeAccountField_MobilePhone_set(swigCPtr, this,
				value);
	}

	public String getMobilePhone() {
		return CtpJNI.CThostFtdcChangeAccountField_MobilePhone_get(swigCPtr,
				this);
	}

	public void setFax(String value) {
		CtpJNI.CThostFtdcChangeAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax() {
		return CtpJNI.CThostFtdcChangeAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value) {
		CtpJNI.CThostFtdcChangeAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail() {
		return CtpJNI.CThostFtdcChangeAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value) {
		CtpJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_set(swigCPtr,
				this, value);
	}

	public char getMoneyAccountStatus() {
		return CtpJNI.CThostFtdcChangeAccountField_MoneyAccountStatus_get(
				swigCPtr, this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcChangeAccountField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BankPassWord_set(swigCPtr, this,
				value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcChangeAccountField_BankPassWord_get(swigCPtr,
				this);
	}

	public void setNewBankAccount(String value) {
		CtpJNI.CThostFtdcChangeAccountField_NewBankAccount_set(swigCPtr, this,
				value);
	}

	public String getNewBankAccount() {
		return CtpJNI.CThostFtdcChangeAccountField_NewBankAccount_get(swigCPtr,
				this);
	}

	public void setNewBankPassWord(String value) {
		CtpJNI.CThostFtdcChangeAccountField_NewBankPassWord_set(swigCPtr, this,
				value);
	}

	public String getNewBankPassWord() {
		return CtpJNI.CThostFtdcChangeAccountField_NewBankPassWord_get(
				swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return CtpJNI
				.CThostFtdcChangeAccountField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcChangeAccountField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcChangeAccountField_Password_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcChangeAccountField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcChangeAccountField_BankAccType_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcChangeAccountField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return CtpJNI
				.CThostFtdcChangeAccountField_InstallID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_set(swigCPtr,
				this, value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcChangeAccountField_VerifyCertNoFlag_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcChangeAccountField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcChangeAccountField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcChangeAccountField_BrokerIDByBank_set(swigCPtr, this,
				value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcChangeAccountField_BrokerIDByBank_get(swigCPtr,
				this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcChangeAccountField_BankPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcChangeAccountField_BankPwdFlag_get(swigCPtr,
				this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcChangeAccountField_SecuPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcChangeAccountField_SecuPwdFlag_get(swigCPtr,
				this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcChangeAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcChangeAccountField_TID_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcChangeAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcChangeAccountField_Digest_get(swigCPtr, this);
	}

	public void setErrorID(int value) {
		CtpJNI.CThostFtdcChangeAccountField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID() {
		return CtpJNI.CThostFtdcChangeAccountField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		CtpJNI.CThostFtdcChangeAccountField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg() {
		return CtpJNI.CThostFtdcChangeAccountField_ErrorMsg_get(swigCPtr, this);
	}

	public CThostFtdcChangeAccountField() {
		this(CtpJNI.new_CThostFtdcChangeAccountField(), true);
	}

}
