package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.entity.PlatformDto;
import zhf.entity.PlatformEntity;
import zhf.mapstruct.PlatformMapStruct;

/**
 * @Autor zhenghf
 * @Date 2022/10/31
 * @ClassName PlatformController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/platform")
public class PlatformController {

    @Autowired
    private PlatformMapStruct platformMapStruct;

    @GetMapping("/test/{type}")
    public PlatformDto test(@PathVariable("type") String type) {

        PlatformEntity platformEntity = new PlatformEntity();
        platformEntity.setName("zhf");
        platformEntity.setUrl("11111111");
        platformEntity.setPlatform(type);

        PlatformDto platformDto = platformMapStruct.entitytoDto(platformEntity);

        return platformDto;
    }

}
