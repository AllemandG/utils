package utils;

import java.util.logging.Logger;

public class Main {
	private static Logger logger = Logger.getAnonymousLogger();
	
	public static void main(String[] args) {
		HttpDataService httpData = new HttpDataService();
		
		MyIpService ipService = new MyIpService(httpData);
		
		logger.info(ipService.getMyIp());
	}
}
