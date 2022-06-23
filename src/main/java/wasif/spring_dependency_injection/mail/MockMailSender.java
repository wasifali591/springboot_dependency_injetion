package wasif.spring_dependency_injection.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender{

    public static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("sending the MOCK email to: " + to);
        log.info("sending with subject: " + subject);
        log.info("sending with body: " + body);
    }
}
