package com.jwt.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {
	
	private String jwttoken;
	private String username;
	
//	public JwtResponse() {
//		super();
//	}
//
//	public JwtResponse(String jwttoken, String username) {
//		super();
//		this.jwttoken = jwttoken;
//		this.username = username;
//	}
//
//	public String getJwttoken() {
//		return jwttoken;
//	}
//
//	public void setJwttoken(String jwttoken) {
//		this.jwttoken = jwttoken;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	@Override
//	public String toString() {
//		return "JwtResponse [jwttoken=" + jwttoken + ", username=" + username + "]";
//	}
//
//	// Manual Builder Pattern
//	public static JwtResponseBuilder builder() {
//		return new JwtResponseBuilder();
//	}
//
//	public static class JwtResponseBuilder {
//		private String jwttoken;
//		private String username;
//
//		private JwtResponseBuilder() {}
//
//		public JwtResponseBuilder jwttoken(String jwttoken) {
//			this.jwttoken = jwttoken;
//			return this;
//		}
//
//		public JwtResponseBuilder username(String username) {
//			this.username = username;
//			return this;
//		}
//
//		public JwtResponse build() {
//			return new JwtResponse(jwttoken, username);
//		}
//	}

}
