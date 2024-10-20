package org.springblade.demo.service;

import org.springblade.core.mp.base.BaseService;
import org.springblade.demo.entity.Meeting;

import java.util.List;
import java.util.Map;

public interface IMeetingService extends BaseService<Meeting> {
	/**
	 * 查询所有会议
	 * @return 会议列表
	 */
	List<Meeting> getAllMeetings();



	/**
	 * 新增会议
	 * @param meeting 会议对象
	 */
	void addMeeting(Meeting meeting);

	/**
	 * 更新会议
	 * @param meeting 会议对象
	 */
	void updateMeeting(Meeting meeting);

	/**
	 * 删除会议
	 * @param id 会议ID
	 */
	void deleteMeeting(Long id);


}
