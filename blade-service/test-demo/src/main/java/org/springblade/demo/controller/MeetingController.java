package org.springblade.demo.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springblade.demo.entity.Meeting;
import org.springblade.demo.service.IMeetingService;
import org.springblade.core.tool.api.R;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 会议控制器
 *
 * @author YourName
 */
@RestController
@AllArgsConstructor
@RequestMapping("meeting")
@Tag(name = "会议接口", description = "会议相关操作")
public class MeetingController {

	private final IMeetingService meetingService;

	/**
	 * 查询所有会议
	 */
	@GetMapping("/all")
	@Operation(summary = "查询所有会议", description = "查询所有未删除的会议")
	public R<List<Meeting>> getAllMeetings() {
		List<Meeting> meetings = meetingService.getAllMeetings();
		return R.data(meetings);
	}



	/**
	 * 新增会议
	 */
	@PostMapping("/add")
	@Operation(summary = "新增会议", description = "新增一条会议记录")
	public R<Void> addMeeting(@RequestBody Meeting meeting) {
		meetingService.addMeeting(meeting);
		return R.success("会议添加成功");
	}

	/**
	 * 更新会议
	 */
	@PostMapping("/update")
	@Operation(summary = "更新会议", description = "更新会议记录")
	public R<Void> updateMeeting(@RequestBody Meeting meeting) {
		meetingService.updateMeeting(meeting);
		return R.success("会议更新成功");
	}

	/**
	 * 删除会议
	 */
	@PostMapping("/{id}")
	@Operation(summary = "删除会议", description = "删除会议记录")
	public R<Void> deleteMeeting(@Parameter(description = "会议ID") @PathVariable Long id) {
		meetingService.deleteMeeting(id);
		return R.success("会议删除成功");
	}



}
