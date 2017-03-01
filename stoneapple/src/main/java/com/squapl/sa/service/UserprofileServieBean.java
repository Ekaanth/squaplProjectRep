package com.squapl.sa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Userprofile;
import com.squapl.sa.domain.UserprofileRepository;

@Service
public  class UserprofileServieBean implements UserprofileServie {

	@Autowired
	private UserprofileRepository userprofilerepository;

	@Override
	public Userprofile insertUserProfile(Userprofile userprofile) {
		if(userprofile == null)
		{
			return null;
		}
		
		Userprofile insertprofile= userprofilerepository.save(userprofile);
		System.out.println(insertprofile);
		return insertprofile;
	}
	
	

	@Override
	public Userprofile updateUserProfile (Userprofile userprofile) {
		Userprofile updateprofile=(Userprofile) userprofilerepository.save(userprofile);
		return updateprofile;
	}

	@Override
	public Userprofile retrievePassword(long id) {
		Userprofile userprofiledeactivate=userprofilerepository.findByid(id);
		
		return userprofiledeactivate;
	}

	@Override
	public void deactivateUserProfile(long id) {
		userprofilerepository.deactivateuserprofile(id);
	}

	@Override
	public Userprofile getUserProfileDetails(long id) {
		Userprofile userprofiledeactivate= userprofilerepository.getuserprofile(id);
		return userprofiledeactivate;
	}

	@Override
	public int uploadUserPix(String imgurl, String userpk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void activateuser(long id) {
		Userprofile userprofiledeactivate=userprofilerepository.findByid(id);
		userprofiledeactivate.setStatus("ac");
		updateUserProfile(userprofiledeactivate);
		
	}



	@Override
	public Collection<Userprofile> findall() {
		Collection<Userprofile> userfind = userprofilerepository.listall();
		return userfind;
	}



}
