package com.twigs.springmvc.api.response;

public class AbstractResponse {

    private boolean success;
    private String message;

    public AbstractResponse() {
        this.success = true;
    }

    public void updateResponse(boolean success, String message) {
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
