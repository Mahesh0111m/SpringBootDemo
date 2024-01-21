package com.example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // if there are multiple implementation for single interface spring boot gives error
//that there are multiple beans which one to execute so to avoid confusion we can mention primary
//annotation on top of class which to execute.
//here we want desktop to be called so made it primary.

public class Desktop implements Computer
{
    public void compile()
    {

        System.out.println("compiling in desktop");
    }
}
