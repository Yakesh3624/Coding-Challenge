package com.hexaware.ctms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Player {

	@Id
	private Long playerId;
	@Size(min = 3, max = 26)
	private String playerName;
	@Positive
	private Integer jerseyNumber;
	@Pattern(regexp = "Batsman|Bowler|Keeper|All Rounder")
	private String role;
	@PositiveOrZero
	private Integer totalMatches;
	@Size(min = 3, max = 20)
	private String teamName;
	@NotNull
	private String countryName;
	@Size(min = 10, max = 100)
	private String description;

	public Player() {
		super();
	}

}
