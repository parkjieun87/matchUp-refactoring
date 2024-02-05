package com.kh.finalkh11.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Member {
	@Id @GeneratedValue
	@Column(name = "member_id")
	private String memberId;
	
	private String memberPw;
	private String memberName;
	private String memberLevel;
	private String memberEmail;
	private String memberGender;
	private double memberManner;
	private String memberBirth;
	private long imgNo;
}
