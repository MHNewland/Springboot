package com.mhnewland.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhnewland.model.Speaker;
import com.mhnewland.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository;
    
    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl - no args");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl - repository");

        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("Called after constructor");
    }

    @Override
    public List<Speaker> findAll(){

        return repository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");

        this.repository = repository;
    }

    
}
