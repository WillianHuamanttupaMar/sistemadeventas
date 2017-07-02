package pe.edu.upeu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.DetalleFacturaDaoImpl;
import pe.edu.upeu.model.DetalleFactura;


/**
 *
 * @author server-itecs
 */
@Service("DetalleFacturaService")
@Transactional
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    @Autowired
    public DetalleFacturaDaoImpl dao;

    @Override
    public List<DetalleFactura> listDetalleFactura() {
        return dao.listDetalleFactura();
    }

    @Override
    public void guardarDetalleFacturaDao(DetalleFactura DetalleFactura) {
        dao.guardarDetalleFactura(DetalleFactura);
    }

    @Override
    public void eliminarDetalleFacturaId(int id) {
        dao.eliminarDetalleFacturaId(id);
    }

    @Override
    public void modificarDetalleFacturaId(DetalleFactura DetalleFactura) {
        dao.modificarDetalleFacturaId(DetalleFactura);
    }

    @Override
    public List<DetalleFactura> listarPorNombre(String nombre) {
        return dao.listarPorNombre(nombre);
    }

    @Override
    public DetalleFactura buscarDetalleFacturaId(int id) {
        return dao.buscarDetalleFacturaId(id);
    }

}