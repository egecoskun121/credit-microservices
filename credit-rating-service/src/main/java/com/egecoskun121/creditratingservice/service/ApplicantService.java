package com.egecoskun121.creditratingservice.service;

import com.egecoskun121.creditratingservice.config.RabbitMQConfig;
import com.egecoskun121.creditratingservice.model.Applicant;
import com.egecoskun121.creditratingservice.repository.ApplicantRepository;
import com.egecoskun121.creditratingservice.repository.CreditRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {
    private final ApplicantRepository applicantRepository;
    private final CreditRepository creditRepository;

    private final RabbitTemplate rabbitTemplate;

    public ApplicantService(ApplicantRepository applicantRepository, CreditRepository creditRepository, RabbitTemplate rabbitTemplate) {
        this.applicantRepository = applicantRepository;
        this.creditRepository = creditRepository;
        this.rabbitTemplate = rabbitTemplate;
    }

    @RabbitListener(queues = "credit-queue")
    public void processMessage(Applicant applicant){


        applicant.setCreditRating((int) (Math.random()*2000));
        Applicant copyApplicant = applicant.deepCopy(applicant);
        creditRepository.saveAll(applicant.getCredit());
        applicantRepository.save(copyApplicant);

        sendMessage(applicant);
    }

    public void sendMessage(Applicant applicant){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE,RabbitMQConfig.ROUTING_KEY,applicant);
    }
}
