package zhf.repository;

import org.springframework.stereotype.Repository;
import zhf.base.BaseRepository;
import zhf.entity.ResellerOssInfoEntity;
import zhf.repository.sql.ResellerOssInfoMapper;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillItemSyncDataRepository
 * @Description
 * @Version 1.0
 **/
@Repository
public class ResellerOssInfoRepository extends BaseRepository<ResellerOssInfoEntity> {
    private ResellerOssInfoMapper mapper;
    public ResellerOssInfoRepository(ResellerOssInfoMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }
}
