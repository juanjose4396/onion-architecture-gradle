package com.onion.juan.perdomo.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:swagger.yml")
@ConfigurationProperties("swagger.config")
public class SwaggerProperties {
	
	private String basepackage;
	private String title;
	private String description;
	private String version;

	private String license;
	private String licenseurl;

	private String contactname;
	private String contacturl;
	private String contactmail;
	private String messageunauthorized; 
	private String messageforbidden; 
	private String messagenotfound;
	private String messageinternalservererror;
	
	public String getBasepackage() {
		return basepackage;
	}
	public void setBasepackage(String basepackage) {
		this.basepackage = basepackage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getLicenseurl() {
		return licenseurl;
	}
	public void setLicenseurl(String licenseurl) {
		this.licenseurl = licenseurl;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContacturl() {
		return contacturl;
	}
	public void setContacturl(String contacturl) {
		this.contacturl = contacturl;
	}
	public String getContactmail() {
		return contactmail;
	}
	public void setContactmail(String contactmail) {
		this.contactmail = contactmail;
	}
	public String getMessageunauthorized() {
		return messageunauthorized;
	}
	public void setMessageunauthorized(String messageunauthorized) {
		this.messageunauthorized = messageunauthorized;
	}
	public String getMessageforbidden() {
		return messageforbidden;
	}
	public void setMessageforbidden(String messageforbidden) {
		this.messageforbidden = messageforbidden;
	}
	public String getMessagenotfound() {
		return messagenotfound;
	}
	public void setMessagenotfound(String messagenotfound) {
		this.messagenotfound = messagenotfound;
	}
	public String getMessageinternalservererror() {
		return messageinternalservererror;
	}
	public void setMessageinternalservererror(String messageinternalservererror) {
		this.messageinternalservererror = messageinternalservererror;
	}
}
