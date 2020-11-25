package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModelTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String sno                 ;
    private String transactionID       ;
    private String transactionDate     ;
    private String method              ;
    private String paymentData         ;
    private String paymentStatus       ;
    private String ssoId               ;
    private String firstName           ;
    private String lastNameAddress     ;
    private String address             ;
    private String city                ;
    private String state               ;
    private String zip                 ;
    private String country             ;
    private String mobile              ;
    private String email               ;
    private String currency            ;
    private String amount              ;
    private String packageType         ;
	public ModelTable() {
		super();
	}
	public ModelTable(String sno, String transactionID, String transactionDate, String method, String paymentData,
			String paymentStatus, String ssoId, String firstName, String lastNameAddress, String address, String city,
			String state, String zip, String country, String mobile, String email, String currency, String amount,
			String packageType) {
		super();
		this.sno = sno;
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.method = method;
		this.paymentData = paymentData;
		this.paymentStatus = paymentStatus;
		this.ssoId = ssoId;
		this.firstName = firstName;
		this.lastNameAddress = lastNameAddress;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.currency = currency;
		this.amount = amount;
		this.packageType = packageType;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getPaymentData() {
		return paymentData;
	}
	public void setPaymentData(String paymentData) {
		this.paymentData = paymentData;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getSsoId() {
		return ssoId;
	}
	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNameAddress() {
		return lastNameAddress;
	}
	public void setLastNameAddress(String lastNameAddress) {
		this.lastNameAddress = lastNameAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	@Override
	public String toString() {
		return "ModelTable [sno=" + sno + ", transactionID=" + transactionID + ", transactionDate=" + transactionDate
				+ ", method=" + method + ", paymentData=" + paymentData + ", paymentStatus=" + paymentStatus
				+ ", ssoId=" + ssoId + ", firstName=" + firstName + ", lastNameAddress=" + lastNameAddress
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + ", mobile=" + mobile + ", email=" + email + ", currency=" + currency + ", amount=" + amount
				+ ", packageType=" + packageType + "]";
	}
    
    
    
   


}
