public class RobotAdapter implements Spieler 
{
	Robot roboter;

	public RobotAdapter(Robot roboter) 
	{
		this.roboter = roboter;
	}

	public int geheNachLinks (int x) 
	{
		roboter.rolleNach(roboter.getX() - x, roboter.getY());
		return (int) roboter.getX();
	}

	public int geheNachRechts (int x) 
	{
		roboter.rolleNach(roboter.getX() + x, roboter.getY());
		return (int) roboter.getX();
	}

	public int geheNachOben (int y) 
	{
		roboter.rolleNach(roboter.getX(), roboter.getY() + y);
		return (int) roboter.getY();
	}

	public int geheNachUnten (int y) 
	{
		roboter.rolleNach(roboter.getX(), roboter.getY() - y);
		return (int) roboter.getY();
	}
}