package com.mateusmed.architecturestudy.exceptions;

import com.mateusmed.architecturestudy.enums.GenericErrorMessageEnum;

public class GenericException extends RuntimeException{

    private static final long SerialVersionUID = 1L;

    private String httpCode;
    private String message;

    private String errorCode;
    private String detailedMessage;


    public GenericException(int httpStatus,
                            GenericErrorMessageEnum genericErrorMessageEnum,
                            String exceptionMessage) {

        this.httpCode = String.valueOf(httpStatus);
        this.errorCode = genericErrorMessageEnum.getCode();

        this.message = genericErrorMessageEnum.getDescription();
        this.detailedMessage = exceptionMessage;
    }

    public GenericException( int httpCode,
                             String message,
                             String detailedMessage) {

        this.httpCode = String.valueOf(httpCode);
        this.message = message;
        this.detailedMessage = detailedMessage;
    }

    public GenericException( int httpCode,
                             String errorCode,
                             String message,
                             String detailedMessage) {

        this.httpCode = String.valueOf(httpCode);
        this.errorCode = errorCode;
        this.message = message;
        this.detailedMessage = detailedMessage;
    }

    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    @Override
    public String toString() {
        return "GenericException{" +
                "httpCode='" + httpCode + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", message=" + message +
                ", detailedMessage='" + detailedMessage + '\'' +
                '}';
    }
}
