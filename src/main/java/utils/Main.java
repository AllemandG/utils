package utils;

public class Main {

	public static void main(String[] args) {
		HttpDataService httpData = new HttpDataService();
		
		MyIpService ipService = new MyIpService(httpData);
		
		System.out.println(ipService.getMyIp());
	}
}
