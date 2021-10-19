package com.raji.methods;
/*
import java.awt.PageAttributes.MediaType
;*/

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Methods")
public class MethodController {

	@GetMapping
	 public String GetMethod(@RequestParam (value="Page",defaultValue="1")int Page,
	 @RequestParam (value="Limit",defaultValue="1")int Limit ,
	 @RequestParam (value="sort",defaultValue="desc", required=false)String sort)  
	    {  
	        return "GET METHOD WORKS,its Page is = " + Page + " and its limit ==>" +Limit+" sort is ==>" +sort ;  
	    }
	@GetMapping (path="/{userId}"
	//	,produces = {MediaType.APPLICATION_XML_VALUE}
				,produces = {MediaType.APPLICATION_JSON_VALUE})
	 public Details getMethod(@PathVariable String userId )  
	    {  
		Details value =new Details();
		value.setFirstName("RAJA RAJESHWARI");

		value.setLastName("Mahendiran");

		value.setEmail("raji@openweaver.com");

		value.setId(20);
		
	        return value;  
	    }
	@PostMapping
	 public String postMethod()  
	    {  
	        return "POST METHOD WORKS";  
	    }
	@PutMapping
	 public String putMethod()  
	    {  
	        return "PUT METHOD WORKS";  
	    }
	@DeleteMapping
	 public String deleteMethod()  
	    {  
	        return "DELETE METHOD WORKS";  
	    }
}
