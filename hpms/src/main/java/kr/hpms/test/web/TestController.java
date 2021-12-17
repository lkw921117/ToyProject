package kr.hpms.test.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hpms.test.model.TestVO;
import kr.hpms.test.service.TestService;


@Controller
public class TestController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TestService testService;
		
	
	@RequestMapping("/test")
	private ModelAndView test()  throws Exception{
		
		ModelAndView mav = new ModelAndView("test/TestView");
		
		List<TestVO> testlist = testService.selectTest();
		
		mav.addObject("list" ,testlist);

		return mav;
	}
}
