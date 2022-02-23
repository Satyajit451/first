package in.Ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Ashokit.binding.KES_Request;
import in.Ashokit.entity.KES;
import in.Ashokit.service.ArServiceImpl;
@RestController
public class ArRestController {
	String Kentucky;
	@Autowired
	private ArServiceImpl service;
	
	
	
	
	@PostMapping("/registerApp")
	public ResponseEntity<String> register(@RequestBody KES_Request req) {
		
		String st = service.checkForState(req.getSsn());
		//String st = "Kentucky";
		if(st.equals("Kentucky")){
			KES resp = service.saveRegistation(req);
			if(resp!=null) {
				return new ResponseEntity<String> ("Created", HttpStatus.CREATED);
			}else {
				return new ResponseEntity<String> ("NOTCreated", HttpStatus.BAD_REQUEST);
			}
			
		}else {
			String respp = "invalid ";
		return new ResponseEntity<String> (respp, HttpStatus.BAD_REQUEST);
	}
	}
}
