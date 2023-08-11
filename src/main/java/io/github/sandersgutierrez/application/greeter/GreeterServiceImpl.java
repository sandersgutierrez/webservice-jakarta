package io.github.sandersgutierrez.application.greeter;

import io.github.sandersgutierrez.domain.greeter.GreeterService;
import jakarta.jws.WebService;

@WebService(
        endpointInterface = "io.github.sandersgutierrez.domain.greeter.GreeterService",
        serviceName = "greeter"
)
public class GreeterServiceImpl implements GreeterService {
    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s!", !"".equals(name) ? name : "World");
    }
}
