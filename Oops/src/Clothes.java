
public class Clothes {
private Object Color;
private Object Size;
private Object TypeName;

public Clothes(Object color, Object size, Object typename) {
	super();
	Color = color;
	Size = size;
	TypeName = typename;
}

public Object getColor() {
	return Color;
}
public void setColor(Object color) {
	Color = color;
}
public Object getSize() {
	return Size;
}
public void setSize(Object size) {
	Size = size;
}
public Object getTypeName() {
	return TypeName;
}
public void setTypeName(Object typeName) {
	TypeName = typeName;
}
public void Displaycloth() {
	System.out.println("The name is: "+getTypeName());
	System.out.println("color: "+getColor());
	System.out.println("type: "+getTypeName());
}

}
