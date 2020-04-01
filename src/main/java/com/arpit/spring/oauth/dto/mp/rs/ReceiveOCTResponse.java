package com.arpit.spring.oauth.dto.mp.rs;

public class ReceiveOCTResponse {
    private String responseCode;
    private String receiverTransactionId;
    private String authIdResponse;
    private String cpsAuthorizationCharacteristicsIndicator;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getReceiverTransactionId() {
        return receiverTransactionId;
    }

    public void setReceiverTransactionId(String receiverTransactionId) {
        this.receiverTransactionId = receiverTransactionId;
    }

    public String getAuthIdResponse() {
        return authIdResponse;
    }

    public void setAuthIdResponse(String authIdResponse) {
        this.authIdResponse = authIdResponse;
    }

    public String getCpsAuthorizationCharacteristicsIndicator() {
        return cpsAuthorizationCharacteristicsIndicator;
    }

    public void setCpsAuthorizationCharacteristicsIndicator(String cpsAuthorizationCharacteristicsIndicator) {
        this.cpsAuthorizationCharacteristicsIndicator = cpsAuthorizationCharacteristicsIndicator;
    }
}
