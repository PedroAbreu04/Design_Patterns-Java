package behavioural.strategy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;

import com.luciad.imageio.webp.WebPWriteParam;

public class WEBPStrategy implements Strategy {

	@Override
	public File convert(File input, String output) {
		try {
			BufferedImage image = ImageIO.read(input);
			// File webp = new File(output);
			// ImageIO.write(image, "webp", webp);
			//
			ImageWriter writer = ImageIO.getImageWritersByMIMEType("image/webp").next();
			 
			WebPWriteParam writeParam = new WebPWriteParam(writer.getLocale());
			writeParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			writeParam.setCompressionType(writeParam.getCompressionTypes()[WebPWriteParam.LOSSY_COMPRESSION]);
			writeParam.setCompressionQuality(0.6f);
			 
			File webp = new File(output);
			writer.setOutput(new FileImageOutputStream(webp));
			writer.write(null, new IIOImage(image, null, null), writeParam);
			 
			return webp;
		} catch (IOException e) {
			e.printStackTrace();
	}
		return null;
	}

}
