package thread;

public class sample {
public static void main( String args[])
{
	sampleTherads st=new sampleTherads(1);
	st.start();
	sampleTherads ss=new sampleTherads(2);
	ss.start();
	sampleTherads sp=new sampleTherads(3);
	sp.start();
}}
