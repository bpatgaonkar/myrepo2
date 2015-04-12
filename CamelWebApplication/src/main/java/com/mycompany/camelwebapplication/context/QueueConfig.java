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

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class QueueConfig.
 * 
 * @version $Revision$ $Date$
 */
public class QueueConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _queueName
     */
    private java.lang.String _queueName;

    /**
     * Field _queueConnectionFactory
     */
    private java.lang.String _queueConnectionFactory;

    /**
     * Field _inQueue
     */
    private java.lang.String _inQueue;

    /**
     * Field _outQueue
     */
    private java.lang.String _outQueue;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueueConfig() {
        super();
    } //-- com.dorado.chaseels.cinttestharness.generated.QueueConfig()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'inQueue'.
     * 
     * @return the value of field 'inQueue'.
     */
    public java.lang.String getInQueue()
    {
        return this._inQueue;
    } //-- java.lang.String getInQueue() 

    /**
     * Returns the value of field 'outQueue'.
     * 
     * @return the value of field 'outQueue'.
     */
    public java.lang.String getOutQueue()
    {
        return this._outQueue;
    } //-- java.lang.String getOutQueue() 

    /**
     * Returns the value of field 'queueConnectionFactory'.
     * 
     * @return the value of field 'queueConnectionFactory'.
     */
    public java.lang.String getQueueConnectionFactory()
    {
        return this._queueConnectionFactory;
    } //-- java.lang.String getQueueConnectionFactory() 

    /**
     * Returns the value of field 'queueName'.
     * 
     * @return the value of field 'queueName'.
     */
    public java.lang.String getQueueName()
    {
        return this._queueName;
    } //-- java.lang.String getQueueName() 

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
     * Sets the value of field 'inQueue'.
     * 
     * @param inQueue the value of field 'inQueue'.
     */
    public void setInQueue(java.lang.String inQueue)
    {
        this._inQueue = inQueue;
    } //-- void setInQueue(java.lang.String) 

    /**
     * Sets the value of field 'outQueue'.
     * 
     * @param outQueue the value of field 'outQueue'.
     */
    public void setOutQueue(java.lang.String outQueue)
    {
        this._outQueue = outQueue;
    } //-- void setOutQueue(java.lang.String) 

    /**
     * Sets the value of field 'queueConnectionFactory'.
     * 
     * @param queueConnectionFactory the value of field
     * 'queueConnectionFactory'.
     */
    public void setQueueConnectionFactory(java.lang.String queueConnectionFactory)
    {
        this._queueConnectionFactory = queueConnectionFactory;
    } //-- void setQueueConnectionFactory(java.lang.String) 

    /**
     * Sets the value of field 'queueName'.
     * 
     * @param queueName the value of field 'queueName'.
     */
    public void setQueueName(java.lang.String queueName)
    {
        this._queueName = queueName;
    } //-- void setQueueName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (QueueConfig) Unmarshaller.unmarshal(QueueConfig.class, reader);
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
