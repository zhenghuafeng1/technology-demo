package zhf.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;
import tk.mybatis.mapper.common.special.InsertUseGeneratedKeysMapper;

/**
 * @Autor zhenghf
 * @Date 2022/10/18
 * @ClassName CommonMapper
 * @Description
 * @Version 1.0
 **/
public interface CommonMapper<T> extends Mapper<T>, InsertUseGeneratedKeysMapper<T>, InsertListMapper<T> {
}
