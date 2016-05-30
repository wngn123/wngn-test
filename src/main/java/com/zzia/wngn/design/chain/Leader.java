package com.zzia.wngn.design.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 领导
 * @date 2016/5/30 10:48
 * @email wanggang@vfou.com
 * @descripe <p>
 * 意图：<br>
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * <p>
 * 优点<br>
 * 1、降低耦合度。它将请求的发送者和接受者解耦。<br>
 * 2、简化了对象。使得对象不需要知道链的结构。<br>
 * 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。<br>
 * 4、增加新的请求处理类很方便。<br>
 * <p>
 * 缺点<br>
 * 1、不能保证请求一定被接收。<br>
 * 2、系统性能将受到一定影响，而且在进行代码调试时不太方便；可能会造成循环调用。<br>
 * 3、可能不容易观察运行时的特征，有碍于除错。<br>
 * <p>
 * 模式适用场景<br>
 * 1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。<br>
 * 2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。<br>
 * 3、可动态指定一组对象处理请求。<br>
 * <p>
 * 总结<br>
 * 1、职责链模式将请求的发送者和接受者解耦了。客户端不需要知道请求处理者的明确信息，甚至不需要知道链的结构，
 * 它只需要将请求进行发送即可。<br>
 * 2、职责链模式能够非常方便的动态增加新职责或者删除职责。<br>
 * 3、客户端发送的请求可能会得不到处理。<br>
 * 4、处理者不需要知道链的结构，只需要明白他的后续者是谁就可以了。这样就简化了系统中的对象。<br>
 */
public abstract class Leader {

    private static Logger logger = LoggerFactory.getLogger(Leader.class);
    /**
     * 辅导员签字的请假天数 < [1,2]
     */
    protected final static int INSTRUCTOR_DAY = 3;
    /**
     * 系主任签字的请假天数 <  [3,5]
     */
    protected final static int DEPAETMENTOR_DAY = 6;
    /**
     * 院长签字的请假天数 < [6,10]
     */
    protected final static int DEANOR_DAY = 11;
    /**
     * 校长签字的请假天数 < [11-15]
     */
    protected final static int PRESIDENTOR_DAY = 16;


    /**
     * 姓名
     **/
    public String name;

    /**
     * 审批限制天数
     */
    public int limit;
    /**
     * 后继者
     **/
    protected Leader successor;

    /**
     * 前驱者
     **/
    protected Leader precursor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public Leader getSuccessor() {
        return successor;
    }

    public Leader getPrecursor() {
        return precursor;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setPrecursor(Leader precursor) {
        this.precursor = precursor;
    }

    /**
     * 处理请假
     *
     * @param LeaveNode 请假条
     */
    public void handleLeave(LeaveNode leaveNode) {
        int precursorLimit = 0;
        if (getPrecursor() != null) {
            precursorLimit = getPrecursor().getLimit();
        }
        if (leaveNode.getNumber() < getLimit() && leaveNode.getNumber() >= precursorLimit) {
            logger.info("{}[{}]审批 {} 同学的请假条,请假天数为{}天。", getDescription(), this.name, leaveNode.getStudent(), leaveNode.getNumber());
        } else {     //否则传递给系主任
            if (this.successor != null) {
                this.successor.handleLeave(leaveNode);
            } else {
                logger.info("{}同学的请假超过15天，不能通过审批！", leaveNode.getStudent());
            }
        }
    }

    public abstract String getDescription();

}
