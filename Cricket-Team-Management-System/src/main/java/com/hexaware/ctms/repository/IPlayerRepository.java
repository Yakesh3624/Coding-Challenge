package com.hexaware.ctms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.ctms.entity.Player;

public interface IPlayerRepository extends JpaRepository<Player, Long> {

}
