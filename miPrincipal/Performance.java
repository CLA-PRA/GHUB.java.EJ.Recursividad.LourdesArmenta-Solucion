package miPrincipal;

public class Performance {
    private long ti;//tiempo inicial
	private long tf;// tiempo final
	private boolean stoped = false;
	public Performance()
	{
		start();
	}
	public void start()
	{
		//tomamoes la fecha/hora actual; expresada en mikisegundos
		ti=System.currentTimeMillis();
		stoped = false;
		
	}
	public void stop() {
		//tomamoes la fecha/hora actual; expresada en mikisegundos
		tf=System.currentTimeMillis();
		stoped = true;
	}
	public long getMillis() {
		//retorma el tiempo (en milisegundos) trancurrieron
		//entre las invocaciones de start y stop
		return tf-ti;
	}
	public String toString() {
		if(!stoped)
		{
			stop();
		}
		long diff = tf -ti;
		long min = diff/1000/60;
		long sec =(diff/1000)%60;
		return diff +" milisegundos ("+min+" minutos"+sec+" segundos)";
		
	}
	public long getTi() {
		return ti;
	}
	public void setTi(long ti) {
		this.ti = ti;
	}
	public long getTf() {
		return tf;
	}
	public void setTf(long tf) {
		this.tf = tf;
	}
	public boolean isStoped() {
		return stoped;
	}
	public void setStoped(boolean stoped) {
		this.stoped = stoped;
	}
	

}
