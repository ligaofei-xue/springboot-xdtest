package com.ligaofei.springbootxdtest;

import com.ligaofei.springbootxdtest.model.entity.User;
import com.ligaofei.springbootxdtest.utils.JWTUtils;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringbootXdtestApplicationTests {


	@Test
	public void testGeneJwt(){


		User user = new User();
		user.setId(66);
		user.setName("二当家小D");
		user.setHeadImg("png");

		String token = JWTUtils.geneJsonWebToken(user);

		System.out.println(token);

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Claims claims = JWTUtils.checkJWT(token);

		System.out.println(claims.get("name"));

	}

}
