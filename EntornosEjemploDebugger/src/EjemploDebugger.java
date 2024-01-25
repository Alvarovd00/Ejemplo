
public class EjemploDebugger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//EJEMPLO
		
		System.out.println("hola");
		
		
		for (int i=0;i<10;i++) {
			System.out.println("iteración nº "+ i);
		}
		
		ArrayList<Cliente> clientes = null;
			
		
		
		for(Cliente cliente:clientes) {	
		
			cliente.darDeAlta();
			cliente.enviarSpam();
			
		}
	}

}
