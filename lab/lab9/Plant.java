package Practice9;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	
	 Plant(String type, String color, int size) throws ColorException, TypeException{
	      Color c = colorStrToEnum(color);
	      Type t = typeStrToEnum(type);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	   }


	public Type typeStrToEnum(String type) throws TypeException{
		switch(type.toLowerCase()) {
		case "rose":
			return Type.ROSE;
		case "standart":
			return Type.STANDART;
		case "eating":
			return Type.EATING;
		default:
			throw new TypeException("You type different Rose,Standart and Eating");
			
		}
	}
	
	public Color colorStrToEnum(String color) throws ColorException {
		switch(color.toLowerCase()) {
		case "blue":
			return Color.BLUE;
		case "yellow":
			return Color.YELLOW;
		case "red":
			return Color.RED;
		default:
			throw new ColorException("You flover different Blue,Yellow and Red");
		}
		
	}

	@Override
	public String toString() {
		return "size is : " + size + "Color is : " + color + "Type is : " + type;
	}

}
