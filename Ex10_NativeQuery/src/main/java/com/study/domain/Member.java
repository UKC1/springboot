package com.study.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "JPAPAGING")
public class Member {
	@Id
	@SequenceGenerator (
			name="mySequence",
			sequenceName="JPAPAGING_SEQ",
			initialValue=1,
			allocationSize=1
			)
	// 이거 없으면 시퀀스 적용이 안됨
	@GeneratedValue(generator="mySequence")
	private Long id;
	private String email;
	private String name;
}
