package com.acuit.jointdistribution.Common.Bean;

/**
 * 类名: SendVerifyCodeBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/25 10:28 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendVerifyCodeBean {

    /**
     * status : 0
     * code : SignatureDoesNotMatch
     * verify_code : 971464
     * time : 1503627851
     * phone_number : null
     */

    private int status;
    private String code;
    private int verify_code;
    private int time;
    private Object phone_number;

    @Override
    public String toString() {
        return "SendVerifyCodeBean{" +
                "status=" + status +
                ", code='" + code + '\'' +
                ", verify_code=" + verify_code +
                ", time=" + time +
                ", phone_number=" + phone_number +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getVerify_code() {
        return verify_code;
    }

    public void setVerify_code(int verify_code) {
        this.verify_code = verify_code;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Object getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Object phone_number) {
        this.phone_number = phone_number;
    }
}
