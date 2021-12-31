public class Freddy
{
	public Node configure(double[] distances,double[] restTimes)
	{
		Node first = null;
		Node current = null;
		for(int i = 0; i < distances.length; i++)
		{
			if(i==0) 
			{
				first = new Node(distances[i],restTimes[i]);
				current = first;
				continue;
			}
			
			Node node = new Node(distances[i],restTimes[i]);
			current.setNext(node);
			current = node;

			if(i == (distances.length - 1))
			{
				current.setNext(first);
			}
			

			
		}
		return first;	
	}
	public void jump(Node first,double remainingMeters)
	{

		int steps = 0;
		double restTime = 0;

		Node current = first;

		while(remainingMeters > 0)
		{
			remainingMeters = current.jump(remainingMeters);

			if(remainingMeters > 0)
				restTime += current.getRestTime();
			steps++;

			//System.out.println(remainingMeters);
			
			current = current.getNext();
			
		}

		System.out.println("\nFreddy took " + steps + " steps to finish");
		System.out.println("Freddy took " + restTime + " seconds to finish");
	}
}