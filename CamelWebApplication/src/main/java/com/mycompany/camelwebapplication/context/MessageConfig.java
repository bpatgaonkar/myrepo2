/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.mycompany.camelwebapplication.context;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.ArrayList;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class MessageConfig.
 * 
 * @version $Revision$ $Date$
 */
public class MessageConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _enabled
     */
    private java.lang.String _enabled;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _templateFilesList
     */
    private java.util.List _templateFilesList;

    /**
     * Field _mep
     */
    private java.lang.String _mep;

    /**
     * Field _action
     */
    private java.lang.String _action;

    /**
     * Field _processorClass
     */
    private java.lang.String _processorClass;

    /**
     * Field _responseDelay
     */
    private java.lang.String _responseDelay;

    /**
     * Field _messageStorage
     */
    private java.lang.String _messageStorage;


      //----------------/
     //- Constructors -/
    //----------------/

    public MessageConfig() {
        super();
        _templateFilesList = new ArrayList();
    } //-- com.dorado.chaseels.cinttestharness.generated.MessageConfig()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTemplateFiles
     * 
     * @param vTemplateFiles
     */
    public void addTemplateFiles(java.lang.String vTemplateFiles)
        throws java.lang.IndexOutOfBoundsException
    {
        _templateFilesList.add(vTemplateFiles);
    } //-- void addTemplateFiles(java.lang.String) 

    /**
     * Method addTemplateFiles
     * 
     * @param index
     * @param vTemplateFiles
     */
    public void addTemplateFiles(int index, java.lang.String vTemplateFiles)
        throws java.lang.IndexOutOfBoundsException
    {
        _templateFilesList.add(index,vTemplateFiles);
    } //-- void addTemplateFiles(int, java.lang.String) 

    /**
     * Method enumerateTemplateFiles
     */
    public java.util.Iterator enumerateTemplateFiles()
    {
        return _templateFilesList.iterator();
    } //-- java.util.Enumeration enumerateTemplateFiles() 

    /**
     * Returns the value of field 'action'.
     * 
     * @return the value of field 'action'.
     */
    public java.lang.String getAction()
    {
        return this._action;
    } //-- java.lang.String getAction() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'enabled'.
     * 
     * @return the value of field 'enabled'.
     */
    public java.lang.String getEnabled()
    {
        return this._enabled;
    } //-- java.lang.String getEnabled() 

    /**
     * Returns the value of field 'mep'.
     * 
     * @return the value of field 'mep'.
     */
    public java.lang.String getMep()
    {
        return this._mep;
    } //-- java.lang.String getMep() 

    /**
     * Returns the value of field 'messageStorage'.
     * 
     * @return the value of field 'messageStorage'.
     */
    public java.lang.String getMessageStorage()
    {
        return this._messageStorage;
    } //-- java.lang.String getMessageStorage() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'processorClass'.
     * 
     * @return the value of field 'processorClass'.
     */
    public java.lang.String getProcessorClass()
    {
        return this._processorClass;
    } //-- java.lang.String getProcessorClass() 

    /**
     * Returns the value of field 'responseDelay'.
     * 
     * @return the value of field 'responseDelay'.
     */
    public java.lang.String getResponseDelay()
    {
        return this._responseDelay;
    } //-- java.lang.String getResponseDelay() 

    /**
     * Method getTemplateFiles
     * 
     * @param index
     */
    public java.lang.String getTemplateFiles(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _templateFilesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_templateFilesList.get(index);
    } //-- java.lang.String getTemplateFiles(int) 

    /**
     * Method getTemplateFiles
     */
    public java.lang.String[] getTemplateFiles()
    {
        int size = _templateFilesList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_templateFilesList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getTemplateFiles() 

    /**
     * Method getTemplateFilesCount
     */
    public int getTemplateFilesCount()
    {
        return _templateFilesList.size();
    } //-- int getTemplateFilesCount() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllTemplateFiles
     */
    public void removeAllTemplateFiles()
    {
        _templateFilesList.clear();
    } //-- void removeAllTemplateFiles() 

    /**
     * Method removeTemplateFiles
     * 
     * @param index
     */
    public java.lang.String removeTemplateFiles(int index)
    {
        java.lang.Object obj = _templateFilesList.get(index);
        _templateFilesList.remove(index);
        return (String)obj;
    } //-- java.lang.String removeTemplateFiles(int) 

    /**
     * Sets the value of field 'action'.
     * 
     * @param action the value of field 'action'.
     */
    public void setAction(java.lang.String action)
    {
        this._action = action;
    } //-- void setAction(java.lang.String) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'enabled'.
     * 
     * @param enabled the value of field 'enabled'.
     */
    public void setEnabled(java.lang.String enabled)
    {
        this._enabled = enabled;
    } //-- void setEnabled(java.lang.String) 

    /**
     * Sets the value of field 'mep'.
     * 
     * @param mep the value of field 'mep'.
     */
    public void setMep(java.lang.String mep)
    {
        this._mep = mep;
    } //-- void setMep(java.lang.String) 

    /**
     * Sets the value of field 'messageStorage'.
     * 
     * @param messageStorage the value of field 'messageStorage'.
     */
    public void setMessageStorage(java.lang.String messageStorage)
    {
        this._messageStorage = messageStorage;
    } //-- void setMessageStorage(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'processorClass'.
     * 
     * @param processorClass the value of field 'processorClass'.
     */
    public void setProcessorClass(java.lang.String processorClass)
    {
        this._processorClass = processorClass;
    } //-- void setProcessorClass(java.lang.String) 

    /**
     * Sets the value of field 'responseDelay'.
     * 
     * @param responseDelay the value of field 'responseDelay'.
     */
    public void setResponseDelay(java.lang.String responseDelay)
    {
        this._responseDelay = responseDelay;
    } //-- void setResponseDelay(java.lang.String) 

    /**
     * Method setTemplateFiles
     * 
     * @param index
     * @param vTemplateFiles
     */
    public void setTemplateFiles(int index, java.lang.String vTemplateFiles)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _templateFilesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _templateFilesList.set(index,vTemplateFiles);
    } //-- void setTemplateFiles(int, java.lang.String) 

    /**
     * Method setTemplateFiles
     * 
     * @param templateFilesArray
     */
    public void setTemplateFiles(java.lang.String[] templateFilesArray)
    {
        //-- copy array
        _templateFilesList.clear();
        for (int i = 0; i < templateFilesArray.length; i++) {
            _templateFilesList.add(templateFilesArray[i]);
        }
    } //-- void setTemplateFiles(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (MessageConfig) Unmarshaller.unmarshal(MessageConfig.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
