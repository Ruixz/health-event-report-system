/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.userAccount.UserAccount;

/**
 *
 * @author skipper
 */
public abstract class WorkRequest {
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
//    private String message;
    private String response;
    
    public static final String SEND ="Send";
    public static final String REJECT = "Reject";
    public static final String ARCHIAVE = "Archive";
    public static final String PENDING = "Pending";
    
    public WorkRequest(){
        
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString(){
        return status;
    }
}
