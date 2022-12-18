/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidadddata;

import covidadddata.Coviddata;
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
public class CovidAddData {
    public static void main (String []args) throws FileNotFoundException, JSONException {
        JsonReader reader = Json.createReader(new FileReader("C:\\Users\\Prueksa\\Documents\\KMITL\\CBSD\\TermProject\\Data1.txt"));
        JsonStructure jsonst = reader.read();
        
        String str = jsonst.toString();
        
        JSONArray arr = new JSONArray(str);
        for(int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            int yearnum = obj.getInt("year");
            int weeknum = obj.getInt("weeknum");
            int new_case = obj.getInt("new_case");
            int total_case = obj.getInt("total_case");
            int new_case_excludeabroad = obj.getInt("new_case_excludeabroad");
            int total_case_excludeabroad = obj.getInt("total_case_excludeabroad");
            int new_recovered = obj.getInt("new_recovered");
            int total_recovered = obj.getInt("total_recovered");
            int new_death = obj.getInt("new_death");
            int total_death = obj.getInt("total_death");
            int case_foreign = obj.getInt("case_foreign");
            int case_prison = obj.getInt("case_prison");
            int case_walkin = obj.getInt("case_walkin");
            int case_new_prev = obj.getInt("case_new_prev");
            int case_new_diff = obj.getInt("case_new_diff");
            int death_new_prev = obj.getInt("death_new_prev");
            int death_new_diff = obj.getInt("death_new_diff");
            String update_date = obj.getString("update_date");
            
            Coviddata cov = new Coviddata(yearnum, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad,
                                new_recovered, total_recovered, new_death, total_death, case_foreign, case_prison, case_walkin, 
                                case_new_prev, case_new_diff, death_new_prev, death_new_diff, update_date);
          persist(cov);
        }
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidAddDataPU");
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