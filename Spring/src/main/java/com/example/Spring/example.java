package com.example.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class example
{
    @Value("25")
    private int age;

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()

    {
        //System.out.println("From Example");
        //example to show if one class dependent on another
        //and how in this case we can create objects for dependent classes
        //that is by using Autowired annotation it will create objects
        //in main file we have access to AppicationContext but outside
        //we can use Autowired annotation to create objects

        com.compile();
    }
}
