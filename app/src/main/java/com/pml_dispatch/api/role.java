package com.pml_dispatch.api;

public class role {
    String _id;
    String name;
    String id;

    public role(String _id, String name, String id) {
        this._id = _id;
        this.name = name;
        this.id = id;
    }


    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
