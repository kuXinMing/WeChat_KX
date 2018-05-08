package pattern;

import java.util.Scanner;

/**
 * 装饰者模式
 * 测试类
 * @author wanghao
 * @version C10 2018年5月8日
 * @since SDP V300R003C10
 */
public class DecoratorPatternDemo
{
    public static void main(String[] args)
    {
        Target decorator = new Decorator();
        System.out.println("不加装饰，添加删除结果为：_________");
        decorator.add();
        decorator.remove();
        System.out.println("不加装饰，结果结束________________");
        System.out.println("添加提醒装饰结果打印为：");
    }
}
/**
 *  被装饰者标识类
 * @author wanghao
 * @version C10 2018年5月8日
 * @since SDP V300R003C10
 */
interface Target{
    public void add () ;
    public void remove();
}
/**
 * 定义装饰者
 *
 * @author wanghao
 * @version C10 2018年5月8日
 * @since SDP V300R003C10
 */
class Messter implements Target{
    private Target target;
    
    Messter(Target target){
        this.target = target;
    }
    @Override
    public void add()
    {
        target.add();
    }
    @Override
    public void remove()
    {
        target.remove();
    }
}

//定义两种装饰模式
class Decorator_One extends Messter{

    Decorator_One(Target target)
    {
        super(target);
    }
    public void addMessage() {
        System.out.println("我添加了");
    }
    public void removeMessage() {
        System.out.println("我删除了");
    }
    @Override
    public void add()
    {
        addMessage();
        super.add();
        System.out.println("添加成功");
    }
    @Override
    public void remove()
    {
        removeMessage();
        super.remove();
        System.out.println("删除成功");
    }
}

class Decorator_Two extends Messter{
    Scanner sc = new Scanner(System.in);
    Decorator_Two(Target target)
    {
        super(target);
    }
    public boolean enterAdd() {
        boolean b = sc.nextBoolean();
        if(b) {
            System.out.println("你确认添加");
        }else {
            System.out.println("你取消添加");
        }
        return b;
    }
    public boolean enterRemove() {
        boolean b = sc.nextBoolean();
        if(b) {
            System.out.println("你确认删除");
        }else {
            System.out.println("你取消删除");
        }
        return b;
    }
    @Override
    public void add()
    {
        if(enterAdd())return;
        super.add();
        System.out.println("添加成功");
    }
    @Override
    public void remove()
    {
        if(enterRemove())return;
        super.remove();
        System.out.println("删除成功");
    }
}


/**
 * 定义被装饰者
 *
 * @author wanghao
 * @version C10 2018年5月8日
 * @since SDP V300R003C10
 */
class Decorator implements Target {
    @Override
    public void add()
    {
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.err.println("真正的添加操作，添加+1");
    }

    @Override
    public void remove()
    {
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.err.println("真正的删除操作，删除-1");
    }
    
}
