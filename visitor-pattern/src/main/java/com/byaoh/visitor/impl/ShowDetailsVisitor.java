package com.byaoh.visitor.impl;

import com.byaoh.node.Node;
import com.byaoh.node.impl.Building;
import com.byaoh.node.impl.Factory;
import com.byaoh.node.impl.School;
import com.byaoh.visitor.Visitor;

/**
 * ShowDetailsVisitor
 *
 * @author luliangyu
 * @date 2021-07-15 16:58
 */
public class ShowDetailsVisitor implements Visitor {
	@Override
	public void visit(Node node) {
		System.err.println("show details node");
	}

	@Override
	public void visit(Building building) {
		System.err.println("show details building");
	}

	@Override
	public void visit(Factory factory) {
		System.err.println("show details factory");
	}

	@Override
	public void visit(School school) {
		System.err.println("show details school");
	}
}
