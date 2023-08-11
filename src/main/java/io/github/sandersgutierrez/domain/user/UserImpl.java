package io.github.sandersgutierrez.domain.user;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "User")
public class UserImpl implements User {
    String name;

    public UserImpl() {
    }

    public UserImpl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
