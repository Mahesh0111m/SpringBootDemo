package com.example.Spring.ServiceExample;

import com.example.Spring.Repositoryexample;
import com.example.Spring.ServerExample.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemo
{
    @Autowired
    private Repositoryexample repo;
    public  void process(Demo obj)
    {
        repo.save(obj);
    }
}
