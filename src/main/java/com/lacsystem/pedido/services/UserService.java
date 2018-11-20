package com.lacsystem.pedido.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.lacsystem.pedido.security.UserSpringSecurity;

/**
 * @author Luiz.Cesario
 *
 */
public class UserService {

	public static UserSpringSecurity authenticated() {
		try {
			return (UserSpringSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
