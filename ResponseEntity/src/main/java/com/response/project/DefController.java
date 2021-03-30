package com.response.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.response.project.DTO.MessageDTO;
import com.response.project.Service.DefService;

@Controller
public class DefController {
	
	@Autowired
	private DefService DefService;
	
	@ResponseBody
	@PostMapping(value="/isDef")
	public ResponseEntity<MessageDTO> isDef(@RequestParam String DefValue){
		
		return DefService.checkDefValue(DefValue);
		
	}

}
