package io.github.sandersgutierrez.domain.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public final class Customer {
    private String name;
    public String address;
    public CustomerType type;
}
