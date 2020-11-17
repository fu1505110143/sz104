package com.alibaba.service;



import com.alibaba.pojo.Items;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/17 17:26
 */
public interface ItemsService {
    List<Items> findAll();
    int save(Items items);
}
