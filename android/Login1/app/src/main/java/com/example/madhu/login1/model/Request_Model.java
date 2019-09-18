package com.example.madhu.login1.model;

import com.example.madhu.login1.RequisitionForm_Items_List;
import com.example.madhu.login1.global.RequestStatus;

import java.io.Serializable;

public class Request_Model implements Serializable {
    String RequestNumber;
    RequestStatus requestStatus;
    String RequestDate;


    public String getRequestNumber() {
        return RequestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        RequestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(String requestDate) {
        RequestDate = requestDate;
    }
}
