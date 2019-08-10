package com.balaniuc.anton;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"errorcode", "errormessage", "numberofresults", "stopid", "timestamp", "results"})
public class Result {
    @Override
    public String toString() {
        return "Result{" + "errorcode='" + errorcode + '\'' + ", errormessage='" + errormessage + '\'' + ", " +
                "numberofresults=" + numberofresults + ", stopid='" + stopid + '\'' + ", timestamp='" + timestamp + '\'' + ", results=" + results + '}';
    }

    @JsonProperty("errorcode")
    private String errorcode;
    @JsonProperty("errormessage")
    private String errormessage;
    @JsonProperty("numberofresults")
    private int numberofresults;
    @JsonProperty("stopid")
    private String stopid;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("results")
    private List<BusInfo> results = null;

    @JsonProperty("errorcode")
    public String getErrorcode() {
        return errorcode;
    }

    @JsonProperty("errorcode")
    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    @JsonProperty("errormessage")
    public String getErrormessage() {
        return errormessage;
    }

    @JsonProperty("errormessage")
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    @JsonProperty("numberofresults")
    public int getNumberofresults() {
        return numberofresults;
    }

    @JsonProperty("numberofresults")
    public void setNumberofresults(int numberofresults) {
        this.numberofresults = numberofresults;
    }

    @JsonProperty("stopid")
    public String getStopid() {
        return stopid;
    }

    @JsonProperty("stopid")
    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("results")
    public List<BusInfo> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<BusInfo> results) {
        this.results = results;
    }

}
