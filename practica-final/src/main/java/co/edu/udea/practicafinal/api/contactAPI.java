/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.practicafinal.api;

import co.edu.udea.practicafinal.dto.Contact;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.netflix.eureka.registry.Key.KeyType.XML;
import java.util.Map;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Santiago López
 */
@RestController
@ResponseBody
public class contactAPI {
    @GetMapping(value="contact")
    public String showContact() throws JsonProcessingException{
        
     Contact contact = new Contact(5L,"Santiag","López","5674328","santiago.lopez16@udea.edu.co");
        ObjectMapper mapper = new ObjectMapper();


    
    return mapper.writeValueAsString(contact);
}
}

      
   

