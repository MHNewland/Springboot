package com.mhnewland.repository;

import java.util.List;

import com.mhnewland.model.Speaker;

public interface SpeakerRepository {

    List<Speaker> findAll();

}