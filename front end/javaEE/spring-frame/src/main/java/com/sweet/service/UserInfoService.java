package com.sweet.service;

import com.sweet.dao.UserInfoDAO;
import com.sweet.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:sweet
 * Created:2019/5/18
 */

@Service//代表的是spring管理的Service
public class UserInfoService {

    @Autowired//代表spring的IOC（控制反转，依赖注入）
    private UserInfoDAO userInfoDAO;
    public List<UserInfo> queryUseryInfo(){



        return userInfoDAO.queryUserInfo();
    }
}
