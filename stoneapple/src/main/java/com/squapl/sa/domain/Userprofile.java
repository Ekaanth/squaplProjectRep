package com.squapl.sa.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Userprofile {
	
	
	
	@Id
	@GeneratedValue
	private long id;
	private String shortUrl;
	private String source;
	private String socailUid;
	private String userEmail;
	private String userType;
	private String displayName;
	private String profileImgUrl;
	private String aboutMe;
	private String connect;
	private String status;
	private String blogAuthor;
	private Date memberSince;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getSocailUid() {
		return socailUid;
	}
	public void setSocailUid(String socailUid) {
		this.socailUid = socailUid;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getProfileImgUrl() {
		return profileImgUrl;
	}
	public void setProfileImgUrl(String profileImgUrl) {
		this.profileImgUrl = profileImgUrl;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBlogAuthor() {
		return blogAuthor;
	}
	public void setBlogAuthor(String blogAuthor) {
		this.blogAuthor = blogAuthor;
	}
	public Date getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(Date memberSince) {
		this.memberSince = memberSince;
	}
	public Userprofile(){
		super();
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Userprofile [id=" + id + ", shortUrl=" + shortUrl + ", source=" + source + ", socailUid=" + socailUid
				+ ", userEmail=" + userEmail + ", userType=" + userType + ", displayName=" + displayName
				+ ", profileImgUrl=" + profileImgUrl + ", aboutMe=" + aboutMe + ", connect=" + connect + ", status="
				+ status + ", blogAuthor=" + blogAuthor + ", memberSince=" + memberSince + ", password=" + password
				+ "]";
	}
	public Userprofile(long id, String shortUrl, String source, String socailUid, String userEmail, String userType,
			String displayName, String profileImgUrl, String aboutMe, String connect, String status, String blogAuthor,
			Date memberSince, String password) {
		super();
		this.id = id;
		this.shortUrl = shortUrl;
		this.source = source;
		this.socailUid = socailUid;
		this.userEmail = userEmail;
		this.userType = userType;
		this.displayName = displayName;
		this.profileImgUrl = profileImgUrl;
		this.aboutMe = aboutMe;
		this.connect = connect;
		this.status = status;
		this.blogAuthor = blogAuthor;
		this.memberSince = memberSince;
		this.password = password;
	}
	
	
	

}
