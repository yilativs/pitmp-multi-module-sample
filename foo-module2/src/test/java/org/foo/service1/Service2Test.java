package org.foo.service1;

import org.foo.service2.Service2;
import org.junit.Assert;
import org.junit.Test;

public class Service2Test {

	@Test
	public void subs() {
		Assert.assertEquals(2, new Service2().sub(5, 3));
	}

}
