package br.com.project.point_of_sale.dto;

import java.time.LocalDate;

public class CompraDto {
    private LocalDate data;
    private double totalCompra;
    private String situacaoCompra;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    public String getSituacaoCompra() {
        return situacaoCompra;
    }
    public void setSituacaoCompra(String situacaoCompra) {
        this.situacaoCompra = situacaoCompra;
    }
   
}
