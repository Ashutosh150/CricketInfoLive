package com.ashu.api.crickliveinfo.Services;

import com.ashu.api.crickliveinfo.Entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {




    //Get All Matches history that will be in our DB once Match gets over
    List<Match> getAllMatches();


    //Get All LiveMatches
    List<Match> getLiveMatches();


    //CWC2023 PointTable
    List<List<String>> getPointTable();

}
