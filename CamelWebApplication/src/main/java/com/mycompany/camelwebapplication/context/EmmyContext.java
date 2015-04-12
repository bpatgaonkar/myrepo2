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
 * Class EmmyContext.
 * 
 * @version $Revision$ $Date$
 */
public class EmmyContext implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _initialContextFactory
     */
    private java.lang.String _initialContextFactory;

    /**
     * Field _providerUrl
     */
    private java.lang.String _providerUrl;

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

    /**
     * Field _queueConfigList
     */
    private java.util.List _queueConfigList;

    /**
     * Field _templatePath
     */
    private java.lang.String _templatePath;

    /**
     * Field _requestPath
     */
    private java.lang.String _requestPath;

    /**
     * Field _responsePath
     */
    private java.lang.String _responsePath;

    /**
     * Field _errorPath
     */
    private java.lang.String _errorPath;

    /**
     * Field _actionElementList
     */
    private java.util.List _actionElementList;

    /**
     * Field _messageConfigList
     */
    private java.util.List _messageConfigList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EmmyContext() {
        super();
        _queueConfigList = new ArrayList<QueueConfig>();
        _actionElementList = new ArrayList<String>();
        _messageConfigList = new ArrayList<MessageConfig>();
    } //-- com.dorado.chaseels.cinttestharness.generated.EmmyContext()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addActionElement
     * 
     * @param vActionElement
     */
    public void addActionElement(java.lang.String vActionElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _actionElementList.add(vActionElement);
    } //-- void addActionElement(java.lang.String) 

    /**
     * Method addActionElement
     * 
     * @param index
     * @param vActionElement
     */
    public void addActionElement(int index, java.lang.String vActionElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _actionElementList.add(index,vActionElement);
    } //-- void addActionElement(int, java.lang.String) 

    /**
     * Method addMessageConfig
     * 
     * @param vMessageConfig
     */
    public void addMessageConfig(MessageConfig vMessageConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        _messageConfigList.add(vMessageConfig);
    } //-- void addMessageConfig(com.dorado.chaseels.cinttestharness.generated.MessageConfig) 

    /**
     * Method addMessageConfig
     * 
     * @param index
     * @param vMessageConfig
     */
    public void addMessageConfig(int index, MessageConfig vMessageConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        _messageConfigList.add(index,vMessageConfig);
    } //-- void addMessageConfig(int, com.dorado.chaseels.cinttestharness.generated.MessageConfig) 

    /**
     * Method addQueueConfig
     * 
     * @param vQueueConfig
     */
    public void addQueueConfig(QueueConfig vQueueConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        _queueConfigList.add(vQueueConfig);
    } //-- void addQueueConfig(com.dorado.chaseels.cinttestharness.generated.QueueConfig) 

    /**
     * Method addQueueConfig
     * 
     * @param index
     * @param vQueueConfig
     */
    public void addQueueConfig(int index, QueueConfig vQueueConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        _queueConfigList.add(index,vQueueConfig);
    } //-- void addQueueConfig(int, com.dorado.chaseels.cinttestharness.generated.QueueConfig) 

    /**
     * Method enumerateActionElement
     */
    public java.util.Iterator enumerateActionElement()
    {
        return _actionElementList.iterator();
    } //-- java.util.Enumeration enumerateActionElement() 

    /**
     * Method enumerateMessageConfig
     */
    public java.util.Iterator enumerateMessageConfig()
    {
        return _messageConfigList.iterator();
    } //-- java.util.Enumeration enumerateMessageConfig() 

    /**
     * Method enumerateQueueConfig
     */
    public java.util.Iterator enumerateQueueConfig()
    {
        return _queueConfigList.iterator();
    } //-- java.util.Enumeration enumerateQueueConfig() 

    /**
     * Method getActionElement
     * 
     * @param index
     */
    public java.lang.String getActionElement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _actionElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_actionElementList.get(index);
    } //-- java.lang.String getActionElement(int) 

    /**
     * Method getActionElement
     */
    public java.lang.String[] getActionElement()
    {
        int size = _actionElementList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_actionElementList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getActionElement() 

    /**
     * Method getActionElementCount
     */
    public int getActionElementCount()
    {
        return _actionElementList.size();
    } //-- int getActionElementCount() 

    /**
     * Returns the value of field 'errorPath'.
     * 
     * @return the value of field 'errorPath'.
     */
    public java.lang.String getErrorPath()
    {
        return this._errorPath;
    } //-- java.lang.String getErrorPath() 

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
     * Returns the value of field 'initialContextFactory'.
     * 
     * @return the value of field 'initialContextFactory'.
     */
    public java.lang.String getInitialContextFactory()
    {
        return this._initialContextFactory;
    } //-- java.lang.String getInitialContextFactory() 

    /**
     * Method getMessageConfig
     * 
     * @param index
     */
    public MessageConfig getMessageConfig(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _messageConfigList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (MessageConfig) _messageConfigList.get(index);
    } //-- com.dorado.chaseels.cinttestharness.generated.MessageConfig getMessageConfig(int) 

    /**
     * Method getMessageConfig
     */
    public MessageConfig[] getMessageConfig()
    {
        int size = _messageConfigList.size();
        MessageConfig[] mArray = new MessageConfig[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (MessageConfig) _messageConfigList.get(index);
        }
        return mArray;
    } //-- com.dorado.chaseels.cinttestharness.generated.MessageConfig[] getMessageConfig() 

    /**
     * Method getMessageConfigCount
     */
    public int getMessageConfigCount()
    {
        return _messageConfigList.size();
    } //-- int getMessageConfigCount() 

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
     * Returns the value of field 'providerUrl'.
     * 
     * @return the value of field 'providerUrl'.
     */
    public java.lang.String getProviderUrl()
    {
        return this._providerUrl;
    } //-- java.lang.String getProviderUrl() 

    /**
     * Method getQueueConfig
     * 
     * @param index
     */
    public QueueConfig getQueueConfig(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queueConfigList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (QueueConfig) _queueConfigList.get(index);
    } //-- com.dorado.chaseels.cinttestharness.generated.QueueConfig getQueueConfig(int) 

    /**
     * Method getQueueConfig
     */
    public QueueConfig[] getQueueConfig()
    {
        int size = _queueConfigList.size();
        QueueConfig[] mArray = new QueueConfig[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (QueueConfig) _queueConfigList.get(index);
        }
        return mArray;
    } //-- com.dorado.chaseels.cinttestharness.generated.QueueConfig[] getQueueConfig() 

    /**
     * Method getQueueConfigCount
     */
    public int getQueueConfigCount()
    {
        return _queueConfigList.size();
    } //-- int getQueueConfigCount() 

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
     * Returns the value of field 'requestPath'.
     * 
     * @return the value of field 'requestPath'.
     */
    public java.lang.String getRequestPath()
    {
        return this._requestPath;
    } //-- java.lang.String getRequestPath() 

    /**
     * Returns the value of field 'responsePath'.
     * 
     * @return the value of field 'responsePath'.
     */
    public java.lang.String getResponsePath()
    {
        return this._responsePath;
    } //-- java.lang.String getResponsePath() 

    /**
     * Returns the value of field 'templatePath'.
     * 
     * @return the value of field 'templatePath'.
     */
    public java.lang.String getTemplatePath()
    {
        return this._templatePath;
    } //-- java.lang.String getTemplatePath() 

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
     * Method removeActionElement
     * 
     * @param index
     */
    public java.lang.String removeActionElement(int index)
    {
        java.lang.Object obj = _actionElementList.get(index);
        _actionElementList.remove(index);
        return (String)obj;
    } //-- java.lang.String removeActionElement(int) 

    /**
     * Method removeAllActionElement
     */
    public void removeAllActionElement()
    {
        _actionElementList.clear();
    } //-- void removeAllActionElement() 

    /**
     * Method removeAllMessageConfig
     */
    public void removeAllMessageConfig()
    {
        _messageConfigList.clear();
    } //-- void removeAllMessageConfig() 

    /**
     * Method removeAllQueueConfig
     */
    public void removeAllQueueConfig()
    {
        _queueConfigList.clear();
    } //-- void removeAllQueueConfig() 

    /**
     * Method removeMessageConfig
     * 
     * @param index
     */
    public MessageConfig removeMessageConfig(int index)
    {
        java.lang.Object obj = _messageConfigList.get(index);
        _messageConfigList.get(index);
        return (MessageConfig) obj;
    } //-- com.dorado.chaseels.cinttestharness.generated.MessageConfig removeMessageConfig(int) 

    /**
     * Method removeQueueConfig
     * 
     * @param index
     */
    public QueueConfig removeQueueConfig(int index)
    {
        java.lang.Object obj = _queueConfigList.get(index);
        _queueConfigList.remove(index);
        return (QueueConfig) obj;
    } //-- com.dorado.chaseels.cinttestharness.generated.QueueConfig removeQueueConfig(int) 

    /**
     * Method setActionElement
     * 
     * @param index
     * @param vActionElement
     */
    public void setActionElement(int index, java.lang.String vActionElement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _actionElementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _actionElementList.set(index,vActionElement);
    } //-- void setActionElement(int, java.lang.String) 

    /**
     * Method setActionElement
     * 
     * @param actionElementArray
     */
    public void setActionElement(java.lang.String[] actionElementArray)
    {
        //-- copy array
        _actionElementList.clear();
        for (int i = 0; i < actionElementArray.length; i++) {
            _actionElementList.add(actionElementArray[i]);
        }
    } //-- void setActionElement(java.lang.String) 

    /**
     * Sets the value of field 'errorPath'.
     * 
     * @param errorPath the value of field 'errorPath'.
     */
    public void setErrorPath(java.lang.String errorPath)
    {
        this._errorPath = errorPath;
    } //-- void setErrorPath(java.lang.String) 

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
     * Sets the value of field 'initialContextFactory'.
     * 
     * @param initialContextFactory the value of field
     * 'initialContextFactory'.
     */
    public void setInitialContextFactory(java.lang.String initialContextFactory)
    {
        this._initialContextFactory = initialContextFactory;
    } //-- void setInitialContextFactory(java.lang.String) 

    /**
     * Method setMessageConfig
     * 
     * @param index
     * @param vMessageConfig
     */
    public void setMessageConfig(int index, MessageConfig vMessageConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _messageConfigList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _messageConfigList.set(index,vMessageConfig);
    } //-- void setMessageConfig(int, com.dorado.chaseels.cinttestharness.generated.MessageConfig) 

    /**
     * Method setMessageConfig
     * 
     * @param messageConfigArray
     */
    public void setMessageConfig(MessageConfig[] messageConfigArray)
    {
        //-- copy array
        _messageConfigList.clear();
        for (int i = 0; i < messageConfigArray.length; i++) {
            _messageConfigList.add(messageConfigArray[i]);
        }
    } //-- void setMessageConfig(com.dorado.chaseels.cinttestharness.generated.MessageConfig) 

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
     * Sets the value of field 'providerUrl'.
     * 
     * @param providerUrl the value of field 'providerUrl'.
     */
    public void setProviderUrl(java.lang.String providerUrl)
    {
        this._providerUrl = providerUrl;
    } //-- void setProviderUrl(java.lang.String) 

    /**
     * Method setQueueConfig
     * 
     * @param index
     * @param vQueueConfig
     */
    public void setQueueConfig(int index, QueueConfig vQueueConfig)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _queueConfigList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _queueConfigList.set(index,vQueueConfig);
    } //-- void setQueueConfig(int, com.dorado.chaseels.cinttestharness.generated.QueueConfig) 

    /**
     * Method setQueueConfig
     * 
     * @param queueConfigArray
     */
    public void setQueueConfig(QueueConfig[] queueConfigArray)
    {
        //-- copy array
        _queueConfigList.clear();
        for (int i = 0; i < queueConfigArray.length; i++) {
            _queueConfigList.add(queueConfigArray[i]);
        }
    } //-- void setQueueConfig(com.dorado.chaseels.cinttestharness.generated.QueueConfig) 

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
     * Sets the value of field 'requestPath'.
     * 
     * @param requestPath the value of field 'requestPath'.
     */
    public void setRequestPath(java.lang.String requestPath)
    {
        this._requestPath = requestPath;
    } //-- void setRequestPath(java.lang.String) 

    /**
     * Sets the value of field 'responsePath'.
     * 
     * @param responsePath the value of field 'responsePath'.
     */
    public void setResponsePath(java.lang.String responsePath)
    {
        this._responsePath = responsePath;
    } //-- void setResponsePath(java.lang.String) 

    /**
     * Sets the value of field 'templatePath'.
     * 
     * @param templatePath the value of field 'templatePath'.
     */
    public void setTemplatePath(java.lang.String templatePath)
    {
        this._templatePath = templatePath;
    } //-- void setTemplatePath(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (EmmyContext) Unmarshaller.unmarshal(EmmyContext.class, reader);
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
