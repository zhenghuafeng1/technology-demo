package zhf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.base.MethodUrl;
import zhf.common.Node;
import zhf.enums.MethodEnum;
import zhf.utils.BuildUtil;

/**
 * @Autor zhenghf
 * @Date 2022/11/14
 * @ClassName TreeController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/tree")
public class TreeController {

    @GetMapping("/getTree")
    public Object getTree() {

        MethodUrl methodUrl1 = new MethodUrl();
        methodUrl1.setUrl("localhost:8080/tree/getTree");
        methodUrl1.setMethod(MethodEnum.GET);

        MethodUrl methodUrl2 = new MethodUrl();
        methodUrl2.setUrl("localhost:8080/tree/getTree/query");
        methodUrl2.setMethod(MethodEnum.GET);

        MethodUrl methodUrl3 = new MethodUrl();
        methodUrl3.setUrl("localhost:8080/map/getTree");
        methodUrl3.setMethod(MethodEnum.POST);

        MethodUrl methodUrl4 = new MethodUrl();
        methodUrl4.setUrl("localhost:8080/list/getTree");
        methodUrl4.setMethod(MethodEnum.GET);

        MethodUrl methodUrl5 = new MethodUrl();
        methodUrl5.setUrl("localhost:8080/tree/getTree/query/all");
        methodUrl5.setMethod(MethodEnum.GET);

        Node node = new Node();

        BuildUtil.nodeBuild(node, methodUrl1.getUrl().split("/"), 0, methodUrl1);
        BuildUtil.nodeBuild(node, methodUrl2.getUrl().split("/"), 0, methodUrl2);
        BuildUtil.nodeBuild(node, methodUrl3.getUrl().split("/"), 0, methodUrl3);
        BuildUtil.nodeBuild(node, methodUrl4.getUrl().split("/"), 0, methodUrl4);
        BuildUtil.nodeBuild(node, methodUrl5.getUrl().split("/"), 0, methodUrl5);

        return node;
    }

}
