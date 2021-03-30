package com.response.project.Service;

import org.springframework.http.ResponseEntity;

import com.response.project.DTO.MessageDTO;

public interface DefService {
	
	public ResponseEntity<MessageDTO> checkDefValue(String DefValue);

}
