package zhf.service.impl;

import org.springframework.stereotype.Component;
import zhf.annotation.SetSex;
import zhf.service.BaseSetSexService;

import java.lang.reflect.Field;

/**
 * @Autor zhenghf
 * @Date 2022/12/23
 * @ClassName SetSexConfig
 * @Description
 * @Version 1.0
 **/
@Component
public class SetSexConfig {

    public void init(BaseSetSexService entry) {
        Field[] declaredFields = entry.getClass().getDeclaredFields();

        SetSex lwinnerG=(SetSex) declaredField.getAnnotation(SetSex.class);
        String value = lwinnerG.sex();


        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(SetSex.class)){

                try {
                    declaredField.set(entry,value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
