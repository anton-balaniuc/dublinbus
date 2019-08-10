
package com.balaniuc.anton;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "arrivaldatetime",
        "duetime",
        "departuredatetime",
        "departureduetime",
        "scheduledarrivaldatetime",
        "scheduleddeparturedatetime",
        "destination",
        "destinationlocalized",
        "origin",
        "originlocalized",
        "direction",
        "operator",
        "additionalinformation",
        "lowfloorstatus",
        "route",
        "sourcetimestamp",
        "monitored"
})
public class BusInfo {
    @Override
    public String toString() {
        return "BusInfo{" + "arrivaldatetime='" + arrivaldatetime + '\'' + ", duetime='" + duetime + '\'' + ", " +
                "departuredatetime='" + departuredatetime + '\'' + ", departureduetime='" + departureduetime + '\'' + ", scheduledarrivaldatetime='" + scheduledarrivaldatetime + '\'' + ", scheduleddeparturedatetime='" + scheduleddeparturedatetime + '\'' + ", destination='" + destination + '\'' + ", destinationlocalized='" + destinationlocalized + '\'' + ", origin='" + origin + '\'' + ", originlocalized='" + originlocalized + '\'' + ", direction='" + direction + '\'' + ", operator='" + operator + '\'' + ", additionalinformation='" + additionalinformation + '\'' + ", lowfloorstatus='" + lowfloorstatus + '\'' + ", route='" + route + '\'' + ", sourcetimestamp='" + sourcetimestamp + '\'' + ", monitored='" + monitored + '\'' + '}';
    }

    @JsonProperty("arrivaldatetime")
    private String arrivaldatetime;
    @JsonProperty("duetime")
    private String duetime;
    @JsonProperty("departuredatetime")
    private String departuredatetime;
    @JsonProperty("departureduetime")
    private String departureduetime;
    @JsonProperty("scheduledarrivaldatetime")
    private String scheduledarrivaldatetime;
    @JsonProperty("scheduleddeparturedatetime")
    private String scheduleddeparturedatetime;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("destinationlocalized")
    private String destinationlocalized;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("originlocalized")
    private String originlocalized;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("additionalinformation")
    private String additionalinformation;
    @JsonProperty("lowfloorstatus")
    private String lowfloorstatus;
    @JsonProperty("route")
    private String route;
    @JsonProperty("sourcetimestamp")
    private String sourcetimestamp;
    @JsonProperty("monitored")
    private String monitored;

    @JsonProperty("arrivaldatetime")
    public String getArrivaldatetime() {
        return arrivaldatetime;
    }

    @JsonProperty("arrivaldatetime")
    public void setArrivaldatetime(String arrivaldatetime) {
        this.arrivaldatetime = arrivaldatetime;
    }

    @JsonProperty("duetime")
    public String getDuetime() {
        return duetime;
    }

    @JsonProperty("duetime")
    public void setDuetime(String duetime) {
        this.duetime = duetime;
    }

    @JsonProperty("departuredatetime")
    public String getDeparturedatetime() {
        return departuredatetime;
    }

    @JsonProperty("departuredatetime")
    public void setDeparturedatetime(String departuredatetime) {
        this.departuredatetime = departuredatetime;
    }

    @JsonProperty("departureduetime")
    public String getDepartureduetime() {
        return departureduetime;
    }

    @JsonProperty("departureduetime")
    public void setDepartureduetime(String departureduetime) {
        this.departureduetime = departureduetime;
    }

    @JsonProperty("scheduledarrivaldatetime")
    public String getScheduledarrivaldatetime() {
        return scheduledarrivaldatetime;
    }

    @JsonProperty("scheduledarrivaldatetime")
    public void setScheduledarrivaldatetime(String scheduledarrivaldatetime) {
        this.scheduledarrivaldatetime = scheduledarrivaldatetime;
    }

    @JsonProperty("scheduleddeparturedatetime")
    public String getScheduleddeparturedatetime() {
        return scheduleddeparturedatetime;
    }

    @JsonProperty("scheduleddeparturedatetime")
    public void setScheduleddeparturedatetime(String scheduleddeparturedatetime) {
        this.scheduleddeparturedatetime = scheduleddeparturedatetime;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("destinationlocalized")
    public String getDestinationlocalized() {
        return destinationlocalized;
    }

    @JsonProperty("destinationlocalized")
    public void setDestinationlocalized(String destinationlocalized) {
        this.destinationlocalized = destinationlocalized;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("originlocalized")
    public String getOriginlocalized() {
        return originlocalized;
    }

    @JsonProperty("originlocalized")
    public void setOriginlocalized(String originlocalized) {
        this.originlocalized = originlocalized;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("additionalinformation")
    public String getAdditionalinformation() {
        return additionalinformation;
    }

    @JsonProperty("additionalinformation")
    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation;
    }

    @JsonProperty("lowfloorstatus")
    public String getLowfloorstatus() {
        return lowfloorstatus;
    }

    @JsonProperty("lowfloorstatus")
    public void setLowfloorstatus(String lowfloorstatus) {
        this.lowfloorstatus = lowfloorstatus;
    }

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    @JsonProperty("sourcetimestamp")
    public String getSourcetimestamp() {
        return sourcetimestamp;
    }

    @JsonProperty("sourcetimestamp")
    public void setSourcetimestamp(String sourcetimestamp) {
        this.sourcetimestamp = sourcetimestamp;
    }

    @JsonProperty("monitored")
    public String getMonitored() {
        return monitored;
    }

    @JsonProperty("monitored")
    public void setMonitored(String monitored) {
        this.monitored = monitored;
    }

}
