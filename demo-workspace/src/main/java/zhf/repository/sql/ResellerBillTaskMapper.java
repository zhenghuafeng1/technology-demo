package zhf.repository.sql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zhf.base.CommonMapper;
import zhf.entity.ResellerBillTaskEntity;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillItemSyncDataMapper
 * @Description
 * @Version 1.0
 **/
@Mapper
public interface ResellerBillTaskMapper extends CommonMapper<ResellerBillTaskEntity> {

    @Select({"<script>",
            " SELECT rbt.id,rbt.bill_task_code,rbt.reseller_platform_code,rbt.sync_cycle,rbt.last_sync_time,rbt.next_sync_next,rbt.sync_status,rbt.create_time,rbt.modify_time",
            " FROM reseller_bill_task rbt LEFT JOIN reseller_customer_info rci ON rbt.reseller_platform_code = rci.reseller_platform_code",
            " WHERE",
            " rbt.next_sync_next &lt; NOW()",
            " <if test=\"custCode != null and custCode !=''\"> and rci.cust_code = #{custCode} </if>",
            "</script>"})
    List<ResellerBillTaskEntity> queryNextSyncTask(@Param("custCode")String custCode);
}
