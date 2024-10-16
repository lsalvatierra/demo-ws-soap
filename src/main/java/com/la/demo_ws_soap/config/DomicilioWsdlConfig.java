package com.la.demo_ws_soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class DomicilioWsdlConfig {

    @Bean(name = "domicilios")
    public DefaultWsdl11Definition domicilioWsdl11Definition(XsdSchema domicilioSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("DomiciliosPort");
        wsdl11Definition.setLocationUri("/ws/domicilios");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(domicilioSchema);
        return wsdl11Definition;
    }
}
