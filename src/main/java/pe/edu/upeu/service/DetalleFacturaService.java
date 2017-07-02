
package pe.edu.upeu.service;

import java.util.List;


public interface DetalleFacturaService {
    

    List<DetalleFacturaService> listDetalleFactura();

    void guardarProducto(DetalleFacturaService DetalleFactura);

    void eliminarDetalleFacturaId(int id);

    void modificarDetalleFacturaId(DetalleFacturaService DetalleFactura);

    List<DetalleFacturaService> listarPorNombre(String nombre);

    DetalleFacturaService buscarDetalleFacturaId(int id);

}
