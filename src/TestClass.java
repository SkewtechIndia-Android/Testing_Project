	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Properties;
	 
	public class TestClass {
	  public static void main(String[] args) {
		String bird = "b";
		String xbname;
		String xsname;
		String xsize;
		String xaweight;
		String xmass;
		String xtlength;
		String xbseason;
		String xdes;
		String xhabits;
		String xhabitat;
		// Property file
		Properties prop = new Properties();
		InputStream input = null;
	 
		try {
	 
			input = new FileInputStream("D:\\Skewtech\\birddetails.properties");
	 
			// load a properties file
			prop.load(input);
			// get the values
		
			xbname = prop.getProperty(bird+"bname");
			xsname = prop.getProperty(bird+"sname");
			xsize = prop.getProperty(bird+"size");
			xaweight = prop.getProperty(bird+"aweight");
			xmass = prop.getProperty(bird+"mass");
			xtlength = prop.getProperty(bird+"tlength");
			xbseason = prop.getProperty(bird+"bseason");
			xdes = prop.getProperty(bird+"des");
			xhabits = prop.getProperty(bird+"habits");
			xhabitat = prop.getProperty(bird+"habitat");
			
			System.out.println(xbname);
			System.out.println(xsname);
			System.out.println(xsize);
			System.out.println(xaweight);
			System.out.println(xmass);
			System.out.println(xtlength);
			System.out.println(xbseason);
			System.out.println(xdes);
			System.out.println(xhabits);
			System.out.println(xhabitat);
		
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {	
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
	  }
	}