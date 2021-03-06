package shiyan8;

import java.util.Random;

public class LivingCast2 implements Cast {
	private double cast;

	public static void main(String[] args) {
		LivingCast2 livingCast = new LivingCast2();
		Parent p = new Parent(livingCast);
		Child c = new Child(livingCast);
		p.start();
		c.start();
	}

	@Override
	public void saveMoney() {
		while (true) {
			try {
				if (cast != 0.0) {
					System.out.println("账户有余额，不存钱");
					Thread.sleep(5000);
				}
				Random r = new Random();
				double var = r.nextInt(10000);
				cast += var;
				System.out.println("家长存入了" + var + "元。当前余额" + cast + "元");

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void takeMoney() {
		while (true) {
			try {
				Random r = new Random();
				if (cast == 0.0) {
					System.out.println("没钱了，通知家长");
					Thread.sleep(5000);
				}
				double var = r.nextInt(2000);
				if (var > cast)
					var = cast;
				cast -= var;
				System.out.println("学生取出了" + var + "元。当前余额" + cast + "元");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
