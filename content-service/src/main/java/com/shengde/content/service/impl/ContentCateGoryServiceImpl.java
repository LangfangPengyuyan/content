package com.shengde.content.service.impl;

import com.shengde.content.service.ContentCateGoryService;
import com.shengde.e3mall.common.pojo.EasyUITreeNode;
import com.shengde.e3mall.dao.TbContentCategoryDao;
import com.shengde.e3mall.entity.TbContentCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 内容分类管理
 */

@Service
public class ContentCateGoryServiceImpl implements ContentCateGoryService {

    @Autowired
    TbContentCategoryDao tbContentCategoryDao;

    @Override
    public List<EasyUITreeNode> getContentCatList(int parentId) {

        TbContentCategory tbContentCategory = new TbContentCategory();
        tbContentCategory.setParentId(parentId);
        //执行查询
        List<TbContentCategory> list =tbContentCategoryDao.queryAll(tbContentCategory);
        //转换成EasyUITreeNode的列表
        List<EasyUITreeNode> nodeList = new ArrayList<>();

        for (TbContentCategory ContentCategory : list) {

            EasyUITreeNode node = new EasyUITreeNode();

            node.setId(ContentCategory.getId());
            node.setText(ContentCategory.getName());
            node.setState((ContentCategory.getIsParent()?"closed":"open"));
            //添加到列表
            nodeList.add(node);
        }
        return nodeList;
    }
}
