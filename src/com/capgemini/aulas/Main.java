package com.capgemini.aulas;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Júnior");
        v.setSalario(1000.0f);
        v.setCpf("123.456.789-10");
        v.setDataNascimento(new Date());
        v.setComissaoPorItemVendido(10.0f);
        v.setTotalItensVendidos(50);

        System.out.println("O salário do vendedor neste mês foi de: " + v.calcularSalario());;

        //Motorista m = new Motorista();

    }
}
