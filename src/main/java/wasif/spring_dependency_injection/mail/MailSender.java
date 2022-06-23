package wasif.spring_dependency_injection.mail;

import javax.mail.MessagingException;

public interface MailSender {
    void send(String to, String subject, String body) throws MessagingException;
}
