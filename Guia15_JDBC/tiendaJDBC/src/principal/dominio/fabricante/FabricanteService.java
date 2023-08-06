package principal.dominio.fabricante;

import java.util.Collection;
import principal.persistencia.FabricanteDAO;

public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre, String nacionalidad) throws Exception {
        try {
            //Validación
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
                throw new Exception("Debe indicar una nacionalidad");
            }

            //Creamos el fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            fabricante.setNacionalidad(nacionalidad);
            dao.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public void borrarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar un código de fabricante correcto");
            }
            dao.eliminarFabricantePorCodigo(codigo);

        } catch (Exception ex) {
            throw ex;
        }
    }

    public void modificarNombreFabricantePorCodigo(Integer codigo, String nombreActual, String nombreNuevo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar un código de fabricante correcto");
            }
            if (nombreActual == null || nombreActual.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante existente correctamente");
            }
            if (nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre nuevo");
            }

            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);  //Antes de modificar, debemos capturar al fabricante de la base de datos.

            if (!fabricante.getNombre().equals(nombreActual)) {
                throw new Exception("El nombre actual ingresado no es el que está registrado en el sistema para el código indicado");
            }

            fabricante.setNombre(nombreNuevo);  //Modificamos su nombre.

            dao.modificarFabricante(fabricante);  //El objeto fabricante que modificamos lo pasamos como argumento.

        } catch (Exception ex) {
            throw ex;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el código del fabricante");
            }

            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);

            return fabricante;

        } catch (Exception ex) {
            throw ex;
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }

            Fabricante fabricante = dao.buscarFabricantePorNombre(nombre);

            return fabricante;

        } catch (Exception ex) {
            throw ex;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            return fabricantes;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void imprimirFabricantes() throws Exception {
        try {

            Collection<Fabricante> fabricantes = listarFabricantes();

            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f);
                }
            }

        } catch (Exception ex) {
            throw ex;
        }
    }
}
