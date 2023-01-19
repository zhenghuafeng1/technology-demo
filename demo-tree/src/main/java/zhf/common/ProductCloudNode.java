package zhf.common;

import org.springframework.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/12/22
 * @ClassName ProductCloudNode
 * @Description
 * @Version 1.0
 **/
public class ProductCloudNode {
    /**
     * 当前节点的值
     */

    private String regionId;

    private String offerId;

    private List<UrlEntity> childList = new LinkedList<>();

    public boolean isLef() {
        return childList == null;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public List<UrlEntity> getChildList() {
        return childList;
    }

    public void setChildList(List<UrlEntity> childList) {
        this.childList = childList;
    }
}
