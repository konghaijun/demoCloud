package org.springblade.demo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springblade.core.mp.base.BaseEntity;

import java.io.Serial;
import java.io.Serializable;

import java.util.Date;

/**
 * 会议实体类
 *
 * @author Your Name
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Schema(description = "Meeting对象")
public class Meeting extends BaseEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@Schema(description = "主键ID")
	private Long id;

	/**
	 * 创建人
	 */
	@Schema(description = "创建人")
	private Long createUser;

	/**
	 * 创建部门
	 */
	@Schema(description = "创建部门")
	private Long createDept;

	/**
	 * 创建时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
	@Schema(description = "创建时间")
	private Date createTime;

	/**
	 * 修改人
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
	@Schema(description = "修改人")
	private Long updateUser;

	/**
	 * 修改时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
	@Schema(description = "修改时间")
	private Date updateTime;

	/**
	 * 会议状态 (0 草稿箱（保存）1 未开始 2. 进行中 3. 逾期 4. 结束)
	 */
	@Schema(description = "会议状态 (0 草稿箱（保存）1 未开始 2. 进行中 3. 逾期 4. 结束)")
	private Integer status;

	/**
	 * 是否已删除
	 */
	@Schema(description = "是否已删除")
	private Integer isDeleted;

	/**
	 * 租户id
	 */
	@Schema(description = "租户id")
	private String tenantId;

	/**
	 * 会议主题，必填项
	 */
	@Schema(description = "会议主题，必填项")
	private String title;

	/**
	 * 会议附件
	 */
	@Schema(description = "会议附件")
	private String attach;

	/**
	 * 会议计划开始时间，必填项，精确到分
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
	@Schema(description = "会议计划开始时间，必填项，精确到分")
	private Date mstartTime;

	/**
	 * 会议计划结束时间，必填项，精确到分
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
	@Schema(description = "会议计划结束时间，必填项，精确到分")
	private Date medTime;

	/**
	 * 会议地点，必填项
	 */
	@Schema(description = "会议地点，必填项")
	private String maddress;

	/**
	 * 联系人，必填项
	 */
	@Schema(description = "联系人，必填项")
	private String contacter;

	/**
	 * 联系方式，必填项
	 */
	@Schema(description = "联系方式，必填项")
	private String contactWay;

	/**
	 * 会议议程限制200字符以内 富文本编辑框
	 */
	@Schema(description = "会议议程限制200字符以内 富文本编辑框")
	private String remark;

	// 无参构造函数
	public Meeting() {
	}

}
