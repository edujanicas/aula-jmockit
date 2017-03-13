package pt.ulisboa.tecnico.softeng.broker.domain;

import org.junit.*;
import org.junit.runner.RunWith;

import mockit.*;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class TestWithMocks {
	
//	@Injectable
//	Foo bar;
	@Test
	public void method(/*@Mocked Foo f*/) {
		// Set up
		new Expectations() {{
			// Definição dos mocks
		}};
		// Invocar o método em teste
		new Verifications() {{
			// Verificações específicas aos mocks
		}};
		// Asserts
	}

}
