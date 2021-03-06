//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.22 at 11:25:43 AM MSK 
//


package ru.lumberjackcode.vacls.client.applicationparams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapturingDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frameWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frameHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoParams", propOrder = {
    "capturingDevice",
    "frameWidth",
    "frameHeight"
})
public class VideoParams {

    @XmlElement(name = "CapturingDevice", required = true, defaultValue = "0")
    protected String capturingDevice;
    protected int frameWidth;
    protected int frameHeight;

    /**
     * Gets the value of the capturingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapturingDevice() {
        return capturingDevice;
    }

    /**
     * Sets the value of the capturingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapturingDevice(String value) {
        this.capturingDevice = value;
    }

    /**
     * Gets the value of the frameWidth property.
     * 
     */
    public int getFrameWidth() {
        return frameWidth;
    }

    /**
     * Sets the value of the frameWidth property.
     * 
     */
    public void setFrameWidth(int value) {
        this.frameWidth = value;
    }

    /**
     * Gets the value of the frameHeight property.
     * 
     */
    public int getFrameHeight() {
        return frameHeight;
    }

    /**
     * Sets the value of the frameHeight property.
     * 
     */
    public void setFrameHeight(int value) {
        this.frameHeight = value;
    }

}
