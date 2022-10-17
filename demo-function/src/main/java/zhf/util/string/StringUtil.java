package zhf.util.string;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Autor zhenghf
 * @Date 2022/10/17
 * @ClassName StringUtil
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Component
public class StringUtil {

    //用于打印hex报文
    private static String[] HEX_STR_ARRAY = new String[256];

    static {
        initUtil();

    }

    private static void initUtil() {
        if (HEX_STR_ARRAY != null) {
            for (int i = 0; i < 256; i++) {
                StringBuffer eleSb = new StringBuffer();
                eleSb.append(Integer.toHexString(i));
                if (eleSb.length() == 1) {
                    eleSb.insert(0, '0');
                }
                StringUtil.HEX_STR_ARRAY[i] = eleSb.toString();
            }
        }
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description byte数组转String数组
     * @param byteArray
     * @return String[]
     */
    public static String[] byteArrayToStrArray(byte[] byteArray) {

        return null;
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description byte数组以16进制转String
     * @param byteArray
     * @return String
     */
    public static String byteArrayToStr(byte[] byteArray) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            sb.append(StringUtil.HEX_STR_ARRAY[byteArray[i] & 0xff]);
        }
        return sb.toString();
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description Object数组转String数组
     * @param objectArray
     * @return String[]
     */
    public static String[] objectArrayToStrArray(Object[] objectArray) {

        return null;
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description Object转String
     * @param object
     * @return String
     */
    public static String objectToStr(Object object) {

        return null;
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description byte字节转换为字符串
     * @param bt
     * @return String
     */
    public static String byteToStr(byte bt) {
        StringBuffer sb = new StringBuffer();
        sb.append(StringUtil.HEX_STR_ARRAY[bt & 0xff]);
        return sb.toString();
    }

    /**
     * @author zhenghf
     * @date 2022/10/17
     * @description 字节数组转换为二进制字符串
     * @param byteArray
     * @return String
     */
    public static String byteArrayToBinStr(byte[] byteArray) {
        StringBuffer value = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            StringBuffer sb = new StringBuffer(Integer.toBinaryString(byteArray[i] & 0xff));
            while (sb.length() < 8) {
                sb.insert(0, '0');
            }
            value.append(sb);
        }
        return value.toString();
    }

    public static String byteArrayToUTF8(byte[] byteArray) {

        return null;
    }
}
