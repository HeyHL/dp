package io.hel.state;

import java.util.Random;

/**
 * author: hel
 * date: 2021/1/10 10:43
 * description:状态模式
 * 角色：使用环境
 */
public class Activity {
    /**
     * 奖品数量
     */
    private int prizeCount;
    /**
     * 当前状态
     */
    private ActivityState currentState;
    /**
     * 整个活动只会在这几种状态之间流转
     */
    private ActivityState initialState = new InitialState(this);
    private ActivityState canDrawState = new CanDrawState(this);
    private ActivityState winningState = new WinningState(this);
    private ActivityState endState = new EndState(this);

    /**
     * 声明各个状态中的特定方法
     */
    private interface ActivityState {
        /**
         * 扣减积分
         */
        void deductPoints();

        /**
         * 判断是否可以抽奖
         * @return 可以抽奖返回true
         */
        boolean canDraw();

        /**
         * 领取奖品
         */
        void drawPrize();
    }
    // 可以不做这一层
    private abstract class BaseState implements ActivityState {
        Activity activity;

        BaseState(Activity activity) {
            this.activity = activity;
        }

        @Override
        public void deductPoints() {

        }

        @Override
        public boolean canDraw() {
            return false;
        }

        @Override
        public void drawPrize() {

        }
    }

    /**
     * 具体状态角色，根据此状态选择性重写
     */
    private class InitialState extends BaseState {
        InitialState(Activity activity) {
            super(activity);
        }

        @Override
        public void deductPoints() {
            if (activity.currentState instanceof InitialState)
                if ("success".equalsIgnoreCase("success")) {
                    System.out.println("50 points deducted");
                    // 状态流转
                    activity.currentState = activity.canDrawState;
                } else {
                    System.out.println("Points deduction failed");
                    activity.currentState = activity.endState;
                }
            else
                throw new RuntimeException("illegal state");
        }

    }
    private class CanDrawState extends BaseState {
        CanDrawState(Activity activity) {
            super(activity);
        }

        @Override
        public boolean canDraw() {
            Random random = new Random();
            int i = random.nextInt(10);
            if (i == 0) {
                System.out.println("Good luck, won the prize");
                activity.currentState = activity.winningState;
                return true;
            } else {
                System.out.println("Unfortunately, failed to win");
                activity.currentState = activity.initialState;
                return false;
            }
        }

    }
    private class WinningState extends BaseState {

        WinningState(Activity activity) {
            super(activity);
        }

        @Override
        public void drawPrize() {
            if (activity.getPrizeCount() > 0) {
                System.out.println("Claim your prize");
                activity.currentState = activity.initialState;
            } else {
                System.out.println("The prize has been received and the event is over");
                activity.currentState = activity.endState;
            }
        }
    }
    private class EndState extends BaseState {

        EndState(Activity activity) {
            super(activity);
        }
    }

    public Activity(int prizeCount) {
        this.prizeCount = prizeCount;
        this.currentState = initialState;
    }

    private int getPrizeCount() {
        return prizeCount--;
    }

    /**
     * 暴露给Client的
     */
    public void raffle() {
        if (currentState instanceof EndState)
            System.exit(0);
        currentState.deductPoints();
        if (currentState.canDraw())
            currentState.drawPrize();
    }

}
