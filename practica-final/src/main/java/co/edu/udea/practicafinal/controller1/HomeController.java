/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.practicafinal.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Santiago López
 */

@Controller
@ResponseBody
public class HomeController {
    @RequestMapping(value="/hello")
    public String saludar(){
        String mensaje="Hello From Spring";
       return mensaje;
    }
}
