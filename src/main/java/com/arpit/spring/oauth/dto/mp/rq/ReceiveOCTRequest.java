package com.arpit.spring.oauth.dto.mp.rq;

public class ReceiveOCTRequest {
    private String encRecipientPAN;
    private String transactionAmount;
    private String transmissionDateTime;
    private String localTransactionTime;
    private String localTransactionDate;
    private String originatorCountryCode;
    private String originatorBIN;
    private String retrievalReferenceNumber;
    private String systemTraceAuditNumber;
    private String transactionCurrencyCode;
    private String visaTransactionId;
    private String encConsumerPAN;
    private String encConsumerName;
    private String decimalPositionIndicator;
    private String transactionFeeAmount;
    private String velocityLimitIndicator;
    private String billIdFormat;
    private String billId;
    private String refId;
    private String otherPhoneNumber;
    private String otherEmailAddress;


    public String getEncRecipientPAN() {
        return encRecipientPAN;
    }

    public void setEncRecipientPAN(String encRecipientPAN) {
        this.encRecipientPAN = encRecipientPAN;
    }


    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransmissionDateTime() {
        return transmissionDateTime;
    }

    public void setTransmissionDateTime(String transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
    }

    public String getLocalTransactionTime() {
        return localTransactionTime;
    }

    public void setLocalTransactionTime(String localTransactionTime) {
        this.localTransactionTime = localTransactionTime;
    }

    public String getLocalTransactionDate() {
        return localTransactionDate;
    }

    public void setLocalTransactionDate(String localTransactionDate) {
        this.localTransactionDate = localTransactionDate;
    }

    public String getOriginatorCountryCode() {
        return originatorCountryCode;
    }

    public void setOriginatorCountryCode(String originatorCountryCode) {
        this.originatorCountryCode = originatorCountryCode;
    }

    public String getOriginatorBIN() {
        return originatorBIN;
    }

    public void setOriginatorBIN(String originatorBIN) {
        this.originatorBIN = originatorBIN;
    }

    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    public String getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
        this.systemTraceAuditNumber = systemTraceAuditNumber;
    }

    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    public String getVisaTransactionId() {
        return visaTransactionId;
    }

    public void setVisaTransactionId(String visaTransactionId) {
        this.visaTransactionId = visaTransactionId;
    }

    public String getEncConsumerPAN() {
        return encConsumerPAN;
    }

    public void setEncConsumerPAN(String encConsumerPAN) {
        this.encConsumerPAN = encConsumerPAN;
    }

    public String getEncConsumerName() {
        return encConsumerName;
    }

    public void setEncConsumerName(String encConsumerName) {
        this.encConsumerName = encConsumerName;
    }

    public String getDecimalPositionIndicator() {
        return decimalPositionIndicator;
    }

    public void setDecimalPositionIndicator(String decimalPositionIndicator) {
        this.decimalPositionIndicator = decimalPositionIndicator;
    }

    public String getTransactionFeeAmount() {
        return transactionFeeAmount;
    }

    public void setTransactionFeeAmount(String transactionFeeAmount) {
        this.transactionFeeAmount = transactionFeeAmount;
    }

    public String getVelocityLimitIndicator() {
        return velocityLimitIndicator;
    }

    public void setVelocityLimitIndicator(String velocityLimitIndicator) {
        this.velocityLimitIndicator = velocityLimitIndicator;
    }

    public String getBillIdFormat() {
        return billIdFormat;
    }

    public void setBillIdFormat(String billIdFormat) {
        this.billIdFormat = billIdFormat;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getOtherPhoneNumber() {
        return otherPhoneNumber;
    }

    public void setOtherPhoneNumber(String otherPhoneNumber) {
        this.otherPhoneNumber = otherPhoneNumber;
    }

    public String getOtherEmailAddress() {
        return otherEmailAddress;
    }

    public void setOtherEmailAddress(String otherEmailAddress) {
        this.otherEmailAddress = otherEmailAddress;
    }

    @Override
    public String toString() {
        return "ReceiveOCTRequest{" +
                "encRecipientPAN='" + encRecipientPAN + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", transmissionDateTime='" + transmissionDateTime + '\'' +
                ", localTransactionTime='" + localTransactionTime + '\'' +
                ", localTransactionDate='" + localTransactionDate + '\'' +
                ", originatorCountryCode='" + originatorCountryCode + '\'' +
                ", originatorBIN='" + originatorBIN + '\'' +
                ", retrievalReferenceNumber='" + retrievalReferenceNumber + '\'' +
                ", systemTraceAuditNumber='" + systemTraceAuditNumber + '\'' +
                ", transactionCurrencyCode='" + transactionCurrencyCode + '\'' +
                ", visaTransactionId='" + visaTransactionId + '\'' +
                ", encConsumerPAN='" + encConsumerPAN + '\'' +
                ", encConsumerName='" + encConsumerName + '\'' +
                ", decimalPositionIndicator='" + decimalPositionIndicator + '\'' +
                ", transactionFeeAmount='" + transactionFeeAmount + '\'' +
                ", velocityLimitIndicator='" + velocityLimitIndicator + '\'' +
                ", billIdFormat='" + billIdFormat + '\'' +
                ", billId='" + billId + '\'' +
                ", refId='" + refId + '\'' +
                ", otherPhoneNumber='" + otherPhoneNumber + '\'' +
                ", otherEmailAddress='" + otherEmailAddress + '\'' +
                '}';
    }
}
