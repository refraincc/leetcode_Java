package Sort.Model;

public class TestModel implements Comparable<TestModel>{
    public int score;
	public int age;
	
	public TestModel(int score, int age) {
		this.score = score;
		this.age = age;
	}
	
	@Override
	public int compareTo(TestModel o) {
		return age - o.age;
	}
}
