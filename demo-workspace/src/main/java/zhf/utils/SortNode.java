package zhf.utils;

import org.springframework.stereotype.Component;
import zhf.entity.DocMainEntity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/12/7
 * @ClassName SortNode
 * @Description
 * @Version 1.0
 **/
@Component
public class SortNode {
    private BigDecimal orderCode;
    private DocMainEntity docEntity;
    private SortNode next;
    private SortNode tail;



    SortNode(){}

    SortNode(DocMainEntity docEntity) {
        this.docEntity = docEntity;
        this.orderCode = docEntity.getDocOrder();
    }

    /**
     * @author zhenghf
     * @date 2022/12/7
     * @description 构建排序链表
     * @param docMainList
     * @return SortNode
     */
    public SortNode build(List<DocMainEntity> docMainList) {
        SortNode node = new SortNode();
        SortNode headNode = node;
        for (DocMainEntity docMain : docMainList) {
            if (node.docEntity == null) {
                node.docEntity = docMain;
                node.orderCode = docMain.getDocOrder();
                continue;
            }
            SortNode docNode = new SortNode(docMain);
            node.next = docNode;
            headNode.tail = docNode;
            node = node.next;
        }

        return headNode;
    }

    /**
     * @author zhenghf
     * @date 2022/12/7
     * @description 添加头节点
     * @param node
     * @param docEntity
     * @return SortNode
     */
    public void addHeader(SortNode node, DocMainEntity docEntity) {
        SortNode headNode = new SortNode(docEntity);
        headNode.next = node;
        node = headNode;
        updateNode(node);
    }

    /**
     * @author zhenghf
     * @date 2022/12/7
     * @description 添加尾节点
     * @param node
     * @param docEntity
     * @return SortNode
     */
    public void addTail(SortNode node, DocMainEntity docEntity) {
        SortNode newNode = new SortNode(docEntity);
        SortNode tempNode = node.tail;
        tempNode.next = newNode;
        node.tail = newNode;
        updateNode(node);
    }

    /**
     * @author zhenghf
     * @date 2022/12/7
     * @description 更新链表顺序字段
     * @param node
     */
    public void updateNode(SortNode node) {
        BigDecimal index = BigDecimal.ZERO;
        do {
            node.orderCode = index;
            index = index.add(BigDecimal.ONE);
            node = node.next;
        } while (node != null);

    }

    public BigDecimal getOrderCode() {
        return orderCode;
    }

    public DocMainEntity getDocEntity() {
        return docEntity;
    }

    public SortNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "orderCode=" + orderCode +
                ", docEntity=" + docEntity +
                ", next=" + next +
                ", tail=" + tail +
                '}';
    }
}
