package lab9;

public class Plant {
	private Type type;

	private Color color;

	private int size;

	public Plant(String type, String color, int size) throws ColorException, TypeException {

		Color c = colorStrToEnum(color);

		Type t = typeStrToEnum(type);

		this.size = size;

		this.type = t;

		this.color = c;

	}

	private Color colorStrToEnum(String color) throws ColorException {

		switch (color.toLowerCase()) {

		case "blue":
			return Color.Blue;

		case "red":
			return Color.Red;

		case "white":
			return Color.White;

		default:
			throw new ColorException("Input only color blue, red or white");

		}

	}

	private Type typeStrToEnum(String type) throws TypeException {

		switch (type.toLowerCase()) {

		case "orchid":
			return Type.Corsage_Orchid;

		case "lily":
			return Type.Belladonna_Lily;

		case "rose":
			return Type.Rose;

		default:
			throw new TypeException("Input only type orchid,lily or rose");

		}

	}

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	
  
}
