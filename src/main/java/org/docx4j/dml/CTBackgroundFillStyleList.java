/*
 *  Copyright 2007, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is free software: you can use it, redistribute it and/or modify
    it under the terms of version 3 of the GNU Affero General Public License 
    as published by the Free Software Foundation.

    If you need the right to use it under a different license, please
    contact Plutext.

    docx4j is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License   
    along with docx4j.  If not, see <http://www.fsf.org/licensing/licenses/>.
    
 */

package org.docx4j.dml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_BackgroundFillStyleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_BackgroundFillStyleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_FillProperties" maxOccurs="unbounded" minOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_BackgroundFillStyleList", propOrder = {
    "egFillProperties"
})
public class CTBackgroundFillStyleList {

    @XmlElements({
        @XmlElement(name = "solidFill", type = CTSolidColorFillProperties.class),
        @XmlElement(name = "noFill", type = CTNoFillProperties.class),
        @XmlElement(name = "pattFill", type = CTPatternFillProperties.class),
        @XmlElement(name = "gradFill", type = CTGradientFillProperties.class),
        @XmlElement(name = "grpFill", type = CTGroupFillProperties.class),
        @XmlElement(name = "blipFill", type = CTBlipFillProperties.class)
    })
    protected List<Object> egFillProperties;

    /**
     * Gets the value of the egFillProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egFillProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGFillProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSolidColorFillProperties }
     * {@link CTNoFillProperties }
     * {@link CTPatternFillProperties }
     * {@link CTGradientFillProperties }
     * {@link CTGroupFillProperties }
     * {@link CTBlipFillProperties }
     * 
     * 
     */
    public List<Object> getEGFillProperties() {
        if (egFillProperties == null) {
            egFillProperties = new ArrayList<Object>();
        }
        return this.egFillProperties;
    }

}
