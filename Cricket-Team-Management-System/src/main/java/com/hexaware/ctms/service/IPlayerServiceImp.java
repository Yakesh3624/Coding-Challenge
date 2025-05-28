package com.hexaware.ctms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ctms.dto.PlayerDTO;
import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.EmptyTableException;
import com.hexaware.ctms.exception.PlayerNotFoundException;
import com.hexaware.ctms.repository.IPlayerRepository;

@Service
public class IPlayerServiceImp implements IPlayerService {

	@Autowired
	IPlayerRepository playerRepo;
	
	@Override
	public List<PlayerDTO> getAllplayers() throws EmptyTableException {
		
		List<Player> players = playerRepo.findAll();
		if(players.isEmpty())
		{
			throw new EmptyTableException();
		}
		
		return entity2dtoList(players);
	}

	@Override
	public PlayerDTO addPlayer(Player player) {
		
		playerRepo.save(player);
		return entity2dto(player);
	}

	@Override
	public PlayerDTO getByPlayerId(Long playerId) throws PlayerNotFoundException {
		
		Player player = playerRepo.findById(playerId).orElseThrow(()->new PlayerNotFoundException());
		
		return entity2dto(player);
	}

	@Override
	public PlayerDTO updatePlayer(Player player) throws PlayerNotFoundException {
		playerRepo.findById(player.getPlayerId()).orElseThrow(()->new PlayerNotFoundException());
		playerRepo.save(player);
		return entity2dto(player);
	}

	@Override
	public String deletePlayerById(Long playerId) throws PlayerNotFoundException{
		
		playerRepo.findById(playerId).orElseThrow(()->new PlayerNotFoundException());
		playerRepo.deleteById(playerId);
		return playerId+" deleted Successfully";
	}
	
	public static PlayerDTO entity2dto(Player player)
	{
		PlayerDTO playerDto = new PlayerDTO();
		playerDto.setCountryName(player.getCountryName());
		playerDto.setDescription(player.getDescription());
		playerDto.setJerseyNumber(player.getJerseyNumber());
		playerDto.setPlayerId(player.getPlayerId());
		playerDto.setPlayerName(player.getPlayerName());
		playerDto.setRole(player.getRole());
		playerDto.setTeamName(player.getTeamName());
		playerDto.setTotalMatches(player.getTotalMatches());
		
		return playerDto;
	}
	
	public static List<PlayerDTO> entity2dtoList(List<Player> playerList)
	{
		List<PlayerDTO> playerDtoList = new ArrayList<PlayerDTO>();
		
		for(Player player:playerList)
		{
			PlayerDTO playerDto = new PlayerDTO();
			playerDto.setCountryName(player.getCountryName());
			playerDto.setDescription(player.getDescription());
			playerDto.setJerseyNumber(player.getJerseyNumber());
			playerDto.setPlayerId(player.getPlayerId());
			playerDto.setPlayerName(player.getPlayerName());
			playerDto.setRole(player.getRole());
			playerDto.setTeamName(player.getTeamName());
			playerDto.setTotalMatches(player.getTotalMatches());
			
			playerDtoList.add(playerDto);
		}
		
		return playerDtoList;
	}
}
