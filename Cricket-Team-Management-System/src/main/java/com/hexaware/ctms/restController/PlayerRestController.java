package com.hexaware.ctms.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ctms.dto.PlayerDTO;
import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.EmptyTableException;
import com.hexaware.ctms.exception.PlayerNotFoundException;
import com.hexaware.ctms.service.IPlayerService;

@RestController("/api")
public class PlayerRestController {
	
	@Autowired
	IPlayerService service;
	
	@GetMapping("/players")
	public String getAllPlayers() throws EmptyTableException
	{
		System.out.println(service.getAllplayers().toString());
		return service.getAllplayers().toString();
		
	}
	
	@PostMapping("/players")
	public PlayerDTO addPlayer(@RequestBody Player player)
	{
		return service.addPlayer(player);
	}
	
	@GetMapping("/players/{playerId}")
	public String getByPlayerId(@PathVariable Long playerId) throws PlayerNotFoundException
	{
		return service.getByPlayerId(playerId).toString();
	}
	
	@PutMapping("/players")
	public PlayerDTO updatePlayer(@RequestBody Player player) throws PlayerNotFoundException
	{
		return service.updatePlayer(player);
	}
	
	@DeleteMapping("/players/{playerId}")
	public String deletePlayerById(@PathVariable Long playerId) throws PlayerNotFoundException
	{
		return service.deletePlayerById(playerId);
	}

}
