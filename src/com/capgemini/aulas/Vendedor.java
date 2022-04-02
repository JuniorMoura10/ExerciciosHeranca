package com.capgemini.aulas;

public class Vendedor extends Funcionario{

    private int totalItensVendidos;
    private float comissaoPorItemVendido;

    public Vendedor() {
        super();
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItemVendido() {
        return comissaoPorItemVendido;
    }

    public void setComissaoPorItemVendido(float comissaoPorItemVendido) {
        this.comissaoPorItemVendido = comissaoPorItemVendido;
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItemVendido * totalItensVendidos);
    }
}
