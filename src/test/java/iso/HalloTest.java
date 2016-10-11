package iso;


import com.ldx.xml.core.ParserConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.net.URL;

//@RunWith(SpringJUnit4ClassRunner.class)
public class HalloTest {
    final String xml = "pain.001.001.03 NAVtest0001.xml";
    final String config = "ldx-map.conf";
    final String schema = "pain.001.001.03.xsd";
    @Test
    public void hallo(){


          try{
//              String aa=this.getClass().getResourceAsStream("/" + config).toString();
//              InputStreamReader is= new InputStreamReader(this.getClass().getResourceAsStream("/" + config));
//              BufferedReader reader = new BufferedReader(is);
//              // BufferedReader reader = new BufferedReader(new FileReader(config));
//              ClassLoader classLoader = getClass().getClassLoader();
//              File file = new File(classLoader.getResource(config).getFile());
//              FileInputStream fis = new FileInputStream(file);
              //InputStream stream =ClassLoader.class.getResourceAsStream(config);
              URL path = ClassLoader.getSystemResource(config);
              File f = new File(path.toURI());

              BufferedReader reader = new BufferedReader(new FileReader(f));
              String a =reader.toString();
            ParserConfiguration.instance().load(reader.toString());
              Assert.assertTrue(true);
        }catch(Exception e) {
            Assert.assertTrue(false);
        }

    }
}
