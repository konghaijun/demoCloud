package org.springblade.demo.service.impl;

import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.demo.entity.Meeting;
import org.springblade.demo.mapper.MeetingMapper;
import org.springblade.demo.service.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MeetingServiceImpl extends BaseServiceImpl<MeetingMapper, Meeting> implements IMeetingService {


	@Autowired
	private MeetingMapper meetingMapper;

	public List<Meeting> getAllMeetings() {
		return meetingMapper.selectAllMeetings();
	}


	public void addMeeting(Meeting meeting) {
		meetingMapper.insertMeeting(meeting);
	}

	public void updateMeeting(Meeting meeting) {
		meetingMapper.updateMeeting(meeting);
	}

	public void deleteMeeting(Long id) {
		meetingMapper.deleteMeeting(id);
	}


}
