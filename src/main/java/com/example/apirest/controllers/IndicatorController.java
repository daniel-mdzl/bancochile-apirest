package com.example.apirest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.models.Indicator;
import com.example.apirest.models.IndicatorList;
import com.example.apirest.services.IndicatorService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class IndicatorController {

	@Autowired
    private IndicatorService indicatorService;

	@GetMapping("/indicators")
	public ResponseEntity<?> getIndicators() {
		Mono<IndicatorList> indicatorList = null;
		Map<String, Object> response = new HashMap<>();

		try {
            indicatorList = indicatorService.getIndicators();
        }catch(Exception e) {
            response.put("error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.SERVICE_UNAVAILABLE);
        }
		
		return new ResponseEntity<Mono<IndicatorList>>(indicatorList, HttpStatus.ACCEPTED);
	}

	@GetMapping("/indicators/{indicator}")
	public ResponseEntity<?> getIndicatorByName(@PathVariable String indicator) {
		Mono<Indicator> indicatorData = null;
		Map<String, Object> response = new HashMap<>();

		try {
            indicatorData = indicatorService.getIndicatorByName(indicator);
        }catch(Exception e) {
            response.put("error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.SERVICE_UNAVAILABLE);
        }

		 return new ResponseEntity<Mono<Indicator>>(indicatorData, HttpStatus.OK);
	}
}
