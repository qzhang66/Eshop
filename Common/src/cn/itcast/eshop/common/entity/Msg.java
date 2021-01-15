package cn.itcast.eshop.common.entity;

public class Msg {
    // message type: SUCCESS OR FAIL
    public static final String SUCCESS = "SUCCESS";
    public static final String FAIL = "FAIL";

    private String type;
    private String msg;

    public String getType() {
        return type;
    }

    public Msg setType(String type) {
        this.type = type;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Msg setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
