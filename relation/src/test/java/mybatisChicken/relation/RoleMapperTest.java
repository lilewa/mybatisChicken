package mybatisChicken.relation;

import mybatisChicken.relation.mapper.RoleMapper;
import mybatisChicken.relation.mapper.UserMapper;
import mybatisChicken.relation.model.SysRole;
import mybatisChicken.relation.model.SysUser;
import mybatisChicken.relation.model.SysUserId;
import mybatisChicken.relation.model.SysUserName;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class RoleMapperTest extends BaseMapperTest {

    @Test
    public void testselectUserCountry(){
        //获取 sqlSession
        SqlSession sqlSession = getSqlSession();
        try {
            //获取 RoleMapper 接口
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);


            SysRole role = roleMapper.selectRoleById(1L);
            //role 不为空
            Assert.assertNotNull(role);

        } finally {
            //不要忘记关闭 sqlSession
            sqlSession.close();
        }
    }
}
