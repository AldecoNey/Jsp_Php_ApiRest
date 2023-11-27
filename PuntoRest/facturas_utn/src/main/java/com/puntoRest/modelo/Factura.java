/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puntoRest.modelo;

import java.util.Date;

/**
 *
 * @author neyda
 */
public class Factura {
    private long id;
    private Date fechaComprobante;
    private char letraComprobante;
    private double montoTotal;
    private long nroComprobante;
    private String observacion;
    private int periodo;
    private int puntoVenta;
    private String tipoComprobante;
    private double montoNeto;
    private double porcentajeDescuento;
    private double saldo;

    public Factura() {
    }

    public Factura(long id, Date fechaComprobante, char letraComprobante, double montoTotal, long nroComprobante, String observacion, int periodo, int puntoVenta, String tipoComprobante, double montoNeto, double porcentajeDescuento, double saldo) {
        this.id = id;
        this.fechaComprobante = fechaComprobante;
        this.letraComprobante = letraComprobante;
        this.montoTotal = montoTotal;
        this.nroComprobante = nroComprobante;
        this.observacion = observacion;
        this.periodo = periodo;
        this.puntoVenta = puntoVenta;
        this.tipoComprobante = tipoComprobante;
        this.montoNeto = montoNeto;
        this.porcentajeDescuento = porcentajeDescuento;
        this.saldo = saldo;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaComprobante() {
        return fechaComprobante;
    }

    public void setFechaComprobante(Date fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public char getLetraComprobante() {
        return letraComprobante;
    }

    public void setLetraComprobante(char letraComprobante) {
        this.letraComprobante = letraComprobante;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public long getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(long nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(int puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
