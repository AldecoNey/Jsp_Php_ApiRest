/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puntoRest.facturas_utn;

import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author neyda
 */
@Path("/facturas")
public class URIs {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factura> obtenerTodasLasFacturas() {
        // Llama a FacturaDAO para obtener todas las facturas y retorna JSON
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Factura obtenerFacturaPorId(@PathParam("id") int id) {
        // Llama a FacturaDAO para obtener una factura por su ID y retorna JSON
    }

    @GET
    @Path("/buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factura> buscarFacturas(
        @QueryParam("puntoVenta") int puntoVenta,
        @QueryParam("comprobante") String comprobante
    ) {
        // Llama a FacturaDAO para buscar facturas por punto de venta y comprobante y retorna JSON
    }
}