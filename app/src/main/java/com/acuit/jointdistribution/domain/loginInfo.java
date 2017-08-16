package com.acuit.jointdistribution.domain;

/**
 * 类名: loginInfo <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/8 0008 11:19 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class loginInfo {

    /**
     * code : 3
     * msg : 登录失败！
     */

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
