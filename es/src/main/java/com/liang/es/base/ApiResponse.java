package com.liang.es.base;

import lombok.Data;

/**
 * @Author: LiangBiyin
 * @Description: API 格式封装
 * @Date: Create in 15:39 2019/11/8
 */
@Data
public class ApiResponse {
    private  int code;
    private String message;
    private Object data;
    private boolean more;
    public enum Status{
        SUCCESS(200,"OK"),
        BED_REQUEST(400,"Bad Request"),
        NOT_VALID_PARAM(40005,"Not Valid Param "),
        INTERNAL_SERVER_ERROR(500,"Unknow Internal Error");

        private int code;
        private String standardMessage;
        Status(int code,String standardMessage){
           this.code=code;
           this.standardMessage=standardMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }
}
