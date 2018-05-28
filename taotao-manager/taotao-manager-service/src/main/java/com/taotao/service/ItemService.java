package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.util.pojo.EUDataGridResult;

import java.util.List;

public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
}
