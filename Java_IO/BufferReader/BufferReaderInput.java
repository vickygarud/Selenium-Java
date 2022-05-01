package BufferReader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferReaderInput {

	private static void usingBufferReader() {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			// FileInputStream will read file 1 byte at a time
			// FileInputStream fis = new FileInputStream("E:\\FileHandling\\Scanner.txt");

			bis = new BufferedInputStream(new FileInputStream("E:\\FileHandling\\Scanner.txt"));

			// FileOutputStream fos = new new
			// FileOutputStream("E:\\FileHandling\\Destination.txt");
			// FileOutputStream("E:\\FileHandling\\Destination.txt");

			bos = new BufferedOutputStream(new FileOutputStream("E:\\FileHandling\\Destination.txt"));

			int data;
			while ((data = bis.read()) != -1) {
				System.out.print((char) data);
				bos.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
				bos.flush();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		usingBufferReader();
	}

}

/*
 * 1 - FileInputStream : Java FileInputStream class obtains input bytes from a
 * file. It is used for reading byte-oriented data (streams of raw bytes) such
 * as image data, audio, video etc. You can also read character-stream data.
 * But, for reading streams of characters, it is recommended to use FileReader
 * class.
 * 
 * 2- BufferedInputStream :
 * 
 * Java BufferedInputStream class is used to read information from stream. It
 * internally uses buffer mechanism to make the performance fast.
 * 
 * The important points about BufferedInputStream are:
 * 
 * When the bytes from the stream are skipped or read, the internal buffer
 * automatically refilled from the contained input stream, many bytes at a time.
 * When a BufferedInputStream is created, an internal buffer array is created.
 * 
 * 3- FileOutputStream
 * 
 * Java FileOutputStream is an output stream used for writing data to a file. If
 * you have to write primitive values into a file, use FileOutputStream class.
 * You can write byte-oriented as well as character-oriented data through
 * FileOutputStream class. But, for character-oriented data, it is preferred to
 * use FileWriter than FileOutputStream
 * 
 * 4 - BufferedOutputStream :
 * 
 * Java BufferedOutputStream class is used for buffering an output stream. It
 * internally uses buffer to store data. It adds more efficiency than to write
 * data directly into a stream. So, it makes the performance fast.
 * 
 * For adding the buffer in an OutputStream, use the BufferedOutputStream class.
 * Let's see the syntax for adding the buffer in an OutputStream:
 * 
 */