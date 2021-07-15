package com.byaoh.node;

import com.byaoh.visitor.Visitor;

/**
 * Node
 *
 * @author luliangyu
 * @date 2021-07-15 16:34
 */
public interface Node {
	/**
	 * 名称
	 *
	 * @return 返回节点名称
	 */
	String getName();

	/**
	 * 返回节点描述
	 *
	 * @return 描述信息
	 */
	String getDescription();

	void accpet(Visitor visitor);
}
