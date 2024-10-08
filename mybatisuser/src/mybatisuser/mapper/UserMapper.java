package mybatisuser.mapper;

import java.util.List;

import mybatisuser.domain.User;

public interface UserMapper {
	
	public abstract List<User> getUserList();
	
	public abstract User getUser(int userNo);
	
	public abstract int insertUser(User user);
	
	public abstract int updateUser(User user);
	
	public abstract int deleteUser(User user);	

}
