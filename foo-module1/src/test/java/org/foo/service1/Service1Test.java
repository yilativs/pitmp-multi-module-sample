package org.foo.service1;

import org.junit.Assert;

public class Service1Test {

	public void sums() {
		Assert.assertEquals(5, new Service1().sum(2, 3));
	}

}
