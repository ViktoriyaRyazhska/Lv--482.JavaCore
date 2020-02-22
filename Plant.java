import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase().trim()) {
		case "blue":
			return Color.BLUE;
		case "red":
			return Color.RED;
		case "white":
			return Color.WHITE;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase().trim()) {
		case "rose":
			return Type.ROSE;
		case "chamomile":
			return Type.CHAMOMILE;
		case "tulip":
			return Type.TULIP;
		default:
			throw new TypeException("Input only type rose, chamomile or tulip");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input five types of plant, theirs's color and size:");
		String type;
		String color;
		int size=0;
		Plant[] myplants = new Plant[5];
		for (int i = 0; i < myplants.length; i++) {
			type = reader.readLine();
			color = reader.readLine();
			try {
			size = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter correct number:");
			}
			try {
				myplants[i] = new Plant(type, color, size);
				System.out.println(myplants[i]);

			} catch (ColorException | TypeException e) {
				e.printStackTrace();
			}
		}
	}
}
