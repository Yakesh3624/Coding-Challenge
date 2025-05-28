package com.hexaware.ctms.service;

import java.util.List;

import com.hexaware.ctms.dto.PlayerDTO;
import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.PlayerNotFoundException;

public interface IPlayerService {
	
	
	public List<PlayerDTO> getAllplayers() throws PlayerNotFoundException;
	public PlayerDTO addPlayer(Player player);
	public PlayerDTO getByPlayerId(Long playerId) throws PlayerNotFoundException;
	public PlayerDTO updatePlayer(Player player) throws PlayerNotFoundException;
	public String deletePlayerById(Long playerId) throws PlayerNotFoundException;
	public List<PlayerDTO> filterByTotalMatch();
}
