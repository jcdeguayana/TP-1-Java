package ejercicio1;

public class Empleado
{
	private final int id;
	private String nombre;
	private int edad; 
	private static int cont = 1000;

	Empleado()
	{
		this.id = cont++; 
		this.nombre = "Sin Nombre";
		this.edad = 99;	
	}
	
	Empleado(String _nombre, int _edad)
	{
		this.id = cont++;
		this.nombre = _nombre;
		this.edad = _edad;
	}
	
	
	//Getters y Setters.
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
		}
		else {
			System.out.println("La edad debe ser mayor que 0.");
		}
		
	}
	
		// Método para mostrar información
		public void mostrarInfo() {
			System.out.println("ID: " + id);
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
		}
		
		public static int devuelveProximoID() 
		{
			return cont; 
		}

		 // Método toString para mostrar la información correctamente
	    @Override
	    public String toString() {
	        return "Empleado: " + nombre + ", Edad: " + edad + ", Legajo: " + id;
	    }
		
		
		
}
