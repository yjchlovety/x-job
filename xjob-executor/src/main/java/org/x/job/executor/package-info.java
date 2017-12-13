package org.x.job.executor;

/**
 * 执行器部分
 * 执行内部分
 * eletion         选举
 * master          master操作入口
 * pipeline        执行器通道
 * receive         接收层
 * send            发送层
 *
 * **************************************
 * election 选举
 * 作用：用于得到一批机器中的master。
 * **************************************
 * master 主机
 * 职责：负责分发任务，
 *      执行自身任务及执行从机任务，
 *      收集与发送监控信息，执行信息，
 *      转嫁或挂载执行失败节点任务，
 *      收集各从节点状态。
 * 作用：调度器与执行器交互的唯一节点
 * **************************************
 * pipeline 执行通道
 * 说明：当一个任务进入执行器领域，就相当于进入执行器通道。
 *      当这个任务结束，才算离开执行器。
 *      剩下的，所有在执行器中操作的步骤，均为执行器节点。
 * 作用：控制任务在执行器中的节奏。
 * **************************************
 * receive 接收层
 * 作用：调度器与执行器的单向入口。
 *       master与slave的交互层。
 * **************************************
 * send 发送层
 * 作用：master与slave的交互层。
 * **************************************
 */