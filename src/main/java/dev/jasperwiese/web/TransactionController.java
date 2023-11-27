package dev.jasperwiese.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.jasperwiese.service.TransactionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    private TransactionService transactionService;

    private ObjectMapper objectMapper;


}
