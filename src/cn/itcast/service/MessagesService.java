package cn.itcast.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.entity.Messages;
@Transactional
public interface MessagesService {
     void save(Messages messages);
     List<Messages> findall();
     List<Messages> findByusername(String username);
     void delById(Integer mid);
     void update(Messages messages);
     List<Messages> findByid(Integer mid);
    
}
