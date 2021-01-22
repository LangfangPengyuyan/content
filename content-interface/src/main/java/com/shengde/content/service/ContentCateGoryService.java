package com.shengde.content.service;

import com.shengde.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * 内容分类
 */
public interface ContentCateGoryService {

    List<EasyUITreeNode> getContentCatList(int parentId);


}
