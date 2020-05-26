package com.harry.renthouse.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Harry Xu
 * @date 2020/5/8 10:31
 */
@AllArgsConstructor
@Getter
public enum ApiResponseEnum {

    SUCCESS(200, "成功"),
    BAD_REQUEST(400, "请求失败"),
    NOT_FOUND(404, "请求地址不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    NOT_LOGIN(40001, "用户未登录"),
    USERNAME_PASSWORD_ERROR(40002, "用户名密码错误"),
    NO_PRIORITY_ERROR(40003, "无权访问"),
    NOT_VALID_PARAM(40005, "无效的参数"),
    UNSUPPORTED_OPERATION(40006, "不支持的操作"),
    NO_AUTHENTICATED_USER_ERROR(40007, "获取认证用户失败"),
    NOT_VALID_CREDENTIAL(40008, "无效的凭据"),
    FILE_UPLOAD_ERROR(50001, "文件上传失败"),
    SUPPORT_ADDRESS_ERROR(50002, "地址选择有误"),
    SUBWAY_LINE_ERROR(50003, "地铁线路有误"),
    SUBWAY_STATION_ERROR(50004, "地铁站有误"),
    SUBWAY_AND_STATION_MATCH_ERROR(50005, "地铁线路与地铁站匹配错误"),
    HOUSE_NOT_FOUND_ERROR(50006, "房源信息未找到"),
    HOUSE_DETAIL_NOT_FOUND_ERROR(50007, "房源详情未找到"),
    ADDRESS_CITY_NOT_FOUND(50008, "城市未找到"),
    ADDRESS_REGION_NOT_FOUND(50009, "区县未找到"),
    TAG_ADD_FAIL(50010, "添加标签失败"),
    TAG_DELETE_FAIL(50011, "删除标签失败"),
    TAG_ALREADY_EXIST(50012, "标签已存在"),
    TAG_NOT_EXIST(50013, "标签不存在"),
    PICTURE_NOT_EXIST(50014, "图片不存在"),
    PICTURE_DELETE_FAIL(50015, "图片删除失败"),
    HOUSE_STATUS_NOT_CHANGE(50016, "房源状态未改变"),
    HOUSE_STATUS_CHANGE_ERROR_RENTED(50017, "不允许修改已出租房源状态"),
    HOUSE_STATUS_CHANGE_ERROR_DELETED(50018, "不允许修改已删除房源状态"),
    HOUSE_PRICE_RAGE_ERROR(50019, "价格区间有误"),
    HOUSE_AREA_RANGE_ERROR(50020, "面积区间有误"),
    USER_NOT_FOUND(50021, "用户不存在"),
    ELASTIC_HOUSE_NOT_FOUND(50022, "房屋索引不存在"),
    PHONE_ALREADY_REGISTERED(50023, "手机号已被注册"),
    PHONE_SEND_SMS_ERROR(50024, "发送短信失败"),
    PHONE_SEND_SMS_BUSY(50025, "短信发送太频繁"),
    PHONE_SMS_NOT_VALID_TYPE(50026, "无效的验证码类型"),
    PHONE_SMS_CODE_ERROR(50027, "验证码错误"),
    PHONE_SMS_CODE_EXPIRE(50028, "验证码已过期"),
    ELASTIC_HOUSE_SUGGEST_CREATE_ERROR(50029, "房源补全分词错误"),
    USER_NICK_NAME_ALREADY_EXIST(50030, "用户名已存在"),
    ;

    private Integer code;

    private String message;

}
