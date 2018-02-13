package com.example.usuario.databindingchuckexample.data.model;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("icon_url")
	private String iconUrl;

	@SerializedName("id")
	private String id;

	@SerializedName("category")
	private Object category;

	@SerializedName("value")
	private String value;

	@SerializedName("url")
	private String url;

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategory(Object category){
		this.category = category;
	}

	public Object getCategory(){
		return category;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"icon_url = '" + iconUrl + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",value = '" + value + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}