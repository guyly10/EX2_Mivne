

public class Visitor implements Comparable<Visitor>{

	public String charData;
	public Integer charProb;
	
	public Visitor(Integer prob, String data)
	{
		this.charData = data;
		this.charProb = prob;
	}

	@Override
	public int compareTo(Visitor o) {
		return this.charProb.compareTo(o.charProb);
	}
	
	@Override
	public String toString() {
		return this.charProb +" "+this.charData +"";
	}
	
}
