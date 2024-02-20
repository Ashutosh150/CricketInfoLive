package com.ashu.api.crickliveinfo.Controllers;

import com.ashu.api.crickliveinfo.Entites.Match;
import com.ashu.api.crickliveinfo.Services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")


public class MatchController {


    // this time we are using constructor Injection not property injection(AutoWired)
    private MatchService matchService;
    // constructor injection of repo interface
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }


    //Get All LiveMatches
    @GetMapping("/live-matches")
    public ResponseEntity<List<Match>> getAllLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    //Get all Matches
    @GetMapping()
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }


    //Get pointTable
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }







}
