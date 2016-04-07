package by.it.zebnitskiy.JD_02.JD_02_09;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * Created by Зебницкий Максим on 3/30/2016.
 */
      public class MainJAXB {
        final static String root="src/by/it/zebnitskiy/JD_02/JD_02_09/";
        public static void main(String[] args){
                String fileName=root+"JAX_XML.xml";
                        try{
                               TransformerFactory tf = TransformerFactory.newInstance();
                               Transformer transformer = tf.newTransformer(new StreamSource(root+"JAX_XML.xsl"));
                                transformer.transform(new StreamSource(root+"JAX_XML.xml"),  new StreamResult(root+"JAX.html"));
                                System.out.println("Transform " + fileName + " complete");

                                    }catch (TransformerException e){
                                System.err.println("Impossible transformer file " + fileName+ " : " +e);
                            }
            }
    }
