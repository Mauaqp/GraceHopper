package com.gracehopper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class GraceHopperApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraceHopperApplication.class, args);
	}
	
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Mauricio Peraltilla";
        String itemName = "Teclado MIDI - 25 Teclas";
        double price = 145.99;
        String description = "Teclado controlador MIDI con conexion USB y licencia AbletonLive 9.";
        String vendor = "Laura Import S.R.L.";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
}
