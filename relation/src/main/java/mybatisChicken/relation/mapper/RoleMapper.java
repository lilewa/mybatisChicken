package mybatisChicken.relation.mapper;

import mybatisChicken.relation.model.SysRole;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;


public interface RoleMapper {
	SysRole selectRoleById(Long id);
	
}
