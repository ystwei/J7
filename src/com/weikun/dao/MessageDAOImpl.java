package com.weikun.dao;

import com.weikun.db.DB;
import com.weikun.vo.Message1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
public class MessageDAOImpl implements IMessageDAO {


    @Override
    public boolean addMessage(Message1 m) {
        Connection conn= DB.getConnection();
        PreparedStatement pstmt=null;
        String sql="insert into message1(name,title,content,email,tzdate) values(?,?,?,?,now())";
        boolean flag=false;
        try {
            pstmt=conn.prepareStatement(sql);

            pstmt.setString(1,m.getName());
            pstmt.setString(2,m.getTitle());
            pstmt.setString(3,m.getContent());
            pstmt.setString(4,m.getEmail());
            flag=pstmt.executeUpdate()>0;


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                }
            }
            DB.closeConnection(conn);
        }
        return flag;

    }

    @Override
    public List<Message1> queryMessage() {
        Connection conn= DB.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String sql="select * from message1 order by id  desc";
        List<Message1> list=new ArrayList<>();
        try {
            pstmt=conn.prepareStatement(sql);


            rs=pstmt.executeQuery();


            while(rs.next()){
                Message1 m=new Message1();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setEmail(rs.getString("email"));
                m.setTitle(rs.getString("title"));
                m.setContent(rs.getString("content"));
                m.setTzdate(rs.getString("tzdate"));
                list.add(m);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                }
            }
            DB.closeConnection(conn);
        }
        return list;
    }

    @Override
    public boolean delMessage(int id) {
        Connection conn= DB.getConnection();
        PreparedStatement pstmt=null;
        String sql="delete from message1 where id=?";
        boolean flag=false;
        try {
            pstmt=conn.prepareStatement(sql);

            pstmt.setInt(1,id);

            flag=pstmt.executeUpdate()>0;


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                }
            }
            DB.closeConnection(conn);
        }
        return flag;
    }
}
