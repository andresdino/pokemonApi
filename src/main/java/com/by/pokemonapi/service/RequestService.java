package com.by.pokemonapi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.by.pokemonapi.entity.Request;
import com.by.pokemonapi.repository.RequestRepository;


@Service
public class RequestService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestService.class);
	
	@Autowired
	RequestRepository requestRepository;
	 
	public void saveRequest(String ip, String method) {
		LOGGER.info("Save Request with ip " + ip + " method " + method);
		Request request = new Request();
		request.setIpOrigin(ip);
		request.setMethod(method);
		request.setDateRequest(new Date());
		
		requestRepository.save(request);
		
	}
	
	public List<Request> getRequest() {
		List<Request> requestList = new ArrayList<Request>();
		
		Iterable<Request> requestIt = requestRepository.findAll();
		requestIt.forEach(requestList::add);
		return requestList;
	}
}
