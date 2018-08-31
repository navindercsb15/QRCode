import java.io.FileOutputStream;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.multi.qrcode.QRCodeMultiReader;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class TestQR {
	
	public static void main(String[] args) {
		try {
			String myString = "Name: Pranjal Das\nNumber: +91-8134024739\nEmail Id: pdtezucse@gmail.com\nHostel : KMH/170";
			
			QRCode qrc = QRCode.from(myString);
			qrc.withSize(200, 200);
			qrc = qrc.to(ImageType.PNG);
			String filePath = "e:/demo.jpg";
			
			FileOutputStream fos = new FileOutputStream(filePath,false);
			qrc.writeTo(fos);
			
			fos.close();

			System.out.println("QR code generation succesfull");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}