package com.weikun.service;

import com.weikun.vo.Message1;

import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
public interface IMessageService {

    public boolean addMessage(Message1 m);
    public List<Message1> queryMessage() ;
    public boolean delMessage(int id) ;
}
