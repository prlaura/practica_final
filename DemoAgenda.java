public class DemoAgenda{ 

	public static void main(String[] args) {
		Agenda contacto1 = new Agenda();
		Agenda contacto2 = new Agenda();

		contacto1.nombre = "Sergio";
		contacto1.apellido = "Perez";
		contacto1.telefono = 656170419;

		contacto2.nombre = "Amalia";
		contacto2.apellido = "Santana";
		contacto2.telefono = 678555123;
	
		System.out.println("Nuevo contacto en la agenda: " + contacto1.nombre + " " + contacto1.apellido);
		System.out.println("Nuevo contacto en la agenda: " + contacto2.nombre + " " + contacto2.apellido);
	}
	
}




