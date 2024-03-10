package com.example.Main.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Main.Entity.cakeEntity;
@EnableJpaRepositories
@Repository
public interface cakeRepository extends JpaRepository<cakeEntity,Integer> {
}