package mybatisChicken.relation;


import mybatisChicken.relation.mapper.UserMapper;
import mybatisChicken.relation.model.SysUser;
import mybatisChicken.relation.model.SysUserId;
import mybatisChicken.relation.model.SysUserName;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class UserMapperTest extends BaseMapperTest {
	
	@Test
	public void testSelectBy2JavaBean(){
		//获取 sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取 UserMapper 接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

			SysUserId userId=new SysUserId();
			userId.setId(1L);
			SysUserName userName=new SysUserName();
			userName.setUserName("admin");
			SysUser user = userMapper.selectBy2JavaBean(userId,userName);
			//user 不为空
			Assert.assertNotNull(user);
			//userName = admin
			Assert.assertEquals("admin", user.getUserName());
		} finally {
			//不要忘记关闭 sqlSession
			sqlSession.close();
		}
	}
	@Test
	public void testselectUserCountry(){
		//获取 sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取 UserMapper 接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


			SysUser user = userMapper.selectUserCountry(1L);
			//user 不为空
			Assert.assertNotNull(user);
			//userName = admin
			Assert.assertEquals("admin", user.getUserName());
		} finally {
			//不要忘记关闭 sqlSession
			sqlSession.close();
		}
	}

	@Test
	public void testselectUserCountryAssociation(){
		//获取 sqlSession
		SqlSession sqlSession = getSqlSession();
		try {
			//获取 UserMapper 接口
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


			SysUser user = userMapper.selectUserCountryAssociation(1L);
			//user 不为空
			Assert.assertNotNull(user);
			//userName = admin
			Assert.assertEquals("admin", user.getUserName());
		} finally {
			//不要忘记关闭 sqlSession
			sqlSession.close();
		}
	}

}
