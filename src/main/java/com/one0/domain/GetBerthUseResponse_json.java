package com.one0.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

/**
 * Created by DT54 on 2016-11-09.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("ns1.GetBerthUseResponse_xml")
public class GetBerthUseResponse_json {
    @JsonProperty("ns1.header")
    private Header_json header;

    public GetBerthUseResponse_json() {
    }

    public GetBerthUseResponse_json(Header_json header) {
        this.header = header;
    }

    public Header_json getHeader() {
        return header;
    }
    public void setHeader(Header_json header) {
        this.header = header;
    }
    @Override
    public String toString() {
        return "GetBerthUseResponse_json{" +
                ", header=" + header +
                '}';
    }

}