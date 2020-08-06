package iansteph.nhlp3.eventpublisher.model.nhl.livedata.boxscore.teams.teamside.player.stats;

import java.util.Objects;

public class SkaterStats {

    private String timeOnIce;
    private Integer assists;
    private Integer goals;
    private Integer shots;
    private Integer hits;
    private Integer powerPlayGoals;
    private Integer powerPlayAssists;
    private Integer penaltyMinutes;
    private Integer faceOffWins;
    private Integer faceoffTaken;
    private Integer takeaways;
    private Integer giveaways;
    private Integer shortHandedGoals;
    private Integer shortHandedAssists;
    private Integer blocked;
    private Integer plusMinus;
    private String evenTimeOnIce;
    private String powerPlayTimeOnIce;
    private String shortHandedTimeOnIce;

    public String getTimeOnIce() {

        return timeOnIce;
    }

    public void setTimeOnIce(final String timeOnIce) {

        this.timeOnIce = timeOnIce;
    }

    public Integer getAssists() {

        return assists;
    }

    public void setAssists(final Integer assists) {

        this.assists = assists;
    }

    public Integer getGoals() {

        return goals;
    }

    public void setGoals(final Integer goals) {

        this.goals = goals;
    }

    public Integer getShots() {

        return shots;
    }

    public void setShots(final Integer shots) {

        this.shots = shots;
    }

    public Integer getHits() {

        return hits;
    }

    public void setHits(final Integer hits) {

        this.hits = hits;
    }

    public Integer getPowerPlayGoals() {

        return powerPlayGoals;
    }

    public void setPowerPlayGoals(final Integer powerPlayGoals) {

        this.powerPlayGoals = powerPlayGoals;
    }

    public Integer getPowerPlayAssists() {

        return powerPlayAssists;
    }

    public void setPowerPlayAssists(final Integer powerPlayAssists) {

        this.powerPlayAssists = powerPlayAssists;
    }

    public Integer getPenaltyMinutes() {

        return penaltyMinutes;
    }

    public void setPenaltyMinutes(final Integer penaltyMinutes) {

        this.penaltyMinutes = penaltyMinutes;
    }

    public Integer getFaceOffWins() {

        return faceOffWins;
    }

    public void setFaceOffWins(final Integer faceOffWins) {

        this.faceOffWins = faceOffWins;
    }

    public Integer getFaceoffTaken() {

        return faceoffTaken;
    }

    public void setFaceoffTaken(final Integer faceoffTaken) {

        this.faceoffTaken = faceoffTaken;
    }

    public Integer getTakeaways() {

        return takeaways;
    }

    public void setTakeaways(final Integer takeaways) {

        this.takeaways = takeaways;
    }

    public Integer getGiveaways() {

        return giveaways;
    }

    public void setGiveaways(final Integer giveaways) {

        this.giveaways = giveaways;
    }

    public Integer getShortHandedGoals() {

        return shortHandedGoals;
    }

    public void setShortHandedGoals(final Integer shortHandedGoals) {

        this.shortHandedGoals = shortHandedGoals;
    }

    public Integer getShortHandedAssists() {

        return shortHandedAssists;
    }

    public void setShortHandedAssists(final Integer shortHandedAssists) {

        this.shortHandedAssists = shortHandedAssists;
    }

    public Integer getBlocked() {

        return blocked;
    }

    public void setBlocked(final Integer blocked) {

        this.blocked = blocked;
    }

    public Integer getPlusMinus() {

        return plusMinus;
    }

    public void setPlusMinus(final Integer plusMinus) {

        this.plusMinus = plusMinus;
    }

    public String getEvenTimeOnIce() {

        return evenTimeOnIce;
    }

    public void setEvenTimeOnIce(final String evenTimeOnIce) {

        this.evenTimeOnIce = evenTimeOnIce;
    }

    public String getPowerPlayTimeOnIce() {

        return powerPlayTimeOnIce;
    }

    public void setPowerPlayTimeOnIce(final String powerPlayTimeOnIce) {

        this.powerPlayTimeOnIce = powerPlayTimeOnIce;
    }

    public String getShortHandedTimeOnIce() {

        return shortHandedTimeOnIce;
    }

    public void setShortHandedTimeOnIce(final String shortHandedTimeOnIce) {

        this.shortHandedTimeOnIce = shortHandedTimeOnIce;
    }

    @Override
    public String toString() {

        return "SkaterStats{" +
                "timeOnIce='" + timeOnIce + '\'' +
                ", assists=" + assists +
                ", goals=" + goals +
                ", shots=" + shots +
                ", hits=" + hits +
                ", powerPlayGoals=" + powerPlayGoals +
                ", powerPlayAssists=" + powerPlayAssists +
                ", penaltyMinutes=" + penaltyMinutes +
                ", faceOffWins=" + faceOffWins +
                ", faceoffTaken=" + faceoffTaken +
                ", takeaways=" + takeaways +
                ", giveaways=" + giveaways +
                ", shortHandedGoals=" + shortHandedGoals +
                ", shortHandedAssists=" + shortHandedAssists +
                ", blocked=" + blocked +
                ", plusMinus=" + plusMinus +
                ", evenTimeOnIce='" + evenTimeOnIce + '\'' +
                ", powerPlayTimeOnIce='" + powerPlayTimeOnIce + '\'' +
                ", shortHandedTimeOnIce='" + shortHandedTimeOnIce + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkaterStats that = (SkaterStats) o;
        return Objects.equals(timeOnIce, that.timeOnIce) &&
                Objects.equals(assists, that.assists) &&
                Objects.equals(goals, that.goals) &&
                Objects.equals(shots, that.shots) &&
                Objects.equals(hits, that.hits) &&
                Objects.equals(powerPlayGoals, that.powerPlayGoals) &&
                Objects.equals(powerPlayAssists, that.powerPlayAssists) &&
                Objects.equals(penaltyMinutes, that.penaltyMinutes) &&
                Objects.equals(faceOffWins, that.faceOffWins) &&
                Objects.equals(faceoffTaken, that.faceoffTaken) &&
                Objects.equals(takeaways, that.takeaways) &&
                Objects.equals(giveaways, that.giveaways) &&
                Objects.equals(shortHandedGoals, that.shortHandedGoals) &&
                Objects.equals(shortHandedAssists, that.shortHandedAssists) &&
                Objects.equals(blocked, that.blocked) &&
                Objects.equals(plusMinus, that.plusMinus) &&
                Objects.equals(evenTimeOnIce, that.evenTimeOnIce) &&
                Objects.equals(powerPlayTimeOnIce, that.powerPlayTimeOnIce) &&
                Objects.equals(shortHandedTimeOnIce, that.shortHandedTimeOnIce);
    }

    @Override
    public int hashCode() {

        return Objects.hash(timeOnIce, assists, goals, shots, hits, powerPlayGoals, powerPlayAssists, penaltyMinutes, faceOffWins, faceoffTaken, takeaways, giveaways, shortHandedGoals, shortHandedAssists, blocked, plusMinus, evenTimeOnIce, powerPlayTimeOnIce, shortHandedTimeOnIce);
    }
}
