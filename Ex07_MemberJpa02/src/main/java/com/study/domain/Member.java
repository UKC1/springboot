package com.study.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="MEMBERJPA02")
public class Member {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	
	public Member(String email, String name) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	
	
}
