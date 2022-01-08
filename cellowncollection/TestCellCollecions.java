package cellowncollection;
public class TestCellCollecions {

	public static void main(String[] args) {

		//TODO Auto-generated method stub

		Cell c= new Cell();
		c.setValue("Tomas");
		
		Cell c1 = new Cell();
		c1.setValue("Andrea");
		
		CellCollection <Cell>cc = new CellCollection<Cell>(10);
		cc.add(c);
		cc.add(c1);
		
		cc.add(new Cell());
		cc.get(2).setValue("Carla");
		
		System.out.println(cc.toString());		
		
	}

}
