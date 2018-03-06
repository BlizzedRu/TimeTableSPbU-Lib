package ru.blizzed.timetablespbulib.model;

import java.util.List;

public class ApiError {

    private String statusCode;
    private String helpUrl;
    private List<String> errors;

    public String getStatusCode() {
        return statusCode;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public List<String> getErrors() {
        return errors;
    }
}
