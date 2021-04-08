package com.response.project.Service;

import org.springframework.http.ResponseEntity;

import com.response.project.DTO.DefDTO;
import com.response.project.DTO.MessageDTO;

public interface DefService {
	
	public ResponseEntity<MessageDTO> checkDefValue(DefDTO DefDTO);
//	public ResponseEntity<MessageDTO> checkDefValue(String defCheckValue);

}
