package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		
		  // Mostrar el próximo ID que se generará
        System.out.println("El próximo ID será el " + Empleado.devuelveProximoID());
        
		// Crear empleados con diferentes constructores
        Empleado e1 = new Empleado("Juan", 18);
        Empleado e2 = new Empleado("Pepe", 24);
        Empleado e3 = new Empleado();
        Empleado e4 = new Empleado("Cecilia", 29);
        Empleado e5 = new Empleado();

        // Almacenar empleados en un array
        Empleado[] empleados = {e1, e2, e3, e4, e5};

        // Mostrar información de los empleados usando toString()
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString()); // Llamada explícita a toString()
        }

        // Mostrar el próximo ID que se generará
        System.out.println("El próximo ID será el " + Empleado.devuelveProximoID());
	}

}
// comentario para forzar análisis
