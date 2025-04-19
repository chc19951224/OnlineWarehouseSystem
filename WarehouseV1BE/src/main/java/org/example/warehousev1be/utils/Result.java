package org.example.warehousev1be.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data  //@自动生成Get/SET方法
@NoArgsConstructor  //@无参构造
@AllArgsConstructor  //@全参构造
//==================== 前后端请求/响应的数据 ====================
public class Result<T> {
    private Integer code;  //表示返回的状态码
    private String message;  //表示返回的提示信息
    private T data;  //表示返回的数据

    //==================== 请求成功时的静态方法 ====================
    //请求成功时，默认返回状态码20000，请求成功的提示，不返回数据
    public static <T> Result<T> succeed() {
        return new Result<>(20000, "请求成功~", null);
    }

    //重载:请求成功时，返回指定提示
    public static <T> Result<T> succeed(String message) {
        return new Result<>(20000, message, null);
    }

    //重载:请求成功时，返回指定提示，指定数据
    public static <T> Result<T> succeed(String message, T data) {
        return new Result<>(20000, message, data);
    }


    //==================== 请求失败时的静态方法 ====================
    //请求失败时，默认返回状态码20000，请求失败的提示，不返回数据
    public static <T> Result<T> failure() {
        return new Result<>(20000, "请求失败！", null);
    }

    //重载:请求失败时，返回指定提示
    public static <T> Result<T> failure(String message) {
        return new Result<>(20000, message, null);
    }

    //重载:请求失败时，返回指定提示，指定数据
    public static <T> Result<T> failure(String message, T data) {
        return new Result<>(20000, message, data);
    }


//    private Boolean success;  //请求状态:成功 or 失败
//    private Integer code;  //状态码
//    private String message;  //状态码解释信息
//    // 字典:给前端返回的信息
//    private Map<String, Object> data = new HashMap<>();
//
//
//    public Boolean getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(Boolean success) {
//        this.success = success;
//    }
//
//    public Integer getCode() {
//        return code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Map<String, Object> getData() {
//        return data;
//    }
//
//    public void setData(Map<String, Object> data) {
//        this.data = data;
//    }
//
//    //私有构造方法
//    private Result() {
//    }
//
//    //成功静态方法
//    public static Result successful() {
//        Result r = new Result();
//        r.setSuccess(true);  //设置成功
//        r.setCode(ResultCode.SUCCESS);  //设置状态码
//        r.setMessage("成功");  //设置状态码信息
//        return r;
//    }
//
//    //失败静态方法
//    public static Result failure() {
//        Result r = new Result();
//        r.setSuccess(false);  //设置失败
//        r.setCode(ResultCode.FAILURE);  //设置状态码
//        r.setMessage("失败");  //设置状态码信息
//        return r;
//    }
//
//    public Result success(Boolean success) {
//        this.setSuccess(success);
//        return this;
//    }
//
//    public Result message(String message) {
//        this.setMessage(message);
//        return this;
//    }
//
//    public Result code(Integer code) {
//        this.setCode(code);
//        return this;
//    }
//
//    public Result data(String key, Object value) {
//        this.data.put(key, value);
//        return this;
//    }
//
//    public Result data(Map<String, Object> map) {
//        this.setData(map);
//        return this;
//    }
}