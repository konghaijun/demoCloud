package org.springblade.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springblade.demo.entity.Meeting;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 会议映射器接口
 */
@Mapper
public interface MeetingMapper  extends BaseMapper<Meeting> {

	/**
	 * 查询所有会议
	 * @return 会议列表
	 */
	List<Meeting> selectAllMeetings();


	/**
	 * 新增会议
	 * @param meeting 会议对象
	 */
	void insertMeeting(Meeting meeting);

	/**
	 * 更新会议
	 * @param meeting 会议对象
	 */
	void updateMeeting(Meeting meeting);

	/**
	 * 删除会议
	 * @param id 会议ID
	 */
	void deleteMeeting(@Param("id") Long id);


}
