package iansteph.nhlp3.eventpublisher.model.nhl.livedata.plays.play;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import iansteph.nhlp3.eventpublisher.model.nhl.livedata.plays.play.playplayer.Player;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayPlayer {

    private Player player;
    private String playerType;
    private Integer seasonTotal;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(final Player player) {
        this.player = player;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(final String playerType) {
        this.playerType = playerType;
    }

    public Integer getSeasonTotal() {
        return seasonTotal;
    }

    public void setSeasonTotal(final Integer seasonTotal) {
        this.seasonTotal = seasonTotal;
    }

    @Override
    public String toString() {
        return "PlayPlayer{" +
                "player=" + player +
                ", playerType='" + playerType + '\'' +
                ", seasonTotal='" + seasonTotal + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayPlayer that = (PlayPlayer) o;
        return Objects.equals(player, that.player) &&
                Objects.equals(playerType, that.playerType) &&
                Objects.equals(seasonTotal, that.seasonTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, playerType, seasonTotal);
    }
}
