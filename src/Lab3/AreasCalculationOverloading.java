package Lab3;

public class AreasCalculationOverloading {
	
	
public static void main(String[] args) {
		
	AreasCalculationOverloading areaCal= new AreasCalculationOverloading();
		int Perimeter = areaCal.areaRectangle(10,20);
		System.out.println(" Area of Rectangle is  "+Perimeter);
		float peri=areaCal.areaRectangle(120.5f);
		
	}
	
	
	public int areaRectangle(int Reclength, int Recbreadth)
	{
		int perimeterArea=0;
		perimeterArea=Reclength*Recbreadth;
		return perimeterArea;
	}
	public float areaRectangle(float radius)
	{
		return 3.14f;
	}

}
