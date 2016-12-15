package com.one0.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by DT54 on 2016-11-09.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Header_json {

private String resultCode; // 결과코드
private String resultMsg;  // 결과메세지

public Header_json() {
}
public String getResultCode() {
    return resultCode;
}
public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
}
public String getResultMsg() {
    return resultMsg;
}
public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
}
@Override
public String toString() {
    return "Header{" +
            "resultCode='" + resultCode + '\'' +
            ", resultMsg='" + resultMsg + '\'' +
            '}';
}
}
