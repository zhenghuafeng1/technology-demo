package zhf.common;

import org.springframework.util.CollectionUtils;
import zhf.base.MethodUrl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/11/14
 * @ClassName Node
 * @Description
 * @Version 1.0
 **/
public class Node {

    /**
     * 当前节点的值
     */
    private String pathValue;

    /**
     * 子节点列表
     */
    private List<Node> childList = new LinkedList<>();

    /**
     * 是否叶子节点
     */
    private List<MethodUrl> methodUrlList;

    public boolean isLeaf() {
        return !CollectionUtils.isEmpty(methodUrlList);
    }

    /**
     * @param methodUrl
     * @author zhenghf
     * @date 2022/11/14
     * @description 添加叶子节点参数
     */
    public void addMethodUrl(MethodUrl methodUrl) {
        if (null == methodUrlList) {
            methodUrlList = new ArrayList<>();
        }
        methodUrlList.add(methodUrl);
    }

    public void setPathValue(String pathValue) {
        this.pathValue = pathValue;
    }

    public String getPathValue() {
        return pathValue;
    }

    public void setChildList(List<Node> childList) {
        this.childList = childList;
    }

    public List<Node> getChildList() {
        return childList;
    }

    public void setMethodUrl(List<MethodUrl> methodUrl) {
        this.methodUrlList = methodUrl;
    }

    public List<MethodUrl> getMethodUrl() {
        return methodUrlList;
    }
}
