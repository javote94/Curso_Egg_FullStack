package principal;

import principal.dominio.fabricante.Fabricante;
import principal.dominio.fabricante.FabricanteService;
import principal.dominio.producto.ProductoService;

public class MainClass {

    public static void main(String[] args) {

        FabricanteService fs = new FabricanteService();
        ProductoService ps = new ProductoService();

        //Creamos nuevos fabricantes
        try {
            fs.crearFabricante("Mirgor", "Argentina");
            fs.crearFabricante("Newsan", "Argentina");

            fs.imprimirFabricantes();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error del sistema por \n" + ex.getMessage());
        }

        //Creamos nuevos productos (le asignamos los nuevos fabricantes)
        try {
            Fabricante fabricante1 = fs.buscarFabricantePorNombre("Mirgor");
            ps.crearProducto("Climatizador", 23.40, fabricante1);

            Fabricante fabricante2 = fs.buscarFabricantePorNombre("Newsan");
            ps.crearProducto("Heladera", 100.5, fabricante2);

            ps.imprimirProductos();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error del sistema por \n" + ex.getMessage());
        }

        /*
        //Modificamos fabricantes
        try {
            fs.modificarNombreFabricantePorCodigo(12, "Mirgor", "IATEC");
            fs.imprimirFabricantes();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error del sistema por \n" + ex.getMessage());
        }
         */
        
        /*
        //Eliminamos fabricantes y productos
        //Primero se eliminan los registros de la tabla producto para romper con la integridad referencial con la tabla fabricante
        try {
            ps.borrarProductoPorCodigo(15);
            ps.borrarProductoPorCodigo(16);

            fs.borrarFabricantePorCodigo(20);
            fs.borrarFabricantePorCodigo(21);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error del sistema por \n" + ex.getMessage());
        }
         */
        
        /*
        //Buscamos fabricante por su código
        try {
            Fabricante fabricante = fs.buscarFabricantePorCodigo(7);
            System.out.println(fabricante);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error del sistema por \n" + ex.getMessage());
        }
         */
        
    }

}
