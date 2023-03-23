package com.mhnewland.service;

import java.util.List;

import com.mhnewland.model.Speaker;
import com.mhnewland.repository.HibernateSpeakerRepositoryImpl;
import com.mhnewland.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository= new HibernateSpeakerRepositoryImpl();
    
    
    @Override
    public List<Speaker> findAll(){

        return repository.findAll();
    }


}
