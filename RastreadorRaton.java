import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RastreadorRaton extends JFrame implements MouseListener, MouseMotionListener {
	private JLabel barraEstado;

	public RastreadorRaton()
	{
		super("Demorstracion de los eventos de raton");

		barraEstado = new JLabel();
		add(barraEstado, BorderLayout.SOUTH);

		addMouseListener(this);
		addMouseMotionListener(this);

		setSize(300, 150);
		setVisible(true);
	}

	// Eventos de MouseListener
	// soltar despues de oprimir
    public void mouseClicked(MouseEvent evento){
		barraEstado.setText("Se hizo clic en [" + evento.getX() + ", " + evento.getY() + "]");
	}

	// oprimir el boton del raton
	public void mousePressed(MouseEvent evento){
		barraEstado.setText("Se oprimio en [" + evento.getX() + ", " + evento.getY() + "]");
	}

	// soltar el raton despues de arrastrar
	public void mouseReleased(MouseEvent evento){
		// TODO: 
	}

	// el raton entra al area
	public void mouseEntered(MouseEvent evento){
		barraEstado.setText("Entro en[" + evento.getX() + ", " + evento.getY() + "]");
		getContentPane().setBackground(Color.GREEN);
	}

	// el raton sale del area
	public void mouseExited(MouseEvent evento){
		// TODO:
	}

	// Manejadores de eventos de mouseMotionListener
	// evento cuando se arrastra el raton con boton oprimido
	public void mouseDragged(MouseEvent evento){
		barraEstado.setText("Se arrastro en[" + evento.getX() + ", " + evento.getY() + "]");
	}

	// se mueve el raton
	public void mouseMoved(MouseEvent evento){
		// TODO:
	}

	public static void main(String[] args){
		RastreadorRaton aplicacion = new RastreadorRaton();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
