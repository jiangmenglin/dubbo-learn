package com.jml.serviceconsummer.vo;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
public class ResultVo <T> {
    private String message = "SUCCESS";
    private boolean success = true;
    private Integer code = 0;
    private List<T> datas = null;

    public ResultVo(String message, boolean success, Integer code, List<T> datas) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.datas = datas;
    }

    public ResultVo(List<T> datas) {
        this.datas = datas;
    }

    public ResultVo() {};

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
