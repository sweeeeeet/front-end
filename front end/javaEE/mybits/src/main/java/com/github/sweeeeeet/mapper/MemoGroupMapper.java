package com.github.sweeeeeet.mapper;

import com.github.sweeeeeet.entity.MemoGroup;
import org.apache.ibatis.annotations.Select;

/**
 * Author:sweet
 * Created:2019/5/10

 */

public interface MemoGroupMapper {
    @Select("insert into")
    int insertMemoGroup(MemoGroup memoGroup);
}
