/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dmu.gpx.gpx;

import com.topografix.gpx._1._0.Gpx;
import java.io.File;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

/**
 * Read GPX Files
 * @author dmu
 */
public class ReadGpx {

    public Gpx readGpx(File file) throws JAXBException {
        return JAXB.unmarshal(file, Gpx.class);
    }
}
