package com.hexaware.ctms.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ctms.dto.PlayerDTO;
import com.hexaware.ctms.entity.Player;
import com.hexaware.ctms.exception.PlayerNotFoundException;
import com.hexaware.ctms.service.IPlayerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PlayerRestController {
	
	@Autowired
	IPlayerService service;
	
	@GetMapping(value="/players", produces = "application/json")
	public List<PlayerDTO> getAllPlayers() throws PlayerNotFoundException
	{
		System.out.println(service.getAllplayers().toString());
		return service.getAllplayers();
		
	}
	
	@PostMapping("/players")
	public PlayerDTO addPlayer(@RequestBody Player player)
	{
		return service.addPlayer(player);
	}
	
	@GetMapping("/players/{playerId}")
	public PlayerDTO getByPlayerId(@PathVariable Long playerId) throws PlayerNotFoundException
	{
		return service.getByPlayerId(playerId);
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
	
	@GetMapping("/players/filter-by-match")
	public List<PlayerDTO> getAllPlayersByTotalMatch()
	{
		return service.filterByTotalMatch();
	}

}
