package wasif.spring_dependency_injection.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wasif.spring_dependency_injection.mail.MailSender;

import javax.mail.MessagingException;

@RestController
public class MailController {

    private MailSender mailSender ;

    public MailController( MailSender smtp){
        this.mailSender = smtp;
    }
    @RequestMapping("/mail")
    public String mail() throws MessagingException {

        mailSender.send("wasifali591@gmail.com", "Subject", "Body of the email");
        return "Mail Sent!";
    }

}
