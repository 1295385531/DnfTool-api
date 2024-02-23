package com.shijiu.dnftool.common.base;

import com.shijiu.dnftool.common.enums.CodeEnum;
import lombok.Data;

/**
 * API返回值结构
 * @param <T>
 */
@Data
public class BaseResponse<T> {

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;

    /**
     * 返回
     */
    private T data;
    // 分页

    public BaseResponse() {

    }

    public BaseResponse(CodeEnum codeEnum) {
        super();
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMessage();
    }

    public BaseResponse(Integer code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}

