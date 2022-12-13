package zhf.enums;

/**
 * @Autor zhenghf
 * @Date 2022/12/9
 * @ClassName DocTypeEnum
 * @Description
 * @Version 1.0
 **/
public enum DocTypeEnum {
    DIR("dir"),
    DOC("doc");
    private String value;

    DocTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
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
