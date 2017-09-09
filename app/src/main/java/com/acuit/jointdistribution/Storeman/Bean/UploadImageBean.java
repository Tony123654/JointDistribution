package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: UploadImageBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/9 10:48 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class UploadImageBean {

    /**
     * code : 200
     * data : {"img_urls":["upload/imgs/20170909/1504898079590.jpg","upload/imgs/20170909/1504898079180.jpg","upload/imgs/20170909/1504898079623.jpg"]}
     * msg : 执行成功！
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<String> img_urls;

        public List<String> getImg_urls() {
            return img_urls;
        }

        public void setImg_urls(List<String> img_urls) {
            this.img_urls = img_urls;
        }
    }
}
