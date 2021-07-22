package com.byaoh.pipeline.handler;

import com.byaoh.pipeline.context.PipelineContext;

/**
 * 管道上下文处理器
 *
 * @author luliangyu
 * @date 2021-07-21 17:08
 */
public interface ContextHandler<T extends PipelineContext> {

	/**
	 * 处理上下文数据
	 *
	 * @param context 上下文数据
	 * @return 返回true 表示由下一个 处理器继续处理 false 表示结束
	 */
	boolean handler(T context);
}
