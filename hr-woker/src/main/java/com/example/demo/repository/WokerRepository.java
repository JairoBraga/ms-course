package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Worker;

public interface WokerRepository extends JpaRepository<Worker, Long>{

}
