package com.company.example;

// tag::source[]
public class LoggerWrapper implements ILogger {
    private User user;
    private ILogger logger;

    public LoggerWrapper(ILogger logger) {
        this(logger, null);
    }

    public LoggerWrapper(ILogger logger, User user) {
        this.logger = logger;
        this.user = user;
    }

    public String log(User user, String message) {
        return logger.log("Called by " + user.getName() + " - " + message);
    }

    public String log(String message) {
        if( user != null ) {
            return logger.log("Called by " + user.getName() + " - " + message);
        } else {
            return logger.log(message);
        }
    }
}
// end::source[]