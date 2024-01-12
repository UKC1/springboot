package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

// 어노테이션 사용시에 ctrl + shift + O로 import 해줘야 함!
@Service
public class LoggingRunner implements ApplicationRunner {
	Logger logger = LoggerFactory.getLogger(LoggingRunner.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.trace("Trace 레벨 로그");
		logger.debug("Debug 레벨 로그");
		logger.info("Info 레벨 로그");
		logger.warn("Warn 레벨 로그");
		logger.error("Error 레벨 로그");
	}
}
