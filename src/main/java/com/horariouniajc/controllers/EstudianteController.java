package com.horariouniajc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.horariouniajc.models.Usuario;
import com.horariouniajc.services.api.EntityServiceAPI;

@Controller(value = "/estudiante")
public class EstudianteController {

	@Autowired
	private EntityServiceAPI<Usuario, Integer> estudianteServiceApi;

	/*
	 * @Query("from Auction a join a.category c where c.name=:categoryName") public
	 * Iterable<Auction> findByCategory(@Param("categoryName") String categoryName);
	 */
	
	
	/*@PostMapping("/login")
	public QuarkResult Login(String email,String password) {

	    QuarkResult result = restProcessor(() -> {
	        User loginUser = userService.findByEmail(email);
	        if (loginUser == null)
	            return QuarkResult.warn("用户邮箱不存在，请重新输入");
	        if (!loginUser.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes())))
	            return QuarkResult.warn("用户密码错误，请重新输入");
	        String token = userService.LoginUser(loginUser);
	        return QuarkResult.ok(token);
	    });
	    return result;
	}*/

}
