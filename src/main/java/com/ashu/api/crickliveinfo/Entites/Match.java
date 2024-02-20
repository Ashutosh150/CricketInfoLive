package com.ashu.api.crickliveinfo.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "cricket_matches")

@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;


    private String teamHeading;

    private String matchNumberAndVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String ballTeam;

    private String ballTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    // this is enum class based on "textComplete" field
    @Enumerated
    private MatchStatus status;

    //setting MatchStatus according to "textComplete" field
    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status = MatchStatus.COMPLETED;
        } else {
            this.status = MatchStatus.LIVE;
        }
    }

    // this will update as per live match going on !!!
    private Date date = new Date();





}
