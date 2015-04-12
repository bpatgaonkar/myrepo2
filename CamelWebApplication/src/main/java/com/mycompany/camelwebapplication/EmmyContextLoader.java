/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.camelwebapplication;

import com.mycompany.camelwebapplication.context.EmmyContext;
import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.transform.stream.StreamSource;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.springframework.oxm.Unmarshaller;
import org.xml.sax.InputSource;

/**
 *
 * @author Patgaonkar
 */
public class EmmyContextLoader {
    private Unmarshaller unmarshaller;
    private String emmyConfFileName;
    private EmmyContext emmyContext;
    
    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public String getEmmyConfFileName() {
        return emmyConfFileName;
    }

    public void setEmmyConfFileName(String emmyConfFileName) {
        this.emmyConfFileName = emmyConfFileName;
    }
    public void loadEmmyContext() throws IOException, MarshalException, ValidationException {
        FileInputStream is = null;
        try {
            is = new FileInputStream(emmyConfFileName);
            this.emmyContext 
                        = (EmmyContext) this.unmarshaller.unmarshal(new StreamSource(is));
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
    
}
