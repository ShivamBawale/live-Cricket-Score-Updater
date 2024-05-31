package com.cricketlive.api.crickinformer.repositories;

import com.cricketlive.api.crickinformer.Entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    //want to ftech the match

    Optional<Match> findByTeamHeading(String teamHeading);
}
