package com.example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // if there are multiple implementation for single interface spring boot gives error
//that there are multiple beans which one to execute so to avoid confusion we can mention primary
//annotation on top of class which to execute.
//here we want desktop to be called so made it primary.
//we can also do it other way using qualifier anotation in place where we used autowired
//which means when autowired we are connecting two objects in that place if we mention
//qualifier annotaion and specify which object has to be called then that will be called
//even though if we have primary annotaion does not matter it gives priority for qualifier annotation
//we have mentioned primary for desktop
//and mentioned qualifier for laptop
//then laptop get called

public class Desktop implements Computer
{
    public void compile()
    {

        System.out.println("compiling in desktop");
    }
}
