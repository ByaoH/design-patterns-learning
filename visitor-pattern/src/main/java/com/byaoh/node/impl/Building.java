package com.byaoh.node.impl;

import com.byaoh.node.Node;
import com.byaoh.visitor.Visitor;

/**
 * Building
 *
 * @author luliangyu
 * @date 2021-07-15 16:37
 */
public class Building implements Node {
	@Override
	public String getName() {
		return "Building";
	}

	@Override
	public String getDescription() {
		return "Building";
	}

	@Override
	public void accpet(Visitor visitor) {
		visitor.visit(this);
	}
}
