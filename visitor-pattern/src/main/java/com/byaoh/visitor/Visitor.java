package com.byaoh.visitor;

import com.byaoh.node.Node;
import com.byaoh.node.impl.Building;
import com.byaoh.node.impl.Factory;
import com.byaoh.node.impl.School;

/**
 * 为node接口准备的第二层路由
 *
 * @author luliangyu
 * @date 2021-07-15 16:44
 */
public interface Visitor {

	void visit(Node node);

	void visit(Building building);

	void visit(Factory factory);

	void visit(School school);
}
