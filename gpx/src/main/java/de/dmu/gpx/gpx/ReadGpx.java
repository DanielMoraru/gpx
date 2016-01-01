/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dmu.gpx.gpx;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

/**
 * Read GPX Files
 * @author dmu
 */
public class ReadGpx {

    public com.topografix.gpx._1._0.Gpx readGpx10(File file) throws JAXBException {
        return JAXB.unmarshal(file, com.topografix.gpx._1._0.Gpx.class);
    }
    
    public com.topografix.gpx._1._0.Gpx readGpx10(InputStream inputStream) throws JAXBException {
        return JAXB.unmarshal(inputStream, com.topografix.gpx._1._0.Gpx.class);
    }
    
    public com.topografix.gpx._1._0.Gpx readGpx10(Reader reader) throws JAXBException {
        return JAXB.unmarshal(reader, com.topografix.gpx._1._0.Gpx.class);
    }
    
    public com.topografix.gpx._1._0.Gpx readGpx10(String string) throws JAXBException {
        return JAXB.unmarshal(string, com.topografix.gpx._1._0.Gpx.class);
    }
    
    public com.topografix.gpx._1._0.Gpx readGpx10(URL url) throws JAXBException {
        return JAXB.unmarshal(url, com.topografix.gpx._1._0.Gpx.class);
    }
    
    public com.topografix.gpx._1._1.GpxType readGpx11(File file) throws JAXBException {
        return JAXB.unmarshal(file, com.topografix.gpx._1._1.GpxType.class);
    }
    
    public com.topografix.gpx._1._1.GpxType readGpx11(InputStream inputStream) throws JAXBException {
        return JAXB.unmarshal(inputStream, com.topografix.gpx._1._1.GpxType.class);
    }
    
    public com.topografix.gpx._1._1.GpxType readGpx11(Reader reader) throws JAXBException {
        return JAXB.unmarshal(reader, com.topografix.gpx._1._1.GpxType.class);
    }
    
    public com.topografix.gpx._1._1.GpxType readGpx11(String string) throws JAXBException {
        return JAXB.unmarshal(string, com.topografix.gpx._1._1.GpxType.class);
    }
    
    public com.topografix.gpx._1._1.GpxType readGpx11(URL url) throws JAXBException {
        return JAXB.unmarshal(url, com.topografix.gpx._1._1.GpxType.class);
    }
}
