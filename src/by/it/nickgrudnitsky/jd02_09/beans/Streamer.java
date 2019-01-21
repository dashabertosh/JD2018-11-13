//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 10:48:31 PM MSK 
//


package by.it.nickgrudnitsky.jd02_09.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Streamer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Streamer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channelname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="followers" type="{http://beans.jd02_09.nickgrudnitsky.it.by/}Followers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Streamer", propOrder = {
    "id",
    "email",
    "password",
    "roleID",
    "channelname",
    "followers"
})
public class Streamer {

    @Override
    public String toString() {
        return "\n\t\tStreamer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleID=" + roleID +
                ", channelname='" + channelname + '\'' +
                ", followers=" + followers +
                '}';
    }

    protected long id;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String password;
    protected int roleID;
    @XmlElement(required = true)
    protected String channelname;
    @XmlElement(required = true)
    protected Followers followers;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     */
    public void setRoleID(int value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the channelname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelname() {
        return channelname;
    }

    /**
     * Sets the value of the channelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelname(String value) {
        this.channelname = value;
    }

    /**
     * Gets the value of the followers property.
     * 
     * @return
     *     possible object is
     *     {@link Followers }
     *     
     */
    public Followers getFollowers() {
        return followers;
    }

    /**
     * Sets the value of the followers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Followers }
     *     
     */
    public void setFollowers(Followers value) {
        this.followers = value;
    }

}