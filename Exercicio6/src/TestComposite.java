import static org.junit.Assert.*;

import org.junit.Test;

public class TestComposite {

	@Test
	public void test() {
		Submenu menu = new Submenu("Menu Principal");
		ItemDeMenu cadFun = new OpcaoDeMenu("Cadastro de Funcionários");
		ItemDeMenu cadProj = new OpcaoDeMenu("Cadastro de Projetos");
		
		Submenu realMenu = new Submenu("Relatórios");
		ItemDeMenu realFun = new OpcaoDeMenu("Relatórios de Funcionários");
		ItemDeMenu realProj = new OpcaoDeMenu("Relatórios de Projetos");

		menu.add(cadFun);
		menu.add(cadProj);

		realMenu.add(realFun);
		realMenu.add(realProj);
		menu.add(realMenu);

		assertEquals(true, realFun.disponivel());
		assertEquals(true, realProj.disponivel());

		realMenu.disabilite();

		assertEquals(false, realFun.disponivel());
		assertEquals(false, realProj.disponivel());
	}

}
