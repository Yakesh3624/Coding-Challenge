package com.hexaware.ctms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PlayerDTO {
	
	private Long playerId;
	private String playerName;
	private Integer jerseyNumber;
	private String role;
	private Integer totalMatches;
	private String teamName;
	private String countryName;
	private String description;
	
	public PlayerDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PlayerDTO [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + "]";
	}
	
	
	
	

}
