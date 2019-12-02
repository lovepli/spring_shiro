package com.example.demo.dao;

import com.example.demo.pojo.SysRole;

public interface SysRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    String findRoleByRoleId(int roleId);
}