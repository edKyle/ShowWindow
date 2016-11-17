import java.awt.*;

public class ShowWindow
{
	public static void main(String[] args)
	{
		Frame f = new Frame("測試視窗");
		Panel p = new Panel();
		// ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		p.add(new TextField(20));
		p.add(new Button("Tap me"));
		
		f.add(p);
		f.setBounds(400, 100, 500, 400);
		f.setVisible(true);
	}
}