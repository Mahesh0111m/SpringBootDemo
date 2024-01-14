package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class example
{
    @Autowired
    laptop lap;
    public void code()

    {
        //System.out.println("From Example");
        //example to show if one class dependent on another
        //and how in this case we can create objects for dependent classes
        //that is by using Autowired annotation it will create objects
        //in main file we have access to AppicationContext but outside
        //we can use Autowired annotation to create objects

        lap.compile();
    }
}
