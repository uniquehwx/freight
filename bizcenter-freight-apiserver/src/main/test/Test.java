import lombok.extern.slf4j.Slf4j;

/**
 * @author: hwx
 * @since: 1.0.0
 */

public class Test {
    // 动态规划？？

//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ n阶

    /**
     *  动态规划: f(n)=f(n-1)+f(n-2)
     *  f(1)=1     f(2)=1
     */
    public static void main(String[] args) {
        climbStairs(8);
    }


    public static int climbStairs(int n) {
        int f1=1,f2=1,fn = 0;
        for (int i = 2; i <=n ; i++) {
            fn=f1+f2;
            f1=fn;
        }
        return fn;
    }

}
