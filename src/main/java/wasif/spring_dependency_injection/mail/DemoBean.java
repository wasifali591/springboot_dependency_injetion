package wasif.spring_dependency_injection.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {
    private static Log log = LogFactory.getLog(DemoBean.class);

    public DemoBean() {
        log.info("Demo Bean Created!");
    }
}
