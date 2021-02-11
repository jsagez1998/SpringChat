package org.dawan.springchat.dto;

import java.util.List;

import org.dawan.springchat.entities.Channel;
import org.dawan.springchat.entities.User;

public class ThemeDto {
	
	private long id ;
	
	private String name;
	
	private String description;
	
	private List<User> users;
	
	private List<Channel> themeChannel;

	public ThemeDto() {
	}

	public ThemeDto(long id, String name, String description, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Channel> getThemeChannel() {
		return themeChannel;
	}

	public void setThemeChannel(List<Channel> themeChannel) {
		this.themeChannel = themeChannel;
	}
	
	

}
