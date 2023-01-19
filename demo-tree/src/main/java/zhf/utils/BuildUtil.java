package zhf.utils;

import zhf.base.MethodUrl;
import zhf.common.Node;
import zhf.common.ProductCloudNode;
import zhf.common.UrlEntity;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/11/14
 * @ClassName Build
 * @Description
 * @Version 1.0
 **/
public class BuildUtil {

    public static void nodeBuild(Node node, String[] path, int offset, MethodUrl methodUrl) {
        if (path.length == offset) {
            node.addMethodUrl(methodUrl);
            return;
        }

        boolean isMatch = false;

        for (Node child : node.getChildList()) {
            if (child.getPathValue().equals(path[offset])) {
                nodeBuild(child, path, offset + 1, methodUrl);
                isMatch = true;
            }
        }

        if (!isMatch) {
            Node newNode = new Node();
            newNode.setPathValue(path[offset]);
            node.getChildList().add(newNode);
            nodeBuild(newNode, path, offset + 1, methodUrl);
        }
    }

    public static void productBuild(ProductCloudNode productCloudNode, String regionId, String offerId, List<UrlEntity> childList) {
        if (path.length == offset) {
            node.addMethodUrl(methodUrl);
            return;
        }

        boolean isMatch = false;

        for (Node child : node.getChildList()) {
            if (child.getPathValue().equals(path[offset])) {
                nodeBuild(child, path, offset + 1, methodUrl);
                isMatch = true;
            }
        }

        if (!isMatch) {
            Node newNode = new Node();
            newNode.setPathValue(path[offset]);
            node.getChildList().add(newNode);
            nodeBuild(newNode, path, offset + 1, methodUrl);
        }
    }

}
