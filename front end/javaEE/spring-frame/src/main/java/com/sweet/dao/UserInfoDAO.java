package com.sweet.dao;

import com.sweet.vo.UserInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:sweet
 * Created:2019/5/18
 * CRUD Option(增删改查操作；持久层)
 */
public class UserInfoDAO {
    public List<UserInfo> queryUserInfo() {
        List<UserInfo> userInfos = new ArrayList<UserInfo>();
        for (int i = 0; i < 10; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setPassword("zz" + i);
            userInfo.setUserAge(i + 12);
            userInfo.setUserName("xx" + i);
            userInfos.add(userInfo);
        }
        return userInfos;
    }
}
