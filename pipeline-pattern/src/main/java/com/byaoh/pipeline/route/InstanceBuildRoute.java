package com.byaoh.pipeline.route;

import com.byaoh.pipeline.context.InstanceBuildContext;
import com.byaoh.pipeline.handler.ContextHandler;
import com.byaoh.pipeline.handler.InputDataPreChecker;
import com.byaoh.pipeline.handler.ModelInstanceCreator;
import com.byaoh.pipeline.handler.ModelInstanceSaver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 管道路由
 *
 * @author luliangyu
 * @date 2021-07-21 17:38
 */
@Component
public final class InstanceBuildRoute implements Route<InstanceBuildContext> {

	private List<ContextHandler<InstanceBuildContext>> handlers;

	private InstanceBuildRoute() {
		handlers = Arrays.asList(
			(context) -> {
				System.err.println("校验前置");
				return true;
			},
			new InputDataPreChecker(),
			new ModelInstanceCreator(),
			new ModelInstanceSaver()
		);
	}

	@Override
	public Collection<ContextHandler<InstanceBuildContext>> handlers() {
		return handlers;
	}

}
