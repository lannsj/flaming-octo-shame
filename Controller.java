import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;





public class Controller extends JPanel implements ChangeListener, ActionListener{
	
	

	private static final long serialVersionUID = 1L;
	JSlider LSlider;
	JSlider dSlider;
	Timer MyTimer;
	private int L;
	
	
	Controller(Model ModelIn, View ViewIn) {
		JSlider LSlider = new JSlider();
		JSlider dSlider = new JSlider();
		LSlider.addChangeListener(this);
		dSlider.addChangeListener(this);
		add(dSlider);
		add(LSlider);
		int delta =1;
		Timer MyTimer = new Timer(delta, this);
		
	}
	

	public void stateChanged(ChangeEvent e){
		if(e.getSource()==LSlider);{
			this.L = LSlider.getValue();
			System.out.println("blub");
		}
		if(e.getSource()==dSlider);{
			int delta = dSlider.getValue();
			MyTimer.stop();
			MyTimer = new Timer(delta, this);
			
			}
		}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}



