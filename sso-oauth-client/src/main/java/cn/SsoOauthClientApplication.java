package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableOAuth2Sso
@SpringBootApplication
@EnableSwagger2
public class SsoOauthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoOauthClientApplication.class, args);
    }

}
