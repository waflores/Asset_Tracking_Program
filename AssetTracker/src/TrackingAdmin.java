import java.net.InetAddress;


public class TrackingAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			String userName = System.getProperty("user.name");
			String OS = System.getProperty("os.name");
			String OsVersion = System.getProperty("os.version");
			String userHome = System.getProperty("user.home");
			String userOsArch = System.getProperty("os.arch");
			String compName = InetAddress.getLocalHost().getCanonicalHostName();
			
			System.out.println("Windows's Username: " + userName);
			System.out.println(userHome);
			System.out.println(userOsArch);
			System.out.println("Operating System: " + OS + " " + OsVersion);
			
			// Disp com name
			System.out.println(compName);
	}

}
