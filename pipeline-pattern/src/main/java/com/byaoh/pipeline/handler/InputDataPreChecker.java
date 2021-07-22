package com.byaoh.pipeline.handler;

import com.byaoh.pipeline.context.InstanceBuildContext;

import java.util.Map;

/**
 * 处理器 - 输入数据校验
 *
 * @author luliangyu
 * @date 2021-07-21 17:15
 */
public class InputDataPreChecker implements ContextHandler<InstanceBuildContext> {
	@Override
	public boolean handler(InstanceBuildContext context) {
		System.err.println("---输入参数校验---");
		Map<String, Object> formInput = context.getFormInput();
		if (formInput == null || formInput.isEmpty()) {
			context.setErrorMsg("表单不能为空");
			return false;
		}
		Object name = formInput.get("name");
		if (name == null) {
			context.setErrorMsg("名字为必填项");
			return false;
		}
		return true;
	}
}
