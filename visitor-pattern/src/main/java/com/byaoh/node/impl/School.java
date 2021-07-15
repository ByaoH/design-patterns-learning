package com.byaoh.node.impl;

import com.byaoh.node.Node;
import com.byaoh.visitor.Visitor;

/**
 * School
 *
 * @author luliangyu
 * @date 2021-07-15 16:37
 */
public class School implements Node {
	@Override
	public String getName() {
		return "School";
	}

	@Override
	public String getDescription() {
		return "School";
	}

	@Override
	public void accpet(Visitor visitor) {
		visitor.visit(this);
	}
}
