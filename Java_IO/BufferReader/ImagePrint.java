package BufferReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePrint {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\vicky\\OneDrive\\Pictures\\Saved Pictures\\source.jpg");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\vicky\\OneDrive\\Pictures\\Saved Pictures\\Dest\\dest.jpg");

		int data = fis.read();
		while (fis.read() != -1) {
			fos.write(data);
			data = fis.read();
			//fos =  ImageIO.read(fis);

		}

	}

}
