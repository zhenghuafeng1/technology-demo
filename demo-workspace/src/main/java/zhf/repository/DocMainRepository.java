package zhf.repository;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import zhf.base.BaseRepository;
import zhf.entity.DocMainEntity;
import zhf.repository.sql.DocMainMapper;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocMainRepository
 * @Description
 * @Version 1.0
 **/
@Repository
public class DocMainRepository extends BaseRepository<DocMainEntity> {

    private DocMainMapper mapper;

    public DocMainRepository(DocMainMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }

    public List<DocMainEntity> getDocMainList() {
        return mapper.selectAll();
    }

    public List<DocMainEntity> getDocMainListByCode() {

        return null;
    }

    /**
     * @author zhenghf
     * @date 2022/12/6
     * @description 根据currentCode获取parent_code
     * @param currentCode
     * @return List<DocMainEntity>
     */
    public DocMainEntity getDocMain(String currentCode) {
        Example example = new Example(DocMainEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("currentCode", currentCode);
        return mapper.selectOneByExample(example);
    }

    /**
     * @author zhenghf
     * @date 2022/12/6
     * @description 获取同级目录和文档
     * @param parentCode
     * @return List<DocMainEntity>
     */
    public List<DocMainEntity> getPeerByCurrentCode(String parentCode, String currentCode) {
        Example example = new Example(DocMainEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("parentCode", parentCode);
        criteria.andNotEqualTo("currentCode", currentCode);
        example.setOrderByClause("doc_order ASC");
        return mapper.selectByExample(example);
    }

    public void updateDocOrderBathch(List<DocMainEntity> docMainEntities) {

    }

}
