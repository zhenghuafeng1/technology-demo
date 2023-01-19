package zhf.repository;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
import zhf.base.BaseRepository;
import zhf.entity.ResellerBillTaskEntity;
import zhf.enums.ResellerBillTaskStatusEnum;
import zhf.repository.sql.ResellerBillTaskMapper;

import java.util.Date;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillItemSyncDataRepository
 * @Description
 * @Version 1.0
 **/
@Repository
public class ResellerBillTaskRepository extends BaseRepository<ResellerBillTaskEntity> {
    private ResellerBillTaskMapper mapper;
    public ResellerBillTaskRepository(ResellerBillTaskMapper mapper) {
        super(mapper);
        this.mapper = mapper;
    }

    /**
     * @author zhenghf
     * @date 2023/1/5
     * @description 查询符合next_sync_time的账单记录
     * @return List<ResellerBillTaskEntity>
     */
    public List<ResellerBillTaskEntity> queryNextSyncTask(String custCode) {
        return mapper.queryNextSyncTask(custCode);
    }

    /**
     * @author zhenghf
     * @date 2023/1/5
     * @description 批量修改账单同步任务状态
     * @param ids
     * @return int
     */
    public int updateStatusBatch(List<Long> ids) {
        Example example = new Example(ResellerBillTaskEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", ids);
        ResellerBillTaskEntity resellerBillTaskEntity = ResellerBillTaskEntity.builder()
                .syncStatus(ResellerBillTaskStatusEnum.PROCESSING.getValue())
                .modifyTime(new Date())
                .build();
        return mapper.updateByExample(resellerBillTaskEntity, example);
    }
}
