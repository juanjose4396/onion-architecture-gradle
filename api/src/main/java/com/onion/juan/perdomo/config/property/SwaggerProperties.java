package com.onion.juan.perdomo.config.property;

import com.onion.juan.perdomo.config.property.factory.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties("swagger.config")
@PropertySource(value = "classpath:swagger.yml", factory = YamlPropertySourceFactory.class)
public class SwaggerProperties {
	private String basePackage;
	private String title;
	private String description;
	private String version;
	private String license;
	private String licenseUrl;
	private String contactName;
	private String contactUrl;
	private String contactMail;
	private String messageUnauthorized;
	private String messageForbidden;
	private String messageNotFound;
	private String messageInternalServerError;

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
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
	public String getLicenseUrl() {
		return licenseUrl;
	}
	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactUrl() {
		return contactUrl;
	}
	public void setContactUrl(String contactUrl) {
		this.contactUrl = contactUrl;
	}
	public String getContactMail() {
		return contactMail;
	}
	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}
	public String getMessageUnauthorized() {
		return messageUnauthorized;
	}
	public void setMessageUnauthorized(String messageUnauthorized) {
		this.messageUnauthorized = messageUnauthorized;
	}
	public String getMessageForbidden() {
		return messageForbidden;
	}
	public void setMessageForbidden(String messageForbidden) {
		this.messageForbidden = messageForbidden;
	}
	public String getMessageNotFound() {
		return messageNotFound;
	}
	public void setMessageNotFound(String messageNotFound) {
		this.messageNotFound = messageNotFound;
	}
	public String getMessageInternalServerError() {
		return messageInternalServerError;
	}
	public void setMessageInternalServerError(String messageInternalServerError) {
		this.messageInternalServerError = messageInternalServerError;
	}
}
