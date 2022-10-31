package zhf.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import zhf.entity.PlatformDto;
import zhf.entity.PlatformEntity;

/**
 * @Autor zhenghf
 * @Date 2022/10/31
 * @ClassName PlatformMapStruct
 * @Description
 * @Version 1.0
 **/
@Mapper(componentModel = "spring")
public interface PlatformMapStruct {
    @Mapping(target = "platform", ignore = true)
    PlatformDto entitytoDto(PlatformEntity platformEntity);
}
