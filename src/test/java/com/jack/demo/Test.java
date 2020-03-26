package com.jack.demo;

import java.io.IOException;

public class Test extends RuntimeException {
    private static final long serialVersionUID = 1240015972592825169L;
    private boolean logged;
    private Integer errorCode = 0;
    private String errorDetailMsg;

    public Test(String errMsg, boolean logged) {
        super(errMsg);
        this.logged = logged;
        this.errorDetailMsg = errMsg;
    }

    public Test(Integer errorCode, String errMsg, boolean logged) {
        super(errMsg);
        this.logged = logged;
        this.errorCode = errorCode;
        this.errorDetailMsg = errMsg;
    }

    public Test(Integer errorCode, String errMsg, String errorDetailMsg, boolean logged) {
        super(errMsg);
        this.logged = logged;
        this.errorCode = errorCode;
        this.errorDetailMsg = errorDetailMsg;
    }

    public Test(String errMsg, Throwable throwable, boolean logged) {
        super(errMsg, throwable);
        this.logged = logged;
        this.errorDetailMsg = errMsg;
    }

    public Test(Integer errorCode, String errMsg, Throwable throwable, boolean logged) {
        super(errMsg, throwable);
        this.logged = logged;
        this.errorCode = errorCode;
        this.errorDetailMsg = errMsg;
    }

    public Test(Integer errorCode, String errMsg, String errorDetailMsg, Throwable throwable, boolean logged) {
        super(errMsg, throwable);
        this.logged = logged;
        this.errorCode = errorCode;
        this.errorDetailMsg = errorDetailMsg;
    }

    public boolean isLogged() {
        return this.logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDetailMsg() {
        return this.errorDetailMsg;
    }

    public void setErrorDetailMsg(String errorDetailMsg) {
        this.errorDetailMsg = errorDetailMsg;
    }

    public static void main(String[] args) {
        String a = null;
        System.out.println(a);
//        try {
//            a(1);
//
//        } catch (IOException e) {
//            System.out.println("io");
//        } catch (Exception e) {
//            System.out.println(e instanceof IOException);
//            System.out.println(e instanceof Exception);
//        }
    }


    public static void a(int a) throws Exception {
        if (1 == a) {
            throw new IOException("io 异常");
        } else {
            throw new Test(1, "a", false);
        }

    }
}
