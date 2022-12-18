/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient2;

import service.Coviddata2;

/**
 *
 * @author Prueksa
 */
public class SoapClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coviddata2 str = findByYear(2022);
        System.out.println(str);
    }

    private static Coviddata2 findByYear(int year) {
        service.CovidWebService_Service service = new service.CovidWebService_Service();
        service.CovidWebService port = service.getCovidWebServicePort();
        return port.findByYear(year);
    }
    
}
