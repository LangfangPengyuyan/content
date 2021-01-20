package com.shengde.content.service;

import com.shengde.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ContentCateGoryService {

    List<EasyUITreeNode> getContentCatList(int parentId);


}
