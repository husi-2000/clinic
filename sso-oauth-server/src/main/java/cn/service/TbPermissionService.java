package cn.service;

import cn.entity.TbPermission;
import cn.mapper.TbPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbPermissionService {
    @Autowired
    private TbPermissionMapper permissionMapper;

    public List<TbPermission> getByUserid(Long userId){

        return permissionMapper.queryByUserid(userId);

    }
}
