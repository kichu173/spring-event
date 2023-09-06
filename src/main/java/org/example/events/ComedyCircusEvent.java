package org.example.events;

public class ComedyCircusEvent {
    private String episodeNo; // EP - 007

    public ComedyCircusEvent(String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(String episodeNo) {
        this.episodeNo = episodeNo;
    }
}
