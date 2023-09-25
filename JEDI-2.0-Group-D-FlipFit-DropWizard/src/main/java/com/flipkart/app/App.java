package com.flipkart.app;

import com.flipkart.bean.Customer;
import com.flipkart.controller.*;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;

import io.dropwizard.core.Configuration;

public class App extends Application<Configuration>
{
    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new AdminController());
        environment.jersey().register(new CustomerController());
    }
    public static void main ( String[] args ) throws Exception
    {
        new App().run(args);
    }


}
