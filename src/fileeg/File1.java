package fileeg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		try {

			File f = new File("/usr/abc.txt");
			FileInputStream file = new FileInputStream(f);
		} catch (IOException e)

		{

		}

		catch (Exception e)

		{

		}

	}

}
