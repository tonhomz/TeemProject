/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidadddata2;

import covidadddata2.Coviddata2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Prueksa
 */
public class CovidAddData2 {
    public static void main (String []args) throws FileNotFoundException, JSONException {
        JsonReader reader = Json.createReader(new FileReader("C:\\Users\\Prueksa\\Documents\\KMITL\\CBSD\\TermProject\\Data2.txt"));
        JsonStructure jsonst = reader.read();
        
        String str = jsonst.toString();
        
        JSONArray arr = new JSONArray(str);
        for(int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            int yearnum = obj.getInt("year");
            int weeknum = obj.getInt("weeknum");
            String province = obj.getString("province");
            int new_case = obj.getInt("new_case");
            int total_case = obj.getInt("total_case");
            int new_case_excludeabroad = obj.getInt("new_case_excludeabroad");
            int total_case_excludeabroad = obj.getInt("total_case_excludeabroad");
            int new_death = obj.getInt("new_death");
            int total_death = obj.getInt("total_death");
            String update_date = obj.getString("update_date");
            
            Coviddata2 cov = new Coviddata2(yearnum, weeknum, province, new_case, total_case, new_case_excludeabroad, 
                                        total_case_excludeabroad, new_death, total_death, update_date);
          persist(cov);
        }
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidAddData2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}