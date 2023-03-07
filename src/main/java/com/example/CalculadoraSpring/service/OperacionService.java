package com.example.CalculadoraSpring.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionService implements OperacionServiceI{

    @Override
    public int sumar(int n1, int n2) {
        return n1+n2;
    }
    @Override
    public int restar(int n1, int n2) {
        return n1-n2;
    }
    @Override
    public int multiplicar(int n1, int n2) {
        return n1*n2;
    }
    @Override
    public int dividir(int n1, int n2) {
        return n1/n2;
    }
}
