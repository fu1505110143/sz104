package com.alibaba.service.impl;

import com.alibaba.dao.ItemsDao;
import com.alibaba.pojo.Items;
import com.alibaba.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/17 17:27
 */
@Service
public class ItemServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll() {

        return itemsDao.findAll ();
    }

    @Override
    public int save(Items items) {
        return itemsDao.save (items);
    }
}
