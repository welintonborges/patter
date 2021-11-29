package com.example.designpatterns;

import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import imposto.Orcamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }

}
