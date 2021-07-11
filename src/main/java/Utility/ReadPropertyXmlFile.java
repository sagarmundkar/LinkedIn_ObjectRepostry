package Utility;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class ReadPropertyXmlFile {
    /**
     * Dom4j and jaxen dependency added to read data from xml file
     * ReadPropertyXmlFile reads the data from .xml file
     */

    public String id;
    public  String name;
    public  String type;
    public  String Email;
    public String Password;
    public String URL;

    public ReadPropertyXmlFile() throws DocumentException {
        File inputFile = new File("C:\\Users\\Administrator\\IdeaProjects\\ObjectRepostoryDemo\\src\\test\\properties.xml");
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(inputFile);
        URL = document.selectSingleNode("//menu/URL").getText();
        id = document.selectSingleNode("//menu/id").getText();
        name = document.selectSingleNode("//menu/name").getText();
        type = document.selectSingleNode("//menu/type").getText();
        Email = document.selectSingleNode("//menu/Email").getText();
        Password = document.selectSingleNode("//menu/Password").getText();
    }

}
