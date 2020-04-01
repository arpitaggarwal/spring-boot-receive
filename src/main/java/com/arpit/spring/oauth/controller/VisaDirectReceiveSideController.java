package com.arpit.spring.oauth.controller;

import com.arpit.spring.oauth.dto.mp.rq.ReceiveOCTRequest;
import com.arpit.spring.oauth.service.VisaDirectReceiveSideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import com.arpit.spring.oauth.dto.mp.rs.ReceiveOCTResponse;

@RestController
@RequestMapping(value = "/visa/receive")
@CrossOrigin
public class VisaDirectReceiveSideController {

    private Logger LOGGER = LoggerFactory.getLogger(VisaDirectReceiveSideController.class);

    @Autowired
    private VisaDirectReceiveSideService visaDirectReceiveSideService;

    @PostMapping(value = "/oct")
    public ResponseEntity oct(@RequestBody Optional<ReceiveOCTRequest> receiveOCTRequest) {
        LOGGER.info("OCT received {}", receiveOCTRequest);
        final ReceiveOCTResponse receiveOctResponse = new ReceiveOCTResponse();
        receiveOctResponse.setResponseCode("00");
        receiveOctResponse.setAuthIdResponse("00");
        receiveOctResponse.setCpsAuthorizationCharacteristicsIndicator("00");
        receiveOctResponse.setReceiverTransactionId("00");
        return new ResponseEntity<>(receiveOctResponse,
                HttpStatus.OK);
    }

    @PostMapping(value = "/oct/pushpayment/transactions/receive/p2m")
    public ResponseEntity p2m(@RequestBody Optional<ReceiveOCTRequest> receiveOCTRequest) throws Exception {
        LOGGER.info("P2M received {}", receiveOCTRequest);
        ReceiveOCTResponse receiveOCTResponse = visaDirectReceiveSideService.p2m(receiveOCTRequest);
        return new ResponseEntity<>(receiveOCTResponse,
                HttpStatus.OK);
    }
}
