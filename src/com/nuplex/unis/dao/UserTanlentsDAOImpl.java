package com.nuplex.unis.dao;

import org.apache.ibatis.session.SqlSession;

public class UserTanlentsDAOImpl implements UserTanlentsDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}//setSqlSession() end
	
	
}//UserTanlentsDAOImpl end
