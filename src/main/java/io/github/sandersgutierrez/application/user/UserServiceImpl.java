package io.github.sandersgutierrez.application.user;

import io.github.sandersgutierrez.domain.user.User;
import io.github.sandersgutierrez.domain.user.UserService;
import jakarta.jws.WebService;

import java.util.LinkedHashMap;
import java.util.Map;

@WebService(
        endpointInterface = "io.github.sandersgutierrez.domain.HelloWorld",
        serviceName = "User"
)
public class UserServiceImpl implements UserService {
    Map<Integer, User> users = new LinkedHashMap<>();

    @Override
    public Map<Integer, User> getUsers() {
        return users;
    }
}
