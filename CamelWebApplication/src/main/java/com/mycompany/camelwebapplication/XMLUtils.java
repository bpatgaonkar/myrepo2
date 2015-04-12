/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.camelwebapplication;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 *
 * @author 160665
 */
public class XMLUtils {
    public static final String EMI_PREFIX		   = "exEMI";
    public static Document createDocumentFromString(String xmlString) throws IOException, SAXException, ParserConfigurationException {
        Document document = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            InputStream fis = new ByteArrayInputStream(xmlString.getBytes());

            document = builder.parse(fis);
            fis.close();

        } catch (ParserConfigurationException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (SAXException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (IOException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        }

        return document;
    }

    public static Document createDocumentFromFile(String xmlFilePath) throws IOException, SAXException, ParserConfigurationException {
        Document document = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            FileInputStream fis = new FileInputStream(new File(xmlFilePath));

            document = builder.parse(fis);
            fis.close();

        } catch (ParserConfigurationException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (SAXException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (IOException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        }

        return document;
    }

    public static Document createDocumentFromInputStream(InputStream xmlFileStream) throws IOException, SAXException, ParserConfigurationException {
        Document document = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(xmlFileStream);

        } catch (ParserConfigurationException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (SAXException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        } catch (IOException e) {
            System.out.println("Failed to convert text to document: " + e);
            throw e;
        }

        return document;
    }
    
    public static void updateNodeCDATAValue(Document document,String completeElementName, String value) throws TransformerException {
            Node uuidNode = XPathAPI.selectSingleNode(document, "//*[name()='" + EMI_PREFIX + ":" + completeElementName + "']");
            if(uuidNode != null) {
                    if(uuidNode.hasChildNodes()) {
                            uuidNode.removeChild(uuidNode.getChildNodes().item(0));
                    }                       
                    uuidNode.appendChild(document.createCDATASection(value));
            }     
    } 
    public static String xmlToString(Node node) throws TransformerException {
        try {
            Source source = new DOMSource(node);
            StringWriter stringWriter = new StringWriter();
            Result result = new StreamResult(stringWriter);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(source, result);
            return stringWriter.getBuffer().toString();
        } catch (TransformerConfigurationException e) {
        	System.out.println("Failed to convert document to text: "+e);
            throw e;
        } catch (TransformerException e) {
        	System.out.println("Failed to convert document to text: "+e);
            throw e;
        }
    }    
}
