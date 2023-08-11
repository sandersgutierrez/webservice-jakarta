package io.github.sandersgutierrez.domain.user;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class UserAdapter extends XmlAdapter<UserImpl, User> {
    @Override
    public User unmarshal(UserImpl user) throws Exception {
        return user;
    }

    @Override
    public UserImpl marshal(User user) throws Exception {
        return user instanceof UserImpl ? (UserImpl) user : new UserImpl(user.getName());
    }
}
