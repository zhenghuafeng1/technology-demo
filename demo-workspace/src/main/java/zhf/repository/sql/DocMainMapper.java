package zhf.repository.sql;

import org.apache.ibatis.annotations.Mapper;
import zhf.base.CommonMapper;
import zhf.entity.DocMainEntity;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocMainMapper
 * @Description
 * @Version 1.0
 **/
@Mapper
public interface DocMainMapper extends CommonMapper<DocMainEntity> {

    int updateDocOrderBathch(List<DocMainEntity> list);
}
