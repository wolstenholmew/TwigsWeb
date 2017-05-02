package com.twigs.springmvc.api.response;

public class AbstractResponse {

    private boolean success;
    private String message;

    public AbstractResponse() {
    }

    public AbstractResponse(boolean success) {
        this.success = success;
    }

    public AbstractResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
