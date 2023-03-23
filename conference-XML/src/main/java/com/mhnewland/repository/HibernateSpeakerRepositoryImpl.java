package com.mhnewland.repository;

import java.util.ArrayList;
import java.util.List;

import com.mhnewland.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Matt");
        speaker.setLastName("Newland");

        speakers.add(speaker); 

        return speakers;
    }
}
