package by.it.zebnitskiy.JD_02.JD_02_07;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Created by Зебницкий Максим on 3/24/2016.
 */
public class AllXSD {

    public static void main(String[] args){
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "src/222/NewFile,xml";
        String schemanName = "src/222/NewXMLSchema.xsd,";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemanName);
        try{
            Schema schema = factory.newSchema(schemaLocation);
            // создание валидатора на основе схемы
            Validator validator = schema.newValidator();
            // проверка документа
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println(fileName + " валиден.");
        } catch (IOException e) {
            System.err.print(fileName + " не валиден:"
                    + e.getMessage());
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }


}
