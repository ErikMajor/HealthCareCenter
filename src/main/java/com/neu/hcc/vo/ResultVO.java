package com.neu.hcc.vo;

/**
 * view object
 */
public class ResultVO<T> {

    private int status;

    private String message;

    private T obj;

    public ResultVO(){

    }

    public ResultVO(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
