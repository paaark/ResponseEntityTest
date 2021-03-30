package com.response.project.ServiceImpl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.response.project.DTO.MessageDTO;
import com.response.project.Service.DefService;

@Service("DefService")
public class DefServiceImpl implements DefService{
	
	public ResponseEntity<MessageDTO> checkDefValue(String DefValue){
		HttpHeaders headers = new HttpHeaders();
		
		if(!"DEF".equals(DefValue)) {
			return new ResponseEntity<MessageDTO>(getMessage("일치하지 않습니다."), headers, HttpStatus.BAD_REQUEST);
		} else if("".equals(DefValue)) {
			return new ResponseEntity<MessageDTO>(getMessage("빈값입니다."), headers, HttpStatus.BAD_REQUEST);
		} else if("DEF".equals(DefValue)) {
			return new ResponseEntity<MessageDTO>(getMessage("일치합니다."), headers, HttpStatus.OK);
		} else {
			return new ResponseEntity<MessageDTO>(getMessage("정보를 확인해주세요."), headers, HttpStatus.BAD_REQUEST);
		}
			
	}
	
	private MessageDTO getMessage(String getMessage) {
		MessageDTO message = MessageDTO.builder().message(getMessage).build();
		return message;
	}

}
