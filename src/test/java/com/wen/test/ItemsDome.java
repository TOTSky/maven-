package com.wen.test;

import com.wen.dao.ItemsDao;
import com.wen.domain.Items;
import com.wen.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsDome {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao代理对象

        //dao测试
       /* ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
        Items byId = itemsDao.findById(1);

        System.out.println(byId);*/

        //service测试
        ItemsService bean = ac.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());
    }
}
