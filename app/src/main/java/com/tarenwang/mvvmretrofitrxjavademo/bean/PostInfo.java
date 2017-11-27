package com.tarenwang.mvvmretrofitrxjavademo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/24.
 * 返回数据的实体类
 */

public class PostInfo {
    private String message;
    private String nu;
    private String isCheck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        private String time;
        private String fTime;
        private String context;
        private Object location;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getfTime() {
            return fTime;
        }

        public void setfTime(String fTime) {
            this.fTime = fTime;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "time='" + time + '\'' +
                    ", fTime='" + fTime + '\'' +
                    ", context='" + context + '\'' +
                    ", location=" + location +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PostInfo{" +
                "message='" + message + '\'' +
                ", nu='" + nu + '\'' +
                ", isCheck='" + isCheck + '\'' +
                ", condition='" + condition + '\'' +
                ", com='" + com + '\'' +
                ", status='" + status + '\'' +
                ", state='" + state + '\'' +
                ", data=" + data +
                '}';
    }
}
