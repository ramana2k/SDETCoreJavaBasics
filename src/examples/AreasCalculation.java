
public class AreasCalculation {
	
	public static void main(String[] args) {
		
		AreasCalculation areaCal= new AreasCalculation();
		int Perimeter = areaCal.areaRectangle(10,20);
		System.out.println(" Area of Rectangle is  "+Perimeter);
		
	}
	
	
	public int areaRectangle(int Reclength, int Recbreadth)
	{
		int perimeterArea=0;
		perimeterArea=Reclength*Recbreadth;
		return perimeterArea;
	}

}
