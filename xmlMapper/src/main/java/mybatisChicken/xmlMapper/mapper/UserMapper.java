package mybatisChicken.xmlMapper.mapper;



import mybatisChicken.xmlMapper.model.SysUser;
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
	SysUser selectById(Long id);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	List<SysUser> selectAll();
	

	/**
	 * 新增用户
	 * 
	 * @param sysUser
	 * @return
	 */
	int insert(SysUser sysUser);
	
	/**
	 * 新增用户 - 使用 useGeneratedKeys 方式
	 * 
	 * @param sysUser
	 * @return
	 */
	int insert2(SysUser sysUser);
	
	/**
	 * 新增用户 - 使用 selectKey 方式
	 * 
	 * @param sysUser
	 * @return
	 */
	int insert3(SysUser sysUser);
	
	/**
	 * 根据主键更新
	 * 
	 * @param sysUser
	 * @return
	 */
	int updateById(SysUser sysUser);
	
	/**
	 * 通过主键删除
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(Long id);
	
	/**
	 * 通过主键删除
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(SysUser sysUser);
	

}
