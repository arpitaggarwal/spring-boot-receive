package com.arpit.spring.oauth.service;

import com.arpit.spring.oauth.dto.mp.rq.ReceiveOCTRequest;

import java.util.Optional;
import com.arpit.spring.oauth.dto.mp.rs.ReceiveOCTResponse;


public interface VisaDirectReceiveSideService {
    ReceiveOCTResponse p2m(Optional<ReceiveOCTRequest> receiveOCTRequest) throws Exception;
}
