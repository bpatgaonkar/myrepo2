/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.camelwebapplication;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author 160665
 */
public class MsgProcessor implements Processor{

    protected ProducerTemplate template;
    protected EmmyContextLoader emmyContextLoader;
    public void process(Exchange exchange) throws Exception {
        System.out.println("processing message:\n"+ exchange.getIn().getBody());
        if(emmyContextLoader!=null){
            emmyContextLoader.loadEmmyContext();
        }
        /*String inMssgage = exchange.getIn().getBody(String.class);
        Document requestDoc= XMLUtils.createDocumentFromString(inMssgage);
        Document templateDocM2 = XMLUtils.createDocumentFromFile("D:\\NetBeansProjects\\CamelWeb\\src\\java\\HCT-CLOSR-RESPONSE-M2.xml");
        Document templateDocM3 = XMLUtils.createDocumentFromFile("D:\\NetBeansProjects\\CamelWeb\\src\\java\\HCT-CLOSR-RESPONSE-M3.xml");
        */
        // Set Analysis date and time to current date and time
        /*
        java.util.Date now = new java.util.Date();
			
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        
        
        
        Node analysisDateNode = XPathAPI.selectSingleNode(templateDoc, "//experITy-PLAN-Output/@AnalysisDate");
        XMLUtils.updateNodeCDATAValue(templateDoc, "//experITy-PLAN-Output/@AnalysisDate", dateFormat.format(now));
        System.out.println(XMLUtils.xmlToString(templateDoc));
        analysisDateNode.setNodeValue(dateFormat.format(now));
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        Node analysisTimeNode = XPathAPI.selectSingleNode(templateDoc, "//experITy-PLAN-Output/@AnalysisTime");
        analysisTimeNode.setNodeValue(timeFormat.format(now));		

        Node filoanIdSourceNode = XPathAPI.selectSingleNode(requestDoc, "//Document/experITy-PLAN-Input/SummaryRequest/@LoanIdentifier");
        Node filoanIdTargetNode = XPathAPI.selectSingleNode(requestDoc, "//experITy-PLAN-Output/Result/@LoanIdentifier");
        filoanIdTargetNode.setNodeValue(filoanIdSourceNode.getNodeValue());        
        */

        /*Node filoanIdSourceNode = XPathAPI.selectSingleNode(requestDoc, "//MORTGAGE_TERMS/@LenderCaseIdentifier");
        Node filoanIdTargetNodeM2 = XPathAPI.selectSingleNode(templateDocM2, "//MORTGAGE_TERMS/@LenderCaseIdentifier");
        filoanIdTargetNodeM2.setNodeValue(filoanIdSourceNode.getNodeValue());        
        Node filoanIdTargetNodeM3 = XPathAPI.selectSingleNode(templateDocM3, "//MORTGAGE_TERMS/@LenderCaseIdentifier");
        filoanIdTargetNodeM3.setNodeValue(filoanIdSourceNode.getNodeValue());        

        
        
        Node losOrderIdSourceNode = XPathAPI.selectSingleNode(requestDoc, "//EXPERE_EXT/@LOSOrderNumber_EXT");
        Node losOrderTargetNodeM2 = XPathAPI.selectSingleNode(templateDocM2, "//EXPERE_EXT/@LOSOrderNumber_EXT");
        losOrderTargetNodeM2.setNodeValue(losOrderIdSourceNode.getNodeValue());        
        Node losOrderTargetNodeM3 = XPathAPI.selectSingleNode(templateDocM3, "//EXPERE_EXT/@LOSOrderNumber_EXT");
        losOrderTargetNodeM3.setNodeValue(losOrderIdSourceNode.getNodeValue());        
        */
       
        // send m2 to default endpoint
        //template.sendBody(XMLUtils.xmlToString(templateDocM2));
  
        //System.out.println("sending response as m2"+XMLUtils.xmlToString(templateDocM2));
        
       // send m3 to default endpoint
       //template.sendBody(XMLUtils.xmlToString(templateDocM3));
    }

    public ProducerTemplate getTemplate() {
        return template;
    }

    public void setTemplate(ProducerTemplate template) {
        this.template = template;
    }

    public EmmyContextLoader getEmmyContextLoader() {
        return emmyContextLoader;
    }

    public void setEmmyContextLoader(EmmyContextLoader emmyContextLoader) {
        this.emmyContextLoader = emmyContextLoader;
    }
    
}
