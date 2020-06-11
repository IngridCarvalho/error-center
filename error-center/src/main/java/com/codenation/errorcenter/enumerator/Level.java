package com.codenation.errorcenter.enumerator;

public enum Level {

    ERROR("Error"),
    WARNING("Warning"),
    INFO("Info");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
