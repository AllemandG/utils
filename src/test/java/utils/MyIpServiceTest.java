package utils;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyIpServiceTest {
	HttpDataService httpDataMock;
	MyIpService ipService;
	
	@Before
	public void before() {
		httpDataMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpDataMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Tell your senator to resist Trump: https://www.senate.gov/senators/contact/\"}");
		ipService = new MyIpService(httpDataMock);
	}

	@Test
	public void testMyIpService() {
		Assert.assertThat(ipService.getMyIp(), IsEqual.equalTo("92.154.66.22"));
		Mockito.verify(httpDataMock).getJsonIp();
	}
}
