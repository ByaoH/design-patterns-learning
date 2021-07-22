package com.byaoh.pipeline.handler;

import com.byaoh.pipeline.context.InstanceBuildContext;

/**
 * 处理器 - 根据输入创建模型实例
 *
 * @author luliangyu
 * @date 2021-07-21 17:31
 */
public class ModelInstanceCreator implements ContextHandler<InstanceBuildContext> {
	@Override
	public boolean handler(InstanceBuildContext context) {
		System.err.println("创建模型实例");
		return true;
	}
}
