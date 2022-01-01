package models;

public class Node
{
	private Node next;
	private double distance;
	private double restTime;
	
	public Node(double distance,double restTime)
	{
		this.distance = distance;
		this.restTime = restTime;
	}
	
	public void setNext(Node node)
	{
		this.next = node;
	}
	public Node getNext()
	{
		return this.next;
	}
	public double getRestTime()
	{
		return this.restTime;
	}
	public double jump(double meters)
	{
		meters = meters - distance;
		return meters;
	}
}