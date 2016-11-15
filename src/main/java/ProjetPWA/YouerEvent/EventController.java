/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetPWA.YouerEvent;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author youssef
 */
@Controller
public class EventController {
     
    @RequestMapping("/") 
  
    public String home(Model M){
      return "index";
    }
       
    }
    
   
    
