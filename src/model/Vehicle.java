package model;

public class Vehicle {
	//Created by Morgan
		private String make;
		private String model;
		private int year;
		private String color;
		
		public Vehicle()
		{
			super();
		}
		
		public Vehicle(String make, String model, int year, String color)
		{
			super();
			this.make = make;
			this.model = model;
			this.year = year;
			this.color = color;
		}
		
		public String getMake()
		{
			return make;
		}
		
		public void setMake()
		{
			this.make = make;
		}
		
		public String getModel()
		{
			return model;
		}
		
		public void setModel()
		{
			this.model = model;
		}
		
		public int getYear()
		{
			return year;
		}
		
		public void setYear()
		{
			this.year = year;
		}
		
		public String getColor()
		{
			return color;
		}
		
		public void setColor()
		{
			this.color = color;
		}
		
		public String MakeNoise()
		{
			return "Brap! Brap! Brap!";
		}

}
