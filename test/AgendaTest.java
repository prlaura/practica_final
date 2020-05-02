import org.junit.runner.JUnitCore;
import junit.framework.Assert;
//import practica_final.DemoAgenda;

//Este test comprueba si el usuario ya esta definido o no
public class AgendaTest {

	@Test 
	@DisplayName(value = "Test1 --> Resultado esperado cuando el usuario ya existe")
	public void test1() {
		AgendaDemo agendademo = new Agenda();
		String usuario1 = "Sergio " + "Perez";
		String usuarioExistente1 = agendademo.contacto1.nombre + agendademo.contacto1.apellido;
		assertSame(usuario1, usuarioExistente1);
	}
	
	/*@Test 
	@DisplayName(value = "Test2 --> Resultado esperado cuando el usuario ya existe")
	public void test2() {
		AgendaDemo agendademo = new Agenda();
		String usuario2 = "Amalia " + "Santana";
		String usuarioExistente2 = agendademo.contacto2.nombre + agendademo.contacto2.apellido;
		assertSame(usuario2, usuarioExistente2);
	}

	@Test 
	@DisplayName(value = "Test3 --> Resultado esperado cuando el usuario no existe")
	public void test3() {
		AgendaDemo agendademo = new Agenda();
		String usuario3 = "Amalia " + "suearez";
		String usuarioExistente2 = agendademo.contacto2.nombre + agendademo.contacto2.apellido;
		assertNotSame(usuario3, usuarioExistente2);
	}

	@Test 
	@DisplayName(value = "Test4 --> Resultado esperado cuando el usuario no existe")
	public void test4() {
		AgendaDemo agendademo = new Agenda();
		String usuario4 = "Sergio " + "Rodriguez";
		String usuarioExistente1 = agendademo.contacto1.nombre + agendademo.contacto1.apellido;
		assertNotSame(usuario4, usuarioExistente1);
	}*/
}
