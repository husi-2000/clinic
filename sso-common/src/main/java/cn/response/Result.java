package cn.response;

import java.io.Serializable;

public class Result implements Serializable {

    private Result(int i,String string,Object object){

    }

    public static  Result ok(){
        return new Result(200,"success",null);
    }
    public static  Result ok(Object data){
        return new Result(200,"success",data);
    }
    public static  Result error(){
        return new Result(500,"error",null);
    }
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
