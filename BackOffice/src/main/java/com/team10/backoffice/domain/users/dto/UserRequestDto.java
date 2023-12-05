package com.team10.backoffice.domain.users.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
	private String username;
	private String password;
	private String email;
	private String introduce;
	private String role;
}
