package com.response.project;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.response.project.DTO.DefDTO;
import com.response.project.DTO.MessageDTO;
import com.response.project.Service.DefService;

@RestController
public class DefController {
	
	@Autowired
	private DefService DefService;
	
	@PostMapping(value="/isDef")
//	public ResponseEntity<MessageDTO> isDef(@RequestParam(value="defCheckValue", required=false) String defCheckValue){
	public ResponseEntity<?> isDef(@Valid @RequestBody DefDTO DefDTO){
		System.out.println("DefDTO : "+DefDTO.getDefCheckValue());
//		return DefService.checkDefValue(defCheckValue);
		return DefService.checkDefValue(DefDTO);
		
	}

}
