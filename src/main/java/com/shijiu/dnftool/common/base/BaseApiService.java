package com.shijiu.dnftool.common.base;

import com.shijiu.dnftool.common.enums.CodeEnum;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Date: 2024-02-23-13:56
 * @Description:
 */
@Data
@Component
public class BaseApiService<T> {

    public BaseResponse<T> setResult(Integer code, String msg) {
        return this.setResult(code, msg, null);
    }
    /**
     * 通用返回结果
     * @param code 状态码
     * @param msg   返回信息
     * @param data 返回数据
     * @return
     */
    public BaseResponse<T> setResult(Integer code, String msg, T data) {
        return new BaseResponse<T>(code, msg, data);
    }

    /**
     * 设置失败结果
     * @param code  失败状态码
     * @param msg  失败原因
     * @return
     */
    public BaseResponse<T> setResultError(Integer code, String msg) {
        return setResult(code, msg, null);
    }

    /**
     * 设置失败原因（失败状态码 400）
     * @param
     * @return
     */
    public BaseResponse<T> setResultErrorMsg(String msg) {
        return setResult(CodeEnum.FAIL.getCode(), msg, null);
    }

    /**
     * 操作成功
     * @param data 要返回的数据
     * @return
     */
    public BaseResponse<T> setResultSuccess(T data) {
        return setResult(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), data);
    }

    public BaseResponse<T> setResultSuccess(T data, String message) {
        return setResult(CodeEnum.SUCCESS.getCode(), message, data);
    }

    /**
     * 操作成功
     * @return
     */
    public BaseResponse<T> setResultSuccess() {
        return setResult(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 操作成功
     * @param msg 返回的信息
     * @return
     */
    public BaseResponse<T> setResultSuccessMsg(String msg) {
        return setResult(CodeEnum.SUCCESS.getCode(), msg, null);
    }


    /**
     * 参数校验错误
     * @param msg
     * @return
     */
    public BaseResponse<T> setResultParamsErrorMsg(String msg) {
        return setResult(CodeEnum.PARAMS_FAIL.getCode(), msg, null);
    }

    // 调用数据库层判断
    public Boolean toDaoResult(int result) {
        return result > 0 ? true : false;
    }

    // 接口直接返回true 或者false
    public Boolean isSuccess(BaseResponse<?> baseResp) {
        if (baseResp == null) {
            return false;
        }
        if (baseResp.getCode().equals(CodeEnum.SUCCESS.getCode())) {
            return false;
        }
        return true;
    }

}