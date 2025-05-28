package com.hexaware.ctms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.ctms.entity.Player;

public interface IPlayerRepository extends JpaRepository<Player, Long> {

	@Query("SELECT p FROM Player p WHERE p.totalMatches BETWEEN 50 AND 100")
	public List<Player> filterByTotalMatch();

}
