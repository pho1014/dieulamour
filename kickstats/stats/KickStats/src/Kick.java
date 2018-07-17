public class Kick {

	Action mAction;
	Boolean mContact;
	int mScore;
	
	public static void main(String[] args) 
	{
		
		Kick k = new Kick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 5);
		System.out.println(k.toString());
	}
	
	public Kick(Action action, Boolean contact) 
	{
		mAction = action;
		mContact = contact;
	}
	
	public Kick(Action action, Boolean contact, int score) 
	{
		mAction = action;
		mContact = contact;
		mScore = score;
	}
	
	public Action getmAction() {
		return mAction;
	}
	public void setmAction(Action mAction) {
		this.mAction = mAction;
	}
	public String getmContact() {
		String hit = " ";
		if(mContact == true) 
		{
			hit = "HIT";
		}
		else 
		{
			hit = "MISS";
		}
		return hit;
	}
	public void setmContact(Boolean mContact) {
		this.mContact = mContact;
	}
	public int getmScore() {
		return mScore;
	}
	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
	
	@Override
	public String toString() {
		return getmAction() + ", " + getmContact() + ", " + getmScore() + " points";
	}
	
	
	
	
	
}
