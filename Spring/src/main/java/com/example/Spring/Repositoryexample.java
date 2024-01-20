package com.example.Spring;

import com.example.Spring.ServerExample.Demo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Repositoryexample
{
    public void save(Demo obj)
    {
        System.out.println("Saved in Database");
    }
}
