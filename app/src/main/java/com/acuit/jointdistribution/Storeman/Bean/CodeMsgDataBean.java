package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: CodeMsgDataBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/9 15:51 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class CodeMsgDataBean {

    /**
     * code : 200
     * data : []
     * msg : 操作成功!
     */

    private int code;
    private String msg;
    private List<?> data;

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

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
