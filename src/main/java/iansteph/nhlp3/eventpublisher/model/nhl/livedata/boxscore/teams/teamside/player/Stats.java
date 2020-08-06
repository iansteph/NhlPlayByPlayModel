package iansteph.nhlp3.eventpublisher.model.nhl.livedata.boxscore.teams.teamside.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import iansteph.nhlp3.eventpublisher.model.nhl.livedata.boxscore.teams.teamside.player.stats.SkaterStats;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {

    private SkaterStats skaterStats;

    public SkaterStats getSkaterStats() {

        return skaterStats;
    }

    public void setSkaterStats(final SkaterStats skaterStats) {

        this.skaterStats = skaterStats;
    }

    @Override
    public String toString() {

        return "Stats{" +
                "skaterStats=" + skaterStats +
                '}';
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(skaterStats, stats.skaterStats);
    }

    @Override
    public int hashCode() {

        return Objects.hash(skaterStats);
    }
}