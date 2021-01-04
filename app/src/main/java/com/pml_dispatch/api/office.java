package com.pml_dispatch.api;

public class office {
    String _id;
    String type;
    String id;

    public office(String _id, String type, String id) {
        this._id = _id;
        this.type = type;
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
