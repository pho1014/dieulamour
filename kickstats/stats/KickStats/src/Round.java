import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Collections;



public class Round {
	private ArrayList<Kick> mKicks = new ArrayList<Kick>();
	private int mRoundNumber;
	private String mFightID;
	private DecimalFormat df = new DecimalFormat("####0.00");
	private ArrayList<Integer> kickScoreArray;
	private ArrayList<Integer> kickAmountArray;
	private ArrayList<Action.Tech> kickTechArray;
	private ArrayList<Kick> calculatedKickArray;
	
	public static void main(String args[]) {
		Round r = new Round();
		
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 5);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 4);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 3);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 2);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BLCu, Action.Agg.ATTACK), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.RIGHT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.COUNTER), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.RIGHT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.COUNTER), true, 10);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BL, Action.Agg.ATTACK), false);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.BK, Action.Agg.ATTACK), true, 1);
		r.addKick(new Action(Action.Move.OTS, Action.Side.LEFT, Action.Area.HEAD, Action.Tech.RA, Action.Agg.ATTACK), true, 20);
		
		
		
		r.printAllKicks();
		System.out.println(" ");
	
		
		r.getRoundStats();
		r.getKickStats();
		
		r.getMostDominantKick();
		r.getHighestScoringKick();
		
		r.getAggressionStats();
		
		
		
		
		
		
	}
	
	private void getAggressionStats() 
	{
		int atkScore = 0;
		int counterScore = 0;
		int atkAmount = 0;
		int counterAmount = 0;
		int atkHitAmount = 0;
		int atkMissAmount = 0;
		int counterHitAmount = 0;
		int counterMissAmount = 0;
		
		String atkPercent = " ";
		String counterPercent = " ";
		String atkScorePercent = " ";
		String counterScorePercent = " ";
		String atkHitPercent = " ";
		String counterHitPercent = " ";
		
		for(Kick kicks: getmKicks()) 
		{
			if(kicks.mAction.getmAggression().equals(Action.Agg.ATTACK)) 
			{
				atkAmount++;
				atkScore = atkScore + kicks.getmScore();
				if(kicks.getmContact().equals("HIT")) 
				{
					atkHitAmount++;
				}
				else if(kicks.getmContact().equals("MISS")) 
				{
					atkMissAmount++;
				}
			}
			else if(kicks.mAction.getmAggression().equals(Action.Agg.COUNTER))
			{
				counterAmount++;
				counterScore = counterScore + kicks.getmScore();
				if(kicks.getmContact().equals("HIT")) 
				{
					counterHitAmount++;
				}
				else if(kicks.getmContact().equals("MISS")) 
				{
					counterMissAmount++;
				}
			}
		}
		
		atkPercent = df.format((atkAmount/(double)this.getmKicks().size())*100) + "%";
		counterPercent = df.format((counterAmount/(double)this.getmKicks().size())*100) + "%";
		atkScorePercent = df.format((atkScore/(double)this.getRoundScore())*100) + "%";
		counterScorePercent = df.format((counterScore/(double)this.getRoundScore())*100) + " ";
		atkHitPercent = df.format((atkHitAmount/(double)atkAmount)*100) + "%";
		counterHitPercent = df.format((counterHitAmount/(double)counterAmount)*100) + "%";
		
		
		System.out.println("Number of Attacks: " + atkAmount);
		System.out.println("Score of Attacks: " + atkScore);
		System.out.println("Number of Counters: " + counterAmount);
		System.out.println("Score of Counters: " + counterScore);
		System.out.println("Percentage of Attacks: " + atkPercent);
		System.out.println("Percentage of Counters: " + counterPercent);
		System.out.println("Percentage of Score by Attacks: " + atkScorePercent);
		System.out.println("Percentage of Score by Counters: " + counterScorePercent);
		System.out.println("Number of Attacks hit: " + atkHitAmount + " out of " + atkAmount + " at " + atkHitPercent);
		System.out.println("Number of Counters hit: " + counterHitAmount + " out of " + counterAmount + " at " + counterHitPercent);
		
	}

	private void getKickStatsByTech(Action.Tech t) 
	{
		System.out.println("Number of " + Action.getKickName(t) + ": " + getKickCountByTech(t));
		System.out.println("Percentage of " + Action.getKickName(t) + " out of total kicks: " + getKickPercentageByTech(t));
		System.out.println("Points scored by " + Action.getKickName(t) + ": " + getKickScoreByTech(t));
	}
	
	
	public int getKickScoreByTech(Action.Tech tech) {
		int score = 0;
		for(Kick kick:this.getmKicks()) {
			if(kick.getmAction().getmTechnique().equals(tech)) {
				score = score + kick.getmScore();
			}
		}
		return score;
	}
	
	private void getRoundStats() 
	{
		System.out.println("Total number of kicks: " + getTotalKickCount());
		System.out.println("Number of kicks landed: " + getContactedKickCount());
		System.out.println("Percentage of kicks landed: " + getContactedKickPercentage());
		System.out.println("Score this round: " + getRoundScore());
		System.out.println(" ");
	}

	

	

	private void printAllKicks() 
	{
		for(int i = 0; i < getmKicks().size(); i++)
		{
			System.out.println(i+1 + " - " + getmKicks().get(i).toString());
		}
	}
	
	public void addKick(Action action, Boolean hit, int pts) {
		Kick k = new Kick(action, hit, pts);
		getmKicks().add(k);
	}
	
	public void addKick(Action action, Boolean hit) {
		Kick k = new Kick(action, false, 0);
		getmKicks().add(k);
	}
	
	public int getKickCountByTech(Action.Tech tech) {
		int count = 0;
		for(Kick kick:this.getmKicks()) {
			if(kick.getmAction().getmTechnique().equals(tech)) {
				count++;
			}
		}
		return count;
	}
	
	public int getContactedKickCount() {
		int count = 0;
		for(Kick kick:this.getmKicks()) {
			if(kick.getmContact().equals("HIT")) {
				count++;
			}
		}
		return count;
	}
	
	public int getTotalKickCount() 
	{
		return getmKicks().size();
	}
	
	public String getContactedKickPercentage() {
		String percent = df.format((this.getContactedKickCount()/(double)this.getmKicks().size())*100);
		return percent + "%";
	}
	
	public String getKickPercentageByTech(Action.Tech tech) {
		String percent = df.format((getKickCountByTech(tech)/(double)this.getmKicks().size())*100);
		return percent + "%";
	}
	
	public int getRoundScore() {
		int score = 0;
		for(int i = 0; i < this.getmKicks().size(); i++) {
			score = score + this.getmKicks().get(i).getmScore();
		}
		return score;
	}
	
	
		
		
	
	public void populateArrays()
	{
		ArrayList<Boolean> isRemovedList = new ArrayList<Boolean>();
		calculatedKickArray = new ArrayList<Kick>();
		kickScoreArray = new ArrayList<Integer>();
		kickAmountArray = new ArrayList<Integer>();
		kickTechArray = new ArrayList<Action.Tech>();
		
		int score = 0;
		int count = 1;
		
		for(Kick kick: this.getmKicks()) 
		{
			isRemovedList.add(false);
		}
		
		for(int i = 0; i < getmKicks().size(); i++) 
		{
			if(isRemovedList.get(i)==false) 
			{
				Kick kick1 = getmKicks().get(i);
				isRemovedList.set(i, true);
				score = getmKicks().get(i).getmScore();
				kickTechArray.add(kick1.getmAction().getmTechnique());
					
				for(int j = i+1; j < getmKicks().size(); j++) 
				{
					Kick kick2 = getmKicks().get(j);
					if(kick1.getmAction().toString().equals(kick2.getmAction().toString()) && (isRemovedList.get(j)==false)) 
					{
						isRemovedList.set(j, true);
						score = score + kick2.getmScore();
						count++;
					}
				}
				calculatedKickArray.add(kick1);
				kickScoreArray.add(score);
				score = 0;
				kickAmountArray.add(count);
				count = 1;
			}
		}
	}
		
	public ArrayList<Kick> getmKicks() {
		return this.mKicks;
	}
	
		
		
		
	public void getKickStats() 
	{
		populateArrays();
		
		for(Action.Tech t: kickTechArray) 
		{
			getKickStatsByTech(t);
			System.out.println(" ");
		}
		
	}
		
	public void getMostDominantKick() 
	{
		populateArrays();
		
		for(int i = 0; i < kickAmountArray.size(); i++) 
		{
			if(kickAmountArray.get(i) == Collections.max(kickAmountArray)) 
			{
				System.out.println("Your most dominant kick is: " + calculatedKickArray.get(i).getmAction().toString());
				System.out.println("It was used " + kickAmountArray.get(i) + " times");
				System.out.println("");
			}
		}
		
	}
	
	
	public void getHighestScoringKick() 
	{
		populateArrays();
		
		for(int i = 0; i < kickScoreArray.size(); i++) 
		{
			if(kickScoreArray.get(i) == Collections.max(kickScoreArray)) 
			{
				System.out.println("Your highest scoring kick is: " + calculatedKickArray.get(i).getmAction().toString());
				System.out.println("It scored " + kickScoreArray.get(i) + " points");
				System.out.println("");
			}
		}
	}

	
	
	
	
		
}
