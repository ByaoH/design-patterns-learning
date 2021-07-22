package com.byaoh.pipeline.route;

import com.byaoh.pipeline.context.PipelineContext;
import com.byaoh.pipeline.handler.ContextHandler;

import java.util.Collection;

/**
 * Route
 *
 * @author luliangyu
 * @date 2021-07-22 09:38
 */
public interface Route<T extends PipelineContext> {
	/**
	 * 获得对应的处理器
	 *
	 * @return 处理器集合
	 */
	Collection<ContextHandler<T>> handlers();
}
