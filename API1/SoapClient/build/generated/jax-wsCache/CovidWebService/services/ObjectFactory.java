
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _Coviddata_QNAME = new QName("http://services/", "coviddata");
    private final static QName _FindByYear_QNAME = new QName("http://services/", "findByYear");
    private final static QName _FindByYearResponse_QNAME = new QName("http://services/", "findByYearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
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
     * Create an instance of {@link Coviddata }
     * 
     */
    public Coviddata createCoviddata() {
        return new Coviddata();
    }

    /**
     * Create an instance of {@link FindByYear }
     * 
     */
    public FindByYear createFindByYear() {
        return new FindByYear();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coviddata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "coviddata")
    public JAXBElement<Coviddata> createCoviddata(Coviddata value) {
        return new JAXBElement<Coviddata>(_Coviddata_QNAME, Coviddata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByYear")
    public JAXBElement<FindByYear> createFindByYear(FindByYear value) {
        return new JAXBElement<FindByYear>(_FindByYear_QNAME, FindByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByYearResponse")
    public JAXBElement<FindByYearResponse> createFindByYearResponse(FindByYearResponse value) {
        return new JAXBElement<FindByYearResponse>(_FindByYearResponse_QNAME, FindByYearResponse.class, null, value);
    }

}
