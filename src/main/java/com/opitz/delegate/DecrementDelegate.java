package com.opitz.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class DecrementDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(DecrementDelegate .class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String name = (String)delegateExecution.getVariable("name");
        long id = (Long)delegateExecution.getVariable("id") - 1;
        LOGGER.info("decrementing: " + name + " " + id);
    }
}
