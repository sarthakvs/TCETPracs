package com.example.challengeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeService() {
        challenges.add(new Challenge(1L, "Challenge 1", "Description 1"));
        challenges.add(new Challenge(2L, "Challenge 2", "Description 2"));
        challenges.add(new Challenge(3L, "Challenge 3", "Description 3"));
    }

    public List<Challenge> getAllChallenges() {
        return challenges;
    }

    public boolean addChallenge(Challenge challenge) {
        if(challenge != null) {
            
            return challenges.add(challenge);
        }
        return false;
    }
}
