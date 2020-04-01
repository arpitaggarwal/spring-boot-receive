package com.arpit.spring.oauth.service.impl;

import com.arpit.spring.oauth.dto.mp.rq.ReceiveOCTRequest;
import com.arpit.spring.oauth.dto.mp.rs.ReceiveOCTResponse;
import com.arpit.spring.oauth.service.VisaDirectReceiveSideService;
import com.arpit.spring.oauth.util.DecryptionUtil;
import com.nimbusds.jose.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VisaDirectReceiveSideServiceImpl implements VisaDirectReceiveSideService {

    private Logger LOGGER = LoggerFactory.getLogger(VisaDirectReceiveSideServiceImpl.class);

    final static String sharedSecret = "qvZHNn78W{g5N2jFpQi8}c3Otkwz4jzwTZQqHQbK";
    final static String keyId = "88b8e88d-5f79-fb70-5569-17fabe9de901";

    @Override
    public ReceiveOCTResponse p2m(Optional<ReceiveOCTRequest> receiveOCTRequestOptional) throws Exception {
        ReceiveOCTResponse receiveOCTResponse = new ReceiveOCTResponse();
        if (receiveOCTRequestOptional.isPresent()) {
            final ReceiveOCTRequest receiveOCTRequest = receiveOCTRequestOptional.get();
            LOGGER.info("P2M request ::" + receiveOCTRequest);

            final String encConsumerPAN = receiveOCTRequest.getEncConsumerPAN();
            Payload consumerPAN = DecryptionUtil.decrypt(encConsumerPAN, sharedSecret);
            LOGGER.info("ConsumerPAN {} ", consumerPAN);

            final String encConsumerName = receiveOCTRequest.getEncConsumerName();
            Payload consumerName = DecryptionUtil.decrypt(encConsumerName, sharedSecret);
            LOGGER.info("ConsumerName {} ", consumerName);

            receiveOCTResponse.setReceiverTransactionId(receiveOCTRequest.getRetrievalReferenceNumber());
            receiveOCTResponse.setAuthIdResponse("00");
        }
        return receiveOCTResponse;
    }
}
