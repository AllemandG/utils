package utils;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class MyDivisibleTest {
	
	@Test
	public void testDivisibleZero () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(0);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList()));
	}
	
	@Test
	public void testDivisibleNegatifNonDivisible () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(-7);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList()));
	}
	
	@Test
	public void testDivisibleNegatifDivisiblePar3 () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(-9);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(3)));
	}
	
	@Test
	public void testDivisibleNegatifDivisiblePar5 () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(-20);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(5)));
	}
	
	@Test
	public void testDivisibleNegatifDivisibleParLesDeux () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(-30);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(3, 5)));
	}
	
	@Test
	public void testDivisiblePar3 () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(6);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(3)));
	}
	
	@Test
	public void testDivisiblePar5 () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(10);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(5)));
	}
	
	@Test
	public void testDivisibleParLesDeux () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(15);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList(3, 5)));
	}
	
	@Test
	public void testDivisibleParAucunDesDeux () {
		List<Integer> list = MyDivisible.estDivisiblePar3par5OuLesDeux(13);
		Assert.assertThat(list, IsEqual.equalTo(Arrays.asList()));
	}
}
