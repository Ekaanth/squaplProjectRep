package com.squapl.sa.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.squapl.sa.domain.Userprofile;
import com.squapl.sa.service.UserprofileServie;

@RestController
public class UserprofileController {
	
	@Autowired
	private UserprofileServie userprofileservice;

	@RequestMapping(value="/updateuser/{id}",
			method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Userprofile> update(@RequestBody Userprofile userprofile){
		Userprofile updateUserprofile = userprofileservice.updateUserProfile(userprofile);
		return new ResponseEntity<Userprofile> (updateUserprofile, HttpStatus.CREATED);
	
	}
	
	@RequestMapping(value="/newuser",
			method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Userprofile> insertUserprofile(@RequestBody Userprofile userprofile){
		Userprofile newuser = userprofileservice.insertUserProfile(userprofile);
		return new ResponseEntity<Userprofile> (newuser, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/deacivate/{id}",
			method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Userprofile> deactivateUserProfile(@PathVariable("id") long id){
		userprofileservice.deactivateUserProfile(id);
		return new ResponseEntity<Userprofile> (HttpStatus.OK );
	}
	
	@RequestMapping(value="/list")
	public ResponseEntity<Collection<Userprofile>> getUserprofile(){
		Collection<Userprofile> userlist = userprofileservice.findall();
		return new ResponseEntity<Collection<Userprofile>>(userlist,HttpStatus.OK);	
	}
	
	@RequestMapping(value="/getuserprofile/{id}",
			method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Userprofile> getUserProfileDetails(@PathVariable("id") long id){
		Userprofile getprofile = userprofileservice.getUserProfileDetails(id);
		return new ResponseEntity<Userprofile> (getprofile, HttpStatus.OK);
	}
	
	@RequestMapping(value="/activate/{id}",
			method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Userprofile> activateuser(@PathVariable("id") long id){
		userprofileservice.activateuser(id);
		return new ResponseEntity<Userprofile> (HttpStatus.OK);
	}
	
	@RequestMapping(value="/retrivepassword/{id}",
			method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getpassword(@PathVariable("id") long id){
		Userprofile getpassword = userprofileservice.retrievePassword(id);
		String pwd=getpassword.getPassword();
		return new ResponseEntity<String> (pwd,HttpStatus.OK );
	}
	
	
}
