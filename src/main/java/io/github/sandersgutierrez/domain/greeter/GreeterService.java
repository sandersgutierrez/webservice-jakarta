package io.github.sandersgutierrez.domain.greeter;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface GreeterService {
    String sayHello(@WebParam(name = "name") String name);
}
