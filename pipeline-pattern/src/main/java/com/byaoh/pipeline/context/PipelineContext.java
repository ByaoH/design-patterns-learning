package com.byaoh.pipeline.context;

import java.time.LocalDateTime;

/**
 * 传输到管道的上下文
 *
 * @author luliangyu
 * @date 2021-07-15 17:12
 */
public interface PipelineContext {

	/**
	 * 处理开始时间
	 *
	 * @return 开始时间
	 */
	LocalDateTime getStartTime();

	/**
	 * 处理结束时间
	 *
	 * @return 结束时间
	 */
	LocalDateTime getEndTime();

	/**
	 * 获取数据名称
	 *
	 * @return 数据名称
	 */
	abstract String getName();

}