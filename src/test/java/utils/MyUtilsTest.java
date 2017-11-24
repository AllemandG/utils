package utils;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MyUtilsTest {
	
	@Test
	public void testSum () {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int sum = MyUtils.sum(list);
		Assert.assertThat(sum, Is.is(10));
	}
	
	@Test
	public void testSumNullList () {
		int sum = MyUtils.sum(null);
		Assert.assertThat(sum, Is.is(0));
	}
	
	@Test
	public void testSumWithNullItem () {
		List<Integer> list = Arrays.asList(1, 2, null, 4);
		int sum = MyUtils.sum(list);
		Assert.assertThat(sum, Is.is(7));
	}
	
	@Test
	public void testSumEmptyList () {
		List<Integer> list = Arrays.asList();
		int sum = MyUtils.sum(list);
		Assert.assertThat(sum, Is.is(0));
	}
}
