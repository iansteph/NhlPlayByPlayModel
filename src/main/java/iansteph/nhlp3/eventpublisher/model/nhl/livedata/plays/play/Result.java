package iansteph.nhlp3.eventpublisher.model.nhl.livedata.plays.play;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import iansteph.nhlp3.eventpublisher.model.nhl.livedata.plays.play.result.Strength;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    private String event;
    private String eventCode;
    private String eventTypeId;
    private String description;
    private String secondaryDescription;
    private Strength strength;
    private Boolean gameWinningGoal;
    private Boolean emptyNet;
    private String secondaryType;
    private String penaltySeverity;
    private Integer penaltyMinutes;

    public String getEvent() {
        return event;
    }

    public void setEvent(final String event) {
        this.event = event;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(final String eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(final String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    private String getSecondaryDescription() {
        return secondaryDescription;
    }

    private void setSecondaryDescription(final String secondaryDescription) {
        this.secondaryDescription = secondaryDescription;
    }

    private Strength getStrength() {
        return strength;
    }

    private void setStrength(final Strength strength) {
        this.strength = strength;
    }

    private Boolean getGameWinningGoal() {
        return gameWinningGoal;
    }

    private void setGameWinningGoal(final Boolean gameWinningGoal) {
        this.gameWinningGoal = gameWinningGoal;
    }

    private Boolean getEmptyNet() {
        return emptyNet;
    }

    private void setEmptyNet(final Boolean emptyNet) {
        this.emptyNet = emptyNet;
    }

    private String getSecondaryType() {
        return secondaryType;
    }

    private void setSecondaryType(final String secondaryType) {
        this.secondaryType = secondaryType;
    }

    private String getPenaltySeverity() {
        return penaltySeverity;
    }

    private void setPenaltySeverity(final String penaltySeverity) {
        this.penaltySeverity = penaltySeverity;
    }

    private Integer getPenaltyMinutes() {
        return penaltyMinutes;
    }

    private void setPenaltyMinutes(final Integer penaltyMinutes) {
        this.penaltyMinutes = penaltyMinutes;
    }

    @Override
    public String toString() {
        return "Result{" +
                "event='" + event + '\'' +
                ", eventCode='" + eventCode + '\'' +
                ", eventTypeId='" + eventTypeId + '\'' +
                ", description='" + description + '\'' +
                ", secondaryDescription='" + secondaryDescription + '\'' +
                ", strength='" + strength + '\'' +
                ", gameWinningGoal='" + gameWinningGoal + '\'' +
                ", emptyNet='" + emptyNet + '\'' +
                ", secondaryType='" + secondaryType + '\'' +
                ", penaltySeverity='" + penaltySeverity + '\'' +
                ", penaltyMinutes='" + penaltyMinutes + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(event, result.event) &&
                Objects.equals(eventCode, result.eventCode) &&
                Objects.equals(eventTypeId, result.eventTypeId) &&
                Objects.equals(description, result.description) &&
                Objects.equals(secondaryDescription, result.secondaryDescription) &&
                Objects.equals(strength, result.strength) &&
                Objects.equals(gameWinningGoal, result.gameWinningGoal) &&
                Objects.equals(emptyNet, result.emptyNet) &&
                Objects.equals(secondaryType, result.secondaryType) &&
                Objects.equals(penaltySeverity, result.penaltySeverity) &&
                Objects.equals(penaltyMinutes, result.penaltyMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, eventCode, eventTypeId, description, secondaryDescription, strength, gameWinningGoal, emptyNet, secondaryType, penaltySeverity, penaltyMinutes);
    }
}
