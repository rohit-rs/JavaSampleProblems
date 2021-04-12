package regexeg;

class ValidateIPAddress {

	public static void main(String[] args) {
		String ip = "023.45.12.56";
		String regex = "(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
		System.out.println(ip.matches(regex));
	}

}
