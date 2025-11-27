package com.trust.dto;

public class LanguageRequest {
	private String id;
	private String language;
	public LanguageRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LanguageRequest(String id, String language) {
		super();
		this.id = id;
		this.language = language;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "LanguageRequest [id=" + id + ", language=" + language + "]";
	}
	
	
	
}
