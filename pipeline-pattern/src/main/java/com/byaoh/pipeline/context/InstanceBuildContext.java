package com.byaoh.pipeline.context;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * 模型实例构建上下文
 *
 * @author luliangyu
 * @date 2021-07-21 17:14
 */
@Data
public class InstanceBuildContext implements PipelineContext {

	/**
	 * 模型 id
	 */
	private Long modelId;

	/**
	 * 用户 id
	 */
	private long userId;

	/**
	 * 表单输入
	 */
	private Map<String, Object> formInput;

	/**
	 * 保存模型实例完成后，记录下 id
	 */
	private Long instanceId;

	/**
	 * 模型创建出错时的错误信息
	 */
	private String errorMsg;

	/**
	 * 开始时间
	 */
	private LocalDateTime startTime;
	/**
	 * 结束时间
	 */
	private LocalDateTime endTime;

	@Override
	public String getName() {
		return "模型实例构建上下文";
	}
}
