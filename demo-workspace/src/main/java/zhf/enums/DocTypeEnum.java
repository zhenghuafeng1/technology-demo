package zhf.enums;

/**
 * @Autor zhenghf
 * @Date 2022/12/9
 * @ClassName DocTypeEnum
 * @Description
 * @Version 1.0
 **/
public enum DocTypeEnum {
    DIR("dir", "sss", "aaa"),
    DOC("doc", "yyy", "bbb");

    private String value;
    private String feishuValue;
    private String yuqueValue;

    DocTypeEnum(String value, String feishuValue, String yuqueValue) {
        this.value = value;
        this.feishuValue = feishuValue;
        this.yuqueValue = yuqueValue;
    }

    public String getValue() {
        return this.value;
    }

    public String getFeishuValue() {
        return this.feishuValue;
    }

    public String getYuqueValue() {
        return this.yuqueValue;
    }

    public static boolean contains(String docType) {
        for (DocTypeEnum docTypeEnum : DocTypeEnum.values()) {
            if (docTypeEnum.getValue().equals(docType)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
