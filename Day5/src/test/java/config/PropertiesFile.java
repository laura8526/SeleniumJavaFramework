package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projectPath=	System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();

	}
	public static void getProperties() throws IOException {


		InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestGoogleSearch.browserName = browser;
	}

	public static void setProperties() throws IOException {
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		prop.setProperty("result","pass");
		prop.store(output, null);
	}
}