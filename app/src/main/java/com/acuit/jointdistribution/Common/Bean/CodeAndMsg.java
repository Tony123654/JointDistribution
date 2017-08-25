package com.acuit.jointdistribution.Common.Bean;

/**
 * 类名: CodeAndMsg <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/25 10:01 <p>
 * 描述:  验证密码 接口的返回数据
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class CodeAndMsg {

    /**
     * code : 1
     * msg : 没登录
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
