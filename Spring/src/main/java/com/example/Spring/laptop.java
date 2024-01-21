package com.example.Spring;

import org.springframework.stereotype.Component;

@Component
public class laptop implements Computer
{
    public void compile()
    {

        System.out.println("compiling in Laptop");
    }
}
