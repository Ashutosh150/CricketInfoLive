package com.ashu.api.crickliveinfo.Repositories;

import com.ashu.api.crickliveinfo.Entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {


    // Custom Methods ---------->>>>>>>>>
    // we need to fetch "Matches" based On "TeamName" provided by us

    Optional<Match> findByTeamHeading(String teamHeading);











}
