package majiang.mapper;

import majiang.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

//    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(account_id, name, token, gmt_create, gmt_modified) values(#{accountId}, #{name},#{token}, #{gmtCreate},#{gmtModified})")
    public void insert(User user);

//    @Select("")
//    public User select();

}
