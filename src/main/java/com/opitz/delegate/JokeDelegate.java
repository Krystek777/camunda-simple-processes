package com.opitz.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class JokeDelegate implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println(delegateExecution.getVariable("firstname") + " says a joke: " +
                delegateExecution.getVariable("joke"));
    }

}
