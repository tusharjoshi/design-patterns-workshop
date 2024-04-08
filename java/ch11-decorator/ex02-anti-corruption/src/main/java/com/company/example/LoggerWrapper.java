package com.company.example;

// tag::source[]
public class LoggerWrapper implements ILogger {
    private User user;
    private LoggerV2 logger;

    public LoggerWrapper(LoggerV2 logger) {
        this(logger, null);
    }

    public LoggerWrapper(LoggerV2 logger, User user) {
        this.logger = logger;
        this.user = user;
    }

    public String log(User user, String message) {
        return logger.logMessage("Called by " + user.getName() + " - " + message);
    }

    public String log(String message) {
        if( user != null ) {
            return logger.logMessage("Called by " + user.getName() + " - " + message);
        } else {
            return logger.logMessage(message);
        }
    }
}
// end::source[]