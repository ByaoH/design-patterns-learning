package com.byaoh;

import com.byaoh.node.Node;
import com.byaoh.node.impl.Factory;
import com.byaoh.visitor.impl.DrawVisitor;

/**
 * Main
 *
 * @author luliangyu
 * @date 2021-07-15 16:38
 */
public class Main {
	public static void main(String[] args) {
		DrawVisitor drawVisitor = new DrawVisitor();
		Node node = new Factory();
		node.accpet(drawVisitor);
	}
}
