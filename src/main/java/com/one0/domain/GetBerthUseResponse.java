package com.one0.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * Created by DT54 on 2016-11-09.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("ns1.GetBerthUseResponse")
public class GetBerthUseResponse {
    @JsonProperty("ns1.body")
    private Body body;
    @JsonProperty("ns1.header")
    private Header header;

    public GetBerthUseResponse() {
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
    public Header getHeader() {
        return header;
    }
    public void setHeader(Header header) {
        this.header = header;
    }
    @Override
    public String toString() {
        return "GetBerthUseResponse_json{" +
                "body=" + body +
                ", header=" + header +
                '}';
    }

    // ################################ Class ################################
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Header {
        @JsonProperty("ns1.resultCode")
        private String resultCode; // 결과코드
        @JsonProperty("ns1.resultMsg")
        private String resultMsg;  // 결과메세지

        public Header() {
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

    // ################################ Class ################################
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Body {
        private Item item;         // 목록
        private String numOfRows;  // 한 페이지 결과 수
        private String pageNo;     // 페이지 번호
        private String totalCount; // 전체 결과 수

        public Body() {
        }
        public Item getItem() {
            return item;
        }
        public void setItem(Item item) {
            this.item = item;
        }
        public String getNumOfRows() {
            return numOfRows;
        }
        public void setNumOfRows(String numOfRows) {
            this.numOfRows = numOfRows;
        }
        public String getPageNo() {
            return pageNo;
        }
        public void setPageNo(String pageNo) {
            this.pageNo = pageNo;
        }
        public String getTotalCount() {
            return totalCount;
        }
        public void setTotalCount(String totalCount) {
            this.totalCount = totalCount;
        }
        @Override
        public String toString() {
            return "Body{" +
                    "item=" + item +
                    ", numOfRows='" + numOfRows + '\'' +
                    ", pageNo='" + pageNo + '\'' +
                    ", totalCount='" + totalCount + '\'' +
                    '}';
        }

        // ################################ Class ################################
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Item {
            private List<GetBerthUseVO> getBerthUseVO;

            public Item() {
            }
            public List<GetBerthUseVO> getGetBerthUseVO() {
                return getBerthUseVO;
            }
            public void setGetBerthUseVO(List<GetBerthUseVO> getBerthUseVO) {
                this.getBerthUseVO = getBerthUseVO;
            }
            @Override
            public String toString() {
                return "Item{" +
                        "getBerthUseVO=" + getBerthUseVO +
                        '}';
            }

            // ################################ Class ################################
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class GetBerthUseVO {
                private String GCrgCode;      // 대종품목코드
                private String agentCode;     // 업체코드
                private String agentNm;       // 업체명
                private String arvlObjCode;   // 입항목적
                private String callLetter;    // 호출부호
                private String facCode;       // 선석코드
                private String facSubCode;    // 선석SUB코드
                private String facilMeetDt;   // 선석회의일자
                private String ioDateIn;      // 입항일자
                private String ioTp;          // 입출거구분
                private String keyCallLetter; // KEY_CALL_LETTER
                private String keySerNo;      // KEY_SER_NO
                private String keyYr;         // KEY_YR
                private String ocCt;          // 내외항구분
                private String prtAtCode;     // 청코드
                private String serNo;         // 일련번호
                private String shipSpeed;     // 갑문입출거선속
                private String stvCoCode;     // 하역회사
                private String termFlag;      // 구간
                private String unldCrgTn;     // 화물량
                private String vsslDefBrd;    // 선박 흘수
                private String vsslGrsTp;     // 선박구분
                private String vsslKey;       // 선박 고유 키
                private String vsslLen;       // 선박 길이
                private String vsslNm;        // 선박명
                private String vsslWidth;     // 선박 너비
                private String yr;            // 입항년도

                public GetBerthUseVO() {
                }
                public String getGCrgCode() {
                    return GCrgCode;
                }
                public void setGCrgCode(String GCrgCode) {
                    this.GCrgCode = GCrgCode;
                }
                public String getAgentCode() {
                    return agentCode;
                }
                public void setAgentCode(String agentCode) {
                    this.agentCode = agentCode;
                }
                public String getAgentNm() {
                    return agentNm;
                }
                public void setAgentNm(String agentNm) {
                    this.agentNm = agentNm;
                }
                public String getArvlObjCode() {
                    return arvlObjCode;
                }
                public void setArvlObjCode(String arvlObjCode) {
                    this.arvlObjCode = arvlObjCode;
                }
                public String getCallLetter() {
                    return callLetter;
                }
                public void setCallLetter(String callLetter) {
                    this.callLetter = callLetter;
                }
                public String getFacCode() {
                    return facCode;
                }
                public void setFacCode(String facCode) {
                    this.facCode = facCode;
                }
                public String getFacSubCode() {
                    return facSubCode;
                }
                public void setFacSubCode(String facSubCode) {
                    this.facSubCode = facSubCode;
                }
                public String getFacilMeetDt() {
                    return facilMeetDt;
                }
                public void setFacilMeetDt(String facilMeetDt) {
                    this.facilMeetDt = facilMeetDt;
                }
                public String getIoDateIn() {
                    return ioDateIn;
                }
                public void setIoDateIn(String ioDateIn) {
                    this.ioDateIn = ioDateIn;
                }
                public String getIoTp() {
                    return ioTp;
                }
                public void setIoTp(String ioTp) {
                    this.ioTp = ioTp;
                }
                public String getKeyCallLetter() {
                    return keyCallLetter;
                }
                public void setKeyCallLetter(String keyCallLetter) {
                    this.keyCallLetter = keyCallLetter;
                }
                public String getKeySerNo() {
                    return keySerNo;
                }
                public void setKeySerNo(String keySerNo) {
                    this.keySerNo = keySerNo;
                }
                public String getKeyYr() {
                    return keyYr;
                }
                public void setKeyYr(String keyYr) {
                    this.keyYr = keyYr;
                }
                public String getOcCt() {
                    return ocCt;
                }
                public void setOcCt(String ocCt) {
                    this.ocCt = ocCt;
                }
                public String getPrtAtCode() {
                    return prtAtCode;
                }
                public void setPrtAtCode(String prtAtCode) {
                    this.prtAtCode = prtAtCode;
                }
                public String getSerNo() {
                    return serNo;
                }
                public void setSerNo(String serNo) {
                    this.serNo = serNo;
                }
                public String getShipSpeed() {
                    return shipSpeed;
                }
                public void setShipSpeed(String shipSpeed) {
                    this.shipSpeed = shipSpeed;
                }
                public String getStvCoCode() {
                    return stvCoCode;
                }
                public void setStvCoCode(String stvCoCode) {
                    this.stvCoCode = stvCoCode;
                }
                public String getTermFlag() {
                    return termFlag;
                }
                public void setTermFlag(String termFlag) {
                    this.termFlag = termFlag;
                }
                public String getUnldCrgTn() {
                    return unldCrgTn;
                }
                public void setUnldCrgTn(String unldCrgTn) {
                    this.unldCrgTn = unldCrgTn;
                }
                public String getVsslDefBrd() {
                    return vsslDefBrd;
                }
                public void setVsslDefBrd(String vsslDefBrd) {
                    this.vsslDefBrd = vsslDefBrd;
                }
                public String getVsslGrsTp() {
                    return vsslGrsTp;
                }
                public void setVsslGrsTp(String vsslGrsTp) {
                    this.vsslGrsTp = vsslGrsTp;
                }
                public String getVsslKey() {
                    return vsslKey;
                }
                public void setVsslKey(String vsslKey) {
                    this.vsslKey = vsslKey;
                }
                public String getVsslLen() {
                    return vsslLen;
                }
                public void setVsslLen(String vsslLen) {
                    this.vsslLen = vsslLen;
                }
                public String getVsslNm() {
                    return vsslNm;
                }
                public void setVsslNm(String vsslNm) {
                    this.vsslNm = vsslNm;
                }
                public String getVsslWidth() {
                    return vsslWidth;
                }
                public void setVsslWidth(String vsslWidth) {
                    this.vsslWidth = vsslWidth;
                }
                public String getYr() {
                    return yr;
                }
                public void setYr(String yr) {
                    this.yr = yr;
                }
                @Override
                public String toString() {
                    return "GetBerthUseVO{" +
                            "GCrgCode='" + GCrgCode + '\'' +
                            ", agentCode='" + agentCode + '\'' +
                            ", agentNm='" + agentNm + '\'' +
                            ", arvlObjCode='" + arvlObjCode + '\'' +
                            ", callLetter='" + callLetter + '\'' +
                            ", facCode='" + facCode + '\'' +
                            ", facSubCode='" + facSubCode + '\'' +
                            ", facilMeetDt='" + facilMeetDt + '\'' +
                            ", ioDateIn='" + ioDateIn + '\'' +
                            ", ioTp='" + ioTp + '\'' +
                            ", keyCallLetter='" + keyCallLetter + '\'' +
                            ", keySerNo='" + keySerNo + '\'' +
                            ", keyYr='" + keyYr + '\'' +
                            ", ocCt='" + ocCt + '\'' +
                            ", prtAtCode='" + prtAtCode + '\'' +
                            ", serNo='" + serNo + '\'' +
                            ", shipSpeed='" + shipSpeed + '\'' +
                            ", stvCoCode='" + stvCoCode + '\'' +
                            ", termFlag='" + termFlag + '\'' +
                            ", unldCrgTn='" + unldCrgTn + '\'' +
                            ", vsslDefBrd='" + vsslDefBrd + '\'' +
                            ", vsslGrsTp='" + vsslGrsTp + '\'' +
                            ", vsslKey='" + vsslKey + '\'' +
                            ", vsslLen='" + vsslLen + '\'' +
                            ", vsslNm='" + vsslNm + '\'' +
                            ", vsslWidth='" + vsslWidth + '\'' +
                            ", yr='" + yr + '\'' +
                            '}';
                }
            }
        }
    }
}