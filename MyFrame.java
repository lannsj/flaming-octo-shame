import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;


	public MyFrame() {
		int antal = 700;
	    Model MyModel = new Model(antal);
	    View MyView = new View(MyModel);
	    Controller MyController = new Controller(MyModel, MyView);
	    
	    
	    int width = (int) (antal);
	    int height = (int) (antal);
		this.pack();
	    this.setVisible(true);
		this.setSize( width, height );
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("ganska ful");
		
		//this.add(MyView);
		//MyView.add(MyController);
		
		//MyController.setLayout(new BoxLayout(MyController, BoxLayout.X_AXIS));
		
		JPanel contentPane = new JPanel(new BorderLayout());
		//contentPane.add(MyView);
		contentPane.add(MyController);
		add(contentPane);
	}
	

public static void main(String[] args) {
	new MyFrame();
	
}
}