
public class TestConexion {
	public static void main(String[] args) throws Exception {

		try (Conexion con = new Conexion()){//try with resources
			con.leerDatos();
		}catch (IllegalStateException ex ) {
			System.out.println("Ejecutando el catch");
			ex.printStackTrace();
		}
		
		/*Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch (IllegalStateException ex) {
			System.out.println("recibiendo exception");
			ex.printStackTrace();
		} finally {
			System.out.println("ejecutando Finally");
			if (con != null){
			con.cerrar();
			}
		}*/
		
		
	}
}
