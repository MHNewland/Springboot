package com.mhnewland.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mhnewland.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session,Long> {
    
}
