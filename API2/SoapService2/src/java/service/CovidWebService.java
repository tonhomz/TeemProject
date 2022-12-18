/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import model.Coviddata2;

/**
 *
 * @author Prueksa
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoapService2PU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByYear")
    public Coviddata2 findByYear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Coviddata2 cov = em.find(Coviddata2.class, year);
        return cov;
    }
    
}
