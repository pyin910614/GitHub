
public class Deadlock
{
	static Object Lock1 = new Object();
	static int i = 0;

	public static void main(String[] args) throws InterruptedException
	{

		for (i = 1; i < 10; i++)
		{

			process1();
			process2();
			process3();
			process4();
		}

	}

	public static void process1() throws InterruptedException
	{
		long end = 10000;
		long ran = (i - 1) * 3000;
		long left = end - ran;

		if (left > 0)
		{

			System.out.println("p1: Holding lock...");

			if (left < 3000 && left > 0)
			{
				synchronized (Lock1)
				{
					Thread.sleep(end - ran);
				}
			} else
			{
				synchronized (Lock1)
				{
					Thread.sleep(3000);
				}
			}

			System.out.println("lock realsed");

		} else if (left < 0 && left > -3000)
		{
			System.out.println("p1 ran " + ((i - 1) * 3000 + left) + " seconds");
		}

	}

	public static void process2() throws InterruptedException
	{
		long end = 20000;
		long ran = (i - 1) * 3000;
		long left = end - ran;

		if (left > 0)
		{

			System.out.println("p2: Holding lock...");

			if (left < 3000 && left > 0)
			{
				synchronized (Lock1)
				{
					Thread.sleep(end - ran);
				}
			} else
			{
				synchronized (Lock1)
				{
					Thread.sleep(3000);
				}
			}

			System.out.println("lock realsed");

		} else if (left < 0 && left > -3000)
		{
			System.out.println("p2 ran " + ((i - 1) * 3000 + left) + " seconds");
		}
	}

	public static void process3() throws InterruptedException
	{
		long end = 19000;
		long ran = (i - 1) * 3000;
		long left = end - ran;

		if (left > 0)
		{

			System.out.println("p3: Holding lock...");

			if (left < 3000 && left > 0)
			{
				synchronized (Lock1)
				{
					Thread.sleep(end - ran);
				}
			} else
			{
				synchronized (Lock1)
				{
					Thread.sleep(3000);
				}
			}

			System.out.println("lock realsed");

		} else if (left < 0 && left > -3000)
		{
			System.out.println("p3 ran " + ((i - 1) * 3000 + left) + " seconds");
		}
	}
	
	public static void process4() throws InterruptedException
	{
		long end = 7000;
		long ran = (i - 1) * 3000;
		long left = end - ran;

		if (left > 0)
		{

			System.out.println("p4: Holding lock...");

			if (left < 3000 && left > 0)
			{
				synchronized (Lock1)
				{
					Thread.sleep(end - ran);
				}
			} else
			{
				synchronized (Lock1)
				{
					Thread.sleep(3000);
				}
			}

			System.out.println("lock realsed");

		} else if (left < 0 && left > -3000)
		{
			System.out.println("p4 ran " + ((i - 1) * 3000 + left) + " seconds");
		}
	}
}
