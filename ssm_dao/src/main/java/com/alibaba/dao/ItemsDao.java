package com.alibaba.dao;



import com.alibaba.pojo.Items;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/17 17:11
 */
public interface ItemsDao {
     List<Items> findAll();
    int  save(Items items);
}
