package com.by.pokemonapi.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "pokemon")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema pokemonSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PokemonPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.by.com/pokemonapi/wsdl");
        wsdl11Definition.setSchema(pokemonSchema);
        return wsdl11Definition;
    }

    
    @Bean
    public SaajSoapMessageFactory messageFactory() {
           SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
           messageFactory.setSoapVersion(SoapVersion.SOAP_11);
           return messageFactory;
    }
    
    
    @Bean
    public XsdSchema pokemonSchema() {
        return new SimpleXsdSchema(new ClassPathResource("pokemon.xsd"));
    }
    
}