package utils;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
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
	
	@Test
	public void testFilterEvenNumberNormalList () {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		List<Integer> filtered = MyUtils.filterEvenNumber(list);
		Assert.assertThat(filtered, IsEqual.equalTo(Arrays.asList(2, 4)));
	}
	
	@Test
	public void testFilterEvenNumberNullItem () {
		List<Integer> list = Arrays.asList(1, 2, null, 4);
		List<Integer> filtered = MyUtils.filterEvenNumber(list);
		Assert.assertThat(filtered, IsEqual.equalTo(Arrays.asList(2, 4)));
	}
	
	@Test
	public void testFilterEvenNumberNullList () {
		List<Integer> list = null;
		List<Integer> filtered = MyUtils.filterEvenNumber(list);
		Assert.assertThat(filtered, IsEqual.equalTo(Arrays.asList()));
	}
	
	@Test
	public void testFilterEvenNumberAllNullItem () {
		List<Integer> list = Arrays.asList(null, null, null, null);
		List<Integer> filtered = MyUtils.filterEvenNumber(list);
		Assert.assertThat(filtered, IsEqual.equalTo(Arrays.asList()));
	}
	
	@Test
	public void testFilterEvenNumberNoPairItem () {
		List<Integer> list = Arrays.asList(1, 5, 3, 7);
		List<Integer> filtered = MyUtils.filterEvenNumber(list);
		Assert.assertThat(filtered, IsEqual.equalTo(Arrays.asList()));
	}
}
