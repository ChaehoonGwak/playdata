package test.model.dao;

import test.model.vo.TestVO;

/*
 * Data Access Object(SQL)
 */

public class TestDAO {
	
	public int insertRow(TestVO vo) {
		/*
		 * insert into table values(vo.getName(), vo.getAge(), vo.getAddress()	)
		 */
		// ORM(Object Relationship Mapping) - MyBatis 환경설정
		System.out.println("dao insertRow~");
		System.out.println(vo.info());
		System.out.println("1 row insert OK");
		return 1;
	}

}
