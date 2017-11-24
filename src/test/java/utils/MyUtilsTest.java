package utils;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
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
	
	@Test
	public void testEmptyToNull_NullValue () {
		String str = MyUtils.emptyToNull(null);
		Assert.assertThat(str, IsNull.nullValue());
	}
	
	@Test
	public void testEmptyToNullEmptyValue () {
		String str = MyUtils.emptyToNull("");
		Assert.assertThat(str, IsNull.nullValue());
	}
	
	@Test
	public void testEmptyToNullNotEmptyValue () {
		String str = MyUtils.emptyToNull("str");
		Assert.assertThat(str, IsNull.notNullValue());
	}
}
