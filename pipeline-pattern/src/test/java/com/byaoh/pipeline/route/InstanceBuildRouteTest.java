package com.byaoh.pipeline.route;

import com.byaoh.pipeline.context.InstanceBuildContext;
import com.byaoh.pipeline.handler.ContextHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;

@SpringBootTest
class InstanceBuildRouteTest {
	@Autowired
	private Route<InstanceBuildContext> route;

	@Test
	void handlers() {
		Collection<ContextHandler<InstanceBuildContext>> handlers = route.handlers();
		InstanceBuildContext context = new InstanceBuildContext();
		HashMap<String, Object> map = new HashMap<>();
		context.setFormInput(map);
		map.put("sss", "xxx");
		map.put("name", "sss");
		boolean flag;
		context.setStartTime(LocalDateTime.now());
		for (ContextHandler<InstanceBuildContext> h : handlers) {
			flag = h.handler(context);
			if (flag == false) {
				System.err.println(context.getErrorMsg());
				break;
			}
		}
		context.setEndTime(LocalDateTime.now());
		System.out.println(context);
	}
}