package com.byaoh.pipeline.handler;

import com.byaoh.pipeline.context.InstanceBuildContext;

/**
 * 处理器 - 保存模型实例到相关DB表
 *
 * @author luliangyu
 * @date 2021-07-21 17:33
 */
public class ModelInstanceSaver implements ContextHandler<InstanceBuildContext> {
	@Override
	public boolean handler(InstanceBuildContext context) {
		System.err.println("保存到数据库");
		return true;
	}
}
