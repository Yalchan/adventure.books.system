package com.advanced.academy.adventure.books.system.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BittrexTickerResponse {
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("message")
    private String message;
    @JsonProperty("result")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private Result result = null;

    public BittrexTickerResponse() {
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }
    public class Result {


        @JsonProperty("Bid")
        private Double bid;
        @JsonProperty("Ask")
        private Double ask;
        @JsonProperty("Last")
        private Double last;

        public Result() {
        }

        @JsonProperty("Bid")
        public Double getBid() {
            return bid;
        }

        @JsonProperty("Bid")
        public void setBid(Double bid) {
            this.bid = bid;
        }

        @JsonProperty("Ask")
        public Double getAsk() {
            return ask;
        }

        @JsonProperty("Ask")
        public void setAsk(Double ask) {
            this.ask = ask;
        }

        @JsonProperty("Last")
        public Double getLast() {
            return last;
        }

        @JsonProperty("Last")
        public void setLast(Double last) {
            this.last = last;
        }
    }
}
