package com.github.tigermessageweb;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TigerMessageWebApplication {
	private static Logger log = Logger.getLogger(TigerMessageWebApplication.class.getClass());
	public static void main(String[] args) {
		SpringApplication.run(TigerMessageWebApplication.class, args);
		log.info("321");
	}

}
