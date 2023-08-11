package io.github.sandersgutierrez;

import io.github.sandersgutierrez.application.greeter.GreeterServiceImpl;
import io.github.sandersgutierrez.domain.greeter.GreeterService;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    private Application() {
        logger.info("Starting Server");
        GreeterService implementor = new GreeterServiceImpl();
        String address = "http://localhost:9000/greeter";

        // Endpoint.publish(address, implementor);

        JaxWsServerFactoryBean srvFactory = new JaxWsServerFactoryBean();
        srvFactory.setServiceClass(GreeterService.class);
        srvFactory.setServiceBean(implementor);
        srvFactory.setAddress(address);
        srvFactory.create();
    }

    public static void main(String[] args) {
        new Application();
        logger.info("Server is running ...");
    }
}
