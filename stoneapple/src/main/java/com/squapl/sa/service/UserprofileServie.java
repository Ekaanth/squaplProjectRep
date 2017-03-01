package com.squapl.sa.service;

import java.util.Collection;
import com.squapl.sa.domain.Userprofile;


public interface UserprofileServie  {
	

	public Userprofile insertUserProfile(Userprofile userprofile);
	
	public Userprofile updateUserProfile (Userprofile userprofile); 
	
	public Userprofile retrievePassword (long id);
	
	public void deactivateUserProfile (long id);  
	
	public int uploadUserPix(String imgurl, String userpk);
	
	public void activateuser(long id) ;

	public Collection<Userprofile> findall(); 
	
	public Userprofile getUserProfileDetails(long id); 	
	
	
	
}
