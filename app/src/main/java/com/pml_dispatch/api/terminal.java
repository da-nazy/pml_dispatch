package com.pml_dispatch.api;

public class terminal {
    private String name;
    private String address;
    private String id;

    public terminal(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
}
