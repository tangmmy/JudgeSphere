package com.judgesphere.models.response;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ErrorResponse{
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;

    // 构造方法、Getter、Setter
    public ErrorResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }
    public HttpStatus getStatus(){
        return this.status;
    }
}