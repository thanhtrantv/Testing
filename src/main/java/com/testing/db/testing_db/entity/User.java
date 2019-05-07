/* 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://beta.skaffolder.com/#!/register?friend=5cd0f8ef5eb6055c1e7469b5
*
* You will get 10% discount for each one of your friends
* 
*/
package com.testing.db.testing_db.entity;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class User implements RowMapper<User>{

	private String username;
    private String password;
    private String mail;
    private String name;
    private String surname;
    private String token;
    private Long _id;
    private ArrayList<String> roles;

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User obj = new User();
		try {
			obj.set_id(rs.getLong("_id"));
			obj.setUsername(rs.getString("username"));
			obj.setPassword(rs.getString("password"));
			obj.setMail(rs.getString("mail"));
			obj.setName(rs.getString("name"));
			obj.setSurname(rs.getString("surname"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public ArrayList<String> getRoles() {
		return roles;
	}


	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}


	public Long get_id() {
		return _id;
	}


	public void set_id(Long _id) {
		this._id = _id;
	}

	/**
	 * Check is user have role
	 * @param role
	 * @return 
	 */
	public boolean hasRole(String role) {
		return roles.indexOf(role) != -1;
	}

}
