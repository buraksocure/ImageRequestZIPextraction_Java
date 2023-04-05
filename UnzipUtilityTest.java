/**
 * A console application that tests the UnzipUtility class
 *
 * @author www.codejava.net
 *
 */
public class UnzipUtilityTest {

	public static void main(String[] args) {
		String zipFilePath = "/Users/burak.kebapci/Desktop/f1a06df6-a162-4cbe-b43d-9e38d594c454.zip";
		String destDirectory = "/Users/burak.kebapci/Desktop/tta";
		UnzipUtility unzipper = new UnzipUtility();

		try {
			unzipper.unzip(zipFilePath, destDirectory);
		} catch (Exception ex) {
			// some errors occurred
			ex.printStackTrace();
		}
	}

}
