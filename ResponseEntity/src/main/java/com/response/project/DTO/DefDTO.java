package com.response.project.DTO;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefDTO {

	@NotBlank(message="ºó°ªÀÔ´Ï´Ù.")
	private String defCheckValue;
	
}
