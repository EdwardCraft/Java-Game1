package CL;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{
	
	@Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
    	int mx=e.getX();
		int my=e.getY();

	/*
	public Rectangle playButton  =  new   Rectangle(SpaceGame.WIDTH/2+120,150,100,50);
	public Rectangle helpyButton  =  new  Rectangle(SpaceGame.WIDTH/2+120,250,100,50);
	public Rectangle quitButton  =  new   Rectangle(SpaceGame.WIDTH/2+120,350,100,50);
	*/		
		//playButton
	    if(mx >= SpaceGame.WIDTH/2+120 && mx  <= SpaceGame.WIDTH/2+220)
	    {

	    	if(my >= 150 && my<=200)
	    	{
	    		//Pressed Play Button
	    		SpaceGame.State=SpaceGame.STATE.GAME;
	    	}

	    }
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}