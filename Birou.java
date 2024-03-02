
public class Birou {
		public final Sertar a;
		public final Sertar b;
		public int l, L, H;
		
		public Birou(Sertar a, Sertar b)
		{
			this.a=a;
			this.b=b;
			if(a.l>b.l)
				this.l=a.l;
			else
				this.l=b.l;
			
			if(a.L>b.L)
				this.L=a.L;
			else
				this.L=b.L;
			this.H=a.H+b.H;
		}

		public void Print()
		{
			System.out.println("Primul sertar: ");
			this.a.Print();
			System.out.println("Cel de al doilea sertar: ");
			this.b.Print();
			System.out.println("Dimensiuniile biroului: "+this.l+" l + "+this.L+" L + "+this.H+" H");
			
		}
}
