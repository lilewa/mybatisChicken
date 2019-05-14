package mybatisChicken.relation.mapper;

import mybatisChicken.relation.model.SysRole;
import mybatisChicken.relation.model.SysUser;
import mybatisChicken.relation.model.SysUserId;
import mybatisChicken.relation.model.SysUserName;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	
	/**
	 * 通过 id 查询用户
	 * 
	 * @param id
	 * @return
	 */
	SysUser selectBy2JavaBean(SysUserId userId, SysUserName userName);

	/**
	 根据用户id查询用户信息及国籍信息	 *
	 * @return
	 */
	SysUser selectUserCountry(Long id);


	SysUser selectUserCountryAssociation(Long id);


	SysUser selectUserNest(Long id);


}
