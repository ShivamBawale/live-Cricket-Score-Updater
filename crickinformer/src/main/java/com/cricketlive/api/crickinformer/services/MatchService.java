package com.cricketlive.api.crickinformer.services;

import com.cricketlive.api.crickinformer.Entities.Match;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public interface MatchService {

    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

    //get ipl24  pont table
    List<List<String>> getPointTable();
}
