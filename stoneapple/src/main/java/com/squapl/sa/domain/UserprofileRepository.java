package com.squapl.sa.domain;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserprofileRepository extends JpaRepository<Userprofile, String>{

	public Userprofile findByid(long id);
	
    @Query("SELECT u FROM Userprofile u")
	public Collection<Userprofile> listall();
    
    @Modifying
    @Query("UPDATE Userprofile SET status='na' WHERE id= ?1")
    @Transactional
   	public Collection<Userprofile> deactivateuserprofile(long id);
    
    @Query("SELECT u FROM Userprofile u WHERE id= :id")
    public Userprofile getuserprofile(@Param("id") long id);
	
}
