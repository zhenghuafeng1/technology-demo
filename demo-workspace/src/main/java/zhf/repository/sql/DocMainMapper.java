package zhf.repository.sql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
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

    @Update("<script>" +
            "update doc_main" +
            "    <trim prefix=\"set\" suffixOverrides=\",\">" +
            "      <trim prefix=\"doc_order = CASE \" suffix=\"END,\">" +
            "        <foreach collection=\"list\" index=\"index\" item=\"item\" >" +
            "          when id = #{item.id} then #{item.docOrder}" +
            "        </foreach>" +
            "      </trim>" +
            "    </trim>" +
            "    where id in" +
            "    <foreach collection=\"list\" item=\"item\" index=\"index\" separator=\",\" open=\"(\" close=\")\" >" +
            "      #{item.id}" +
            "    </foreach>" +
            "</script>")
    int updateDocOrderBatch(List<DocMainEntity> list);
}
