package com.acuit.jointdistribution.Common.Bean;

/**
 * 类名: PhoneGetBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/25 14:11 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneGetBean {

    /**
     * code : 200
     * msg : 成功
     * mobile_phone : 15669915802
     */

    private int code;
    private String msg;
    private String mobile_phone;

    @Override
    public String toString() {
        return "PhoneGetBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                '}';
    }

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

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }
}
