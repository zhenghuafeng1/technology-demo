package zhf.repository.sql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zhf.base.CommonMapper;
import zhf.entity.ResellerPlatformInfoEntity;
import zhf.entity.model.ResellerPlatformInfoDto;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillItemSyncDataMapper
 * @Description
 * @Version 1.0
 **/
@Mapper
public interface ResellerPlatformInfoMapper extends CommonMapper<ResellerPlatformInfoEntity> {

    @Select({"<script>",
            " SELECT rpi.*,roi.*",
            " from reseller_platform_info rpi right join reseller_oss_info roi on rpi.reseller_platform_code = roi.reseller_platform_code",
            "</script>"})
    ResellerPlatformInfoDto queryAll();
}
