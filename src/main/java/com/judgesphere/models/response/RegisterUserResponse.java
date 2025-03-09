package com.judgesphere.models.response;

public class RegisterUserResponse  {
    private boolean isSuccess;

    public RegisterUserResponse(){
        this.isSuccess = false;
    }
    public RegisterUserResponse(boolean isSuccess){
        this.isSuccess = isSuccess;
    }
    public boolean getIsSuccess(){
        return this.isSuccess;
    }
}

