package com.wen.service.impl;

import com.wen.dao.ItemsDao;
import com.wen.domain.Items;
import com.wen.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {

        return itemsDao.findById(id);
    }
}
