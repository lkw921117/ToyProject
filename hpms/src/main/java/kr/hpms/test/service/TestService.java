package kr.hpms.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hpms.test.mapper.TestMapper;
import kr.hpms.test.model.TestVO;


@Service
public class TestService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public TestMapper testmapper;
	
	public List<TestVO> selectTest(){
				
		return testmapper.selectTest();
	}
}
