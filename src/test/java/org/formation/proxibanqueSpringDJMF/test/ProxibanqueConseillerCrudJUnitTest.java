package org.formation.proxibanqueSpringDJMF.test;

import static org.junit.Assert.*;

import org.formation.proxibanqueSpringDJMF.config.ProxibanqueConfig;
import org.formation.proxibanqueSpringDJMF.dao.CrudConseillerDAO;
import org.formation.proxibanqueSpringDJMF.service.ProxibanqueConseillerServiceImplCrud;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ProxibanqueConfig.class)
@WebAppConfiguration
public class ProxibanqueConseillerCrudJUnitTest {

	@Autowired
	private ProxibanqueConseillerServiceImplCrud proxibanqueConseillerServiceImplCrud;
	
	@Autowired
	private CrudConseillerDAO CrudConseillerDAO;
	
	@Test
	public void test() {
		assertNotNull(proxibanqueConseillerServiceImplCrud);
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void testConseillerDao() {
		assertNotNull(CrudConseillerDAO);
	}

}
