package com.example.apirest.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.apirest.models.Indicator;
import com.example.apirest.models.IndicatorList;

import reactor.core.publisher.Mono;

@Service
public class IndicatorService {
    
    private final WebClient webClient;

    public IndicatorService(WebClient.Builder builder){ 
		webClient = builder.baseUrl("https://mindicador.cl/api").build();
	}

	public Mono<IndicatorList> getIndicators() {
		Mono<IndicatorList> indicatorList = null;

		indicatorList = webClient
            .get()
            .uri("/")
            .retrieve()
            .bodyToMono(IndicatorList.class);
        
        return indicatorList;
        
	}

	public Mono<Indicator> getIndicatorByName(String indicator) {
		Mono<Indicator> indicatorData = null;

        indicatorData = webClient
            .get()
            .uri("/"+indicator)
            .retrieve()
            .bodyToMono(Indicator.class);
            
		return indicatorData;
	}
}
