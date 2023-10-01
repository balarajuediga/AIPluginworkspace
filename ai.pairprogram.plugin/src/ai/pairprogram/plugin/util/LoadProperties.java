package ai.pairprogram.plugin.util;

import java.io.InputStream;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

 public class LoadProperties {

	public Properties getProperties() {
		Properties properties = new Properties();
			try {
				Bundle	bundle = FrameworkUtil.getBundle(getClass());
				String propertiesFilePath = "/resource/config.properties";
				InputStream inputStream = bundle.getResource(propertiesFilePath).openStream();
				properties.load(inputStream);
			} catch (Exception e) {
				e.printStackTrace();
			}

		return properties;

	}
}
