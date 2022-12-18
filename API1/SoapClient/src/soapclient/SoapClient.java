/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient;

import services.Coviddata;

/**
 *
 * @author Prueksa
 */
public class SoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coviddata str = findByYear(2022);
        System.out.println(str);
    }

    private static Coviddata findByYear(int year) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findByYear(year);
    }
}
