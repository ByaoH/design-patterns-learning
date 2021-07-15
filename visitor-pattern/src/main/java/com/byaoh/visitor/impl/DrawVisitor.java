package com.byaoh.visitor.impl;

import com.byaoh.node.Node;
import com.byaoh.node.impl.Building;
import com.byaoh.node.impl.Factory;
import com.byaoh.node.impl.School;
import com.byaoh.visitor.Visitor;

/**
 * DrawVisitor
 *
 * @author luliangyu
 * @date 2021-07-15 16:46
 */
public class DrawVisitor implements Visitor {
	@Override
	public void visit(Node node) {
		System.err.println("draw node");
	}

	@Override
	public void visit(Building building) {
		System.err.println("draw Building");
	}

	@Override
	public void visit(Factory factory) {
		System.err.println("draw Factory");
	}

	@Override
	public void visit(School school) {
		System.err.println("draw School");
	}
}
