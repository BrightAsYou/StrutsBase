package prs.rfh.test.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
	public static final Logger log = LoggerFactory.getLogger(TestLog.class);
	public static void main(String[] args) {
//		log.debug("hello");
		
		log.error("error");
		log.warn("warn");
		log.info("info");
		log.debug("debug");
		log.trace("trace");
		
//		log.debug("debug");
		
		//级别  1.tarce 2 debug 3.info 4.warn 5.error
	}
	
}
