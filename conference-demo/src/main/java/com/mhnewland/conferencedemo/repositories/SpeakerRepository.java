package com.mhnewland.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhnewland.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker,Long>{
    
}
