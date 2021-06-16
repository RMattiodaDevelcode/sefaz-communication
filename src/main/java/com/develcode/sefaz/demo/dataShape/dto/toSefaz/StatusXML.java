package com.develcode.sefaz.demo.dataShape.dto.toSefaz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="consStatServ")
public class StatusXML {
    @XmlAttribute(name="versao")
    private String versao = "4.0";
    @XmlAttribute(name="tpAmb")
    private Integer tpAmb;
    @XmlAttribute(name="cUF")
    private Integer cUF;
    @XmlAttribute(name="xServ")
    private String xServ = "STATUS";

    public StatusXML(Integer tpAmb, Integer cUF) {
        this.tpAmb = tpAmb;
        this.cUF = cUF;
    }
}
