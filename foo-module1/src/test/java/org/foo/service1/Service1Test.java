package org.foo.service1;

import org.junit.Assert;
import org.junit.Test;

public class Service1Test {

	@Test
	public void sums() {
		Assert.assertEquals(5, new Service1().sum(2, 3));
		Assert.fail("this module should not be executed!");
	}

}
