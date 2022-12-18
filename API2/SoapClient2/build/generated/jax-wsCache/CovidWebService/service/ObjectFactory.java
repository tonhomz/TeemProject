
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Coviddata2_QNAME = new QName("http://service/", "coviddata2");
    private final static QName _FindByYear_QNAME = new QName("http://service/", "findByYear");
    private final static QName _FindByYearResponse_QNAME = new QName("http://service/", "findByYearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByYearResponse }
     * 
     */
    public FindByYearResponse createFindByYearResponse() {
        return new FindByYearResponse();
    }

    /**
     * Create an instance of {@link FindByYear }
     * 
     */
    public FindByYear createFindByYear() {
        return new FindByYear();
    }

    /**
     * Create an instance of {@link Coviddata2 }
     * 
     */
    public Coviddata2 createCoviddata2() {
        return new Coviddata2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coviddata2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "coviddata2")
    public JAXBElement<Coviddata2> createCoviddata2(Coviddata2 value) {
        return new JAXBElement<Coviddata2>(_Coviddata2_QNAME, Coviddata2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findByYear")
    public JAXBElement<FindByYear> createFindByYear(FindByYear value) {
        return new JAXBElement<FindByYear>(_FindByYear_QNAME, FindByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findByYearResponse")
    public JAXBElement<FindByYearResponse> createFindByYearResponse(FindByYearResponse value) {
        return new JAXBElement<FindByYearResponse>(_FindByYearResponse_QNAME, FindByYearResponse.class, null, value);
    }

}
