package bnuz.edu.cn.common.vo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */
@ApiModel("Result 返回结果实体基类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    //返回码
    private Integer code;
    //返回描述
    private String message;
    //返回数据
    private T data;
    //分页查询总记录
    private Long count;

    public static Result<Object> success() {
//        System.out.println(Result(0, "success", null, null));
        return new Result(0, "success", null, null);
    }

    public static Result<Object> success(String message) {
        return new Result(0, message, null, null);
    }

    public static Result<Object> success(Object data, Long count) {
        return new Result(0, "success", data, count);
    }

    public static Result<Object> fail() {
        return new Result(1, "fail", null, null);
    }

    public static Result<Object> fail(String message) {
        return new Result(1, message, null, null);
    }


}
