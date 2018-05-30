package com.sas.sanction.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "non_fin_tran_fact_ncore", schema = "rskncore")
public class NonFinTranFactNcore{
	
	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "tranDimNcore"))
	@GeneratedValue(generator="generator")
	@Column(name = "S_NO")
	private int sNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TXN_TYP_NUM")
	private TxnFactNcore txnFactNcore;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACC_SNO")
	private AccDimNcore accDimNcore;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUST_SNO")
	private CustDimNcore custDimNcore;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BRANCH_SNO")
	private BranchDimNcore branchDimNcore;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STAFF_SNO")
	private StaffDimNcore staffDimNcore;
	
	@Column(name = "SECONDARY_ACC_SNO")
	private double secondaryAccountSNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SECONDARY_PARTY_SNO")
	private ExtPartyDimNcore extPartyDimNcore;
	
	@Column(name = "ACC_NUM")
	private String accountNumber;
	
	@Column(name = "CUST_NUM")
	private String customerNumber;
	
	@Column(name = "TXN_EXECUTED_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionExecutedTime;
	
	@Column(name = "TXN_EXECUTED_DT")
	@Temporal(TemporalType.DATE)
	private Date transactionExecutedDate;
	
	@Column(name = "TXN_POSTED_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionPostedTime;
	
	@Column(name = "TXN_POSTED_DT")
	@Temporal(TemporalType.DATE)
	private Date transactionPostedDate;
	
	@Column(name = "TXN_ORIGINATING_CNTRY_NUM")
	private double transactionOriginatingCountryNumber;
	
	@Column(name = "TXN_DESTINATION_CNTRY_NUM")
	private double transactionDestinationCountryNumber;
	
	@Column(name = "SECONDARY_ACC_NUM")
	private String secondaryAccountNumber;
	
	@Column(name = "SECONDARY_PARTY_NUM")
	private String secondaryPartyNumber;
	
	@Column(name = "RELATED_IND")
	private char relatedInd;
	
	@OneToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private TranDimNcore tranDimNcore;

	@Column(name = "CREATED_DTTM")
	private Timestamp createdDtTm;
	
	@Column(name = "CREATED_DT")
	private java.sql.Date createdDt;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "UPDTD_DTTM")
	private Timestamp updatedDtTm;
	
	@Column(name = "UPDTD_DT")
	private java.sql.Date updatedDt;
	
	@Column(name = "UPDTD_BY")
	private String updatedBy;
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public TxnFactNcore getTxnFactNcore() {
		return txnFactNcore;
	}
	public void setTxnFactNcore(TxnFactNcore txnFactNcore) {
		this.txnFactNcore = txnFactNcore;
	}
	public AccDimNcore getAccDimNcore() {
		return accDimNcore;
	}
	public void setAccDimNcore(AccDimNcore accDimNcore) {
		this.accDimNcore = accDimNcore;
	}
	public CustDimNcore getCustDimNcore() {
		return custDimNcore;
	}
	public void setCustDimNcore(CustDimNcore custDimNcore) {
		this.custDimNcore = custDimNcore;
	}
	public BranchDimNcore getBranchDimNcore() {
		return branchDimNcore;
	}
	public void setBranchDimNcore(BranchDimNcore branchDimNcore) {
		this.branchDimNcore = branchDimNcore;
	}
	public StaffDimNcore getStaffDimNcore() {
		return staffDimNcore;
	}
	public void setStaffDimNcore(StaffDimNcore staffDimNcore) {
		this.staffDimNcore = staffDimNcore;
	}
	public double getSecondaryAccountSNumber() {
		return secondaryAccountSNumber;
	}
	public void setSecondaryAccountSNumber(double secondaryAccountSNumber) {
		this.secondaryAccountSNumber = secondaryAccountSNumber;
	}
	public ExtPartyDimNcore getExtPartyDimNcore() {
		return extPartyDimNcore;
	}
	public void setExtPartyDimNcore(ExtPartyDimNcore extPartyDimNcore) {
		this.extPartyDimNcore = extPartyDimNcore;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Date getTransactionExecutedTime() {
		return transactionExecutedTime;
	}
	public void setTransactionExecutedTime(Date transactionExecutedTime) {
		this.transactionExecutedTime = transactionExecutedTime;
	}
	public Date getTransactionExecutedDate() {
		return transactionExecutedDate;
	}
	public void setTransactionExecutedDate(Date transactionExecutedDate) {
		this.transactionExecutedDate = transactionExecutedDate;
	}
	public Date getTransactionPostedTime() {
		return transactionPostedTime;
	}
	public void setTransactionPostedTime(Date transactionPostedTime) {
		this.transactionPostedTime = transactionPostedTime;
	}
	public Date getTransactionPostedDate() {
		return transactionPostedDate;
	}
	public void setTransactionPostedDate(Date transactionPostedDate) {
		this.transactionPostedDate = transactionPostedDate;
	}
	public double getTransactionOriginatingCountryNumber() {
		return transactionOriginatingCountryNumber;
	}
	public void setTransactionOriginatingCountryNumber(double transactionOriginatingCountryNumber) {
		this.transactionOriginatingCountryNumber = transactionOriginatingCountryNumber;
	}
	public double getTransactionDestinationCountryNumber() {
		return transactionDestinationCountryNumber;
	}
	public void setTransactionDestinationCountryNumber(double transactionDestinationCountryNumber) {
		this.transactionDestinationCountryNumber = transactionDestinationCountryNumber;
	}
	public String getSecondaryAccountNumber() {
		return secondaryAccountNumber;
	}
	public void setSecondaryAccountNumber(String secondaryAccountNumber) {
		this.secondaryAccountNumber = secondaryAccountNumber;
	}
	public String getSecondaryPartyNumber() {
		return secondaryPartyNumber;
	}
	public void setSecondaryPartyNumber(String secondaryPartyNumber) {
		this.secondaryPartyNumber = secondaryPartyNumber;
	}
	public char getRelatedInd() {
		return relatedInd;
	}
	public void setRelatedInd(char relatedInd) {
		this.relatedInd = relatedInd;
	}
	public TranDimNcore getTranDimNcore() {
		return tranDimNcore;
	}
	public void setTranDimNcore(TranDimNcore tranDimNcore) {
		this.tranDimNcore = tranDimNcore;
	}
	public Timestamp getCreatedDtTm() {
		return createdDtTm;
	}
	public void setCreatedDtTm(Timestamp createdDtTm) {
		this.createdDtTm = createdDtTm;
	}
	public java.sql.Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(java.sql.Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getUpdatedDtTm() {
		return updatedDtTm;
	}
	public void setUpdatedDtTm(Timestamp updatedDtTm) {
		this.updatedDtTm = updatedDtTm;
	}
	public java.sql.Date getUpdatedDt() {
		return updatedDt;
	}
	public void setUpdatedDt(java.sql.Date updatedDt) {
		this.updatedDt = updatedDt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}