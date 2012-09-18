//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.18 at 04:29:03 PM GMT 
//


package org.openmrs.module.dhisreport.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}dataElements"/>
 *         &lt;element ref="{}disaggregations"/>
 *         &lt;element ref="{}reportTemplates" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataElements",
    "disaggregations",
    "reportTemplates"
})
@XmlRootElement(name = "reportTemplates")
public class ReportTemplates {

    @XmlElementWrapper(name="dataElements", required=true)
    @XmlElement(name="dataElement")
    protected List<DataElement> dataElements;
    @XmlElementWrapper(name="dataElements", required=true)
    @XmlElement(name="dataElement")
    protected List<Disaggregation> disaggregations;
    @XmlElement(name="reportTemplate", required = true)
    protected List<ReportDefinition> reportTemplates;

    public List<DataElement> getDataElements() {
        return dataElements;
    }

    public void setDataElements(List<DataElement> dataElements) {
        this.dataElements = dataElements;
    }

    public List<Disaggregation> getDisaggregations() {
        return disaggregations;
    }

    public void setDisaggregations(List<Disaggregation> disaggs) {
        this.disaggregations = disaggs;
    }

    public List<ReportDefinition> getReportTemplates() {
        if (reportTemplates == null) {
            reportTemplates = new ArrayList<ReportDefinition>();
        }
        return this.reportTemplates;
    }

}