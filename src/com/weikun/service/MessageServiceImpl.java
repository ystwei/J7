package com.weikun.service;

import com.weikun.dao.IMessageDAO;
import com.weikun.dao.MessageDAOImpl;
import com.weikun.vo.Message1;

import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
public class MessageServiceImpl implements IMessageService {

    private IMessageDAO dao=new MessageDAOImpl();
    @Override
    public boolean addMessage(Message1 m) {


        return dao.addMessage(m);
    }

    @Override
    public List<Message1> queryMessage() {
        return dao.queryMessage();
    }
}
