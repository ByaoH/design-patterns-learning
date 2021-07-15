package com.byaoh.node.impl;

import com.byaoh.node.Node;
import com.byaoh.visitor.Visitor;

/**
 * F
 *
 * @author luliangyu
 * @date 2021-07-15 16:36
 */
public class Factory implements Node {
	@Override
	public String getName() {
		return "Factory";
	}

	@Override
	public String getDescription() {
		return "Factory";
	}

	@Override
	public void accpet(Visitor visitor) {
		visitor.visit(this);
	}
}
