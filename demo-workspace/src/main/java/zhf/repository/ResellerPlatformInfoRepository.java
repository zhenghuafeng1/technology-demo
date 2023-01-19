package zhf.repository;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import zhf.base.BaseRepository;
import zhf.entity.ResellerPlatformInfoEntity;
import zhf.entity.model.ResellerPlatformInfoDto;
import zhf.enums.ResellerBillTaskStatusEnum;
import zhf.repository.sql.ResellerPlatformInfoMapper;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillItemSyncDataRepository
 * @Description
 * @Version 1.0
 **/
@Repository
public class ResellerPlatformInfoRepository extends BaseRepository<ResellerPlatformInfoEntity> {
    private ResellerPlatformInfoMapper mapper;
    public ResellerPlatformInfoRepository(ResellerPlatformInfoMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }

    public ResellerPlatformInfoEntity queryAll() {
        Example example = new Example(ResellerPlatformInfoEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("cloudPlatform", ResellerBillTaskStatusEnum.PROCESSING);
        return mapper.selectOneByExample(example);
    }
}
