package ie.atu.week12.processpayment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    @PostMapping
    public String makePayment(Person person) {
        return "You called Microoservice 2 - Got person";
    }
}

