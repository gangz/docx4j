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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_TextListStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TextListStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defPPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl1pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl2pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl3pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl4pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl5pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl6pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl7pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl8pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="lvl9pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_OfficeArtExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TextListStyle", propOrder = {
    "defPPr",
    "lvl1PPr",
    "lvl2PPr",
    "lvl3PPr",
    "lvl4PPr",
    "lvl5PPr",
    "lvl6PPr",
    "lvl7PPr",
    "lvl8PPr",
    "lvl9PPr",
    "extLst"
})
public class CTTextListStyle {

    protected CTTextParagraphProperties defPPr;
    @XmlElement(name = "lvl1pPr")
    protected CTTextParagraphProperties lvl1PPr;
    @XmlElement(name = "lvl2pPr")
    protected CTTextParagraphProperties lvl2PPr;
    @XmlElement(name = "lvl3pPr")
    protected CTTextParagraphProperties lvl3PPr;
    @XmlElement(name = "lvl4pPr")
    protected CTTextParagraphProperties lvl4PPr;
    @XmlElement(name = "lvl5pPr")
    protected CTTextParagraphProperties lvl5PPr;
    @XmlElement(name = "lvl6pPr")
    protected CTTextParagraphProperties lvl6PPr;
    @XmlElement(name = "lvl7pPr")
    protected CTTextParagraphProperties lvl7PPr;
    @XmlElement(name = "lvl8pPr")
    protected CTTextParagraphProperties lvl8PPr;
    @XmlElement(name = "lvl9pPr")
    protected CTTextParagraphProperties lvl9PPr;
    protected CTOfficeArtExtensionList extLst;

    /**
     * Gets the value of the defPPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getDefPPr() {
        return defPPr;
    }

    /**
     * Sets the value of the defPPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setDefPPr(CTTextParagraphProperties value) {
        this.defPPr = value;
    }

    /**
     * Gets the value of the lvl1PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl1PPr() {
        return lvl1PPr;
    }

    /**
     * Sets the value of the lvl1PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl1PPr(CTTextParagraphProperties value) {
        this.lvl1PPr = value;
    }

    /**
     * Gets the value of the lvl2PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl2PPr() {
        return lvl2PPr;
    }

    /**
     * Sets the value of the lvl2PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl2PPr(CTTextParagraphProperties value) {
        this.lvl2PPr = value;
    }

    /**
     * Gets the value of the lvl3PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl3PPr() {
        return lvl3PPr;
    }

    /**
     * Sets the value of the lvl3PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl3PPr(CTTextParagraphProperties value) {
        this.lvl3PPr = value;
    }

    /**
     * Gets the value of the lvl4PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl4PPr() {
        return lvl4PPr;
    }

    /**
     * Sets the value of the lvl4PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl4PPr(CTTextParagraphProperties value) {
        this.lvl4PPr = value;
    }

    /**
     * Gets the value of the lvl5PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl5PPr() {
        return lvl5PPr;
    }

    /**
     * Sets the value of the lvl5PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl5PPr(CTTextParagraphProperties value) {
        this.lvl5PPr = value;
    }

    /**
     * Gets the value of the lvl6PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl6PPr() {
        return lvl6PPr;
    }

    /**
     * Sets the value of the lvl6PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl6PPr(CTTextParagraphProperties value) {
        this.lvl6PPr = value;
    }

    /**
     * Gets the value of the lvl7PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl7PPr() {
        return lvl7PPr;
    }

    /**
     * Sets the value of the lvl7PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl7PPr(CTTextParagraphProperties value) {
        this.lvl7PPr = value;
    }

    /**
     * Gets the value of the lvl8PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl8PPr() {
        return lvl8PPr;
    }

    /**
     * Sets the value of the lvl8PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl8PPr(CTTextParagraphProperties value) {
        this.lvl8PPr = value;
    }

    /**
     * Gets the value of the lvl9PPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getLvl9PPr() {
        return lvl9PPr;
    }

    /**
     * Sets the value of the lvl9PPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setLvl9PPr(CTTextParagraphProperties value) {
        this.lvl9PPr = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public CTOfficeArtExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public void setExtLst(CTOfficeArtExtensionList value) {
        this.extLst = value;
    }

}
