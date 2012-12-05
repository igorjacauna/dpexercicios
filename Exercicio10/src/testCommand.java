import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestCommand {

	@Test
	public void testRegistradora() {
		Registradora r = new Registradora();
		r.soma(3);
		assertEquals(3, r.getTotal());
		r.soma(4);
		assertEquals(7, r.getTotal());
		r.subtrai(2);
		assertEquals(5, r.getTotal());
		r.reseta();
		assertEquals(0, r.getTotal());
	}
	
	@Test
	public void testCommand(){
		List<RegistradoraCommand> macro = new ArrayList<RegistradoraCommand>();
		Registradora r = new Registradora();
		r.soma(5); assertEquals(5, r.getTotal());
		
		macro.add(new RegistradoraCommandReseta(r));
		macro.add(new RegistradoraCommandSoma(r, 18));
		macro.add(new RegistradoraCommandSoma(r, 18));
		macro.add(new RegistradoraCommandSubtracao(r, 8));
		assertEquals(5, r.getTotal());
		
		for(RegistradoraCommand rc: macro){
			rc.doExecute();
		}
		System.out.println("Total: "+r.getTotal());
		assertEquals(28, r.getTotal());
		
		
		int i = macro.size() -1;
		macro.get(i--).unDo(); assertEquals(36, r.getTotal());
		macro.get(i--).unDo(); assertEquals(18, r.getTotal());
		macro.get(i--).unDo(); assertEquals(0, r.getTotal());
		macro.get(i--).unDo(); assertEquals(5, r.getTotal());
	}
	

}
