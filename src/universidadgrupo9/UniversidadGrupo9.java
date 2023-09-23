package universidadgrupo9;

import java.sql.Connection;
import universidadgrupo9.accesoADatos.Conexion;
import universidadgrupo9.vistas.UniversidadGrupo9MenuVista;

public class UniversidadGrupo9 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        UniversidadGrupo9MenuVista gui = new UniversidadGrupo9MenuVista();
    }
   
    
}
