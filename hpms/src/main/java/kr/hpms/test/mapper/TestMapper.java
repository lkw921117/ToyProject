package kr.hpms.test.mapper;


import kr.hpms.test.model.TestVO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
	
	List<TestVO> selectTest();
}
