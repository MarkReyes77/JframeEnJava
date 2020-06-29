import javax.swing.JFrame;

public class MiInterfaz{
	public static void main(String[] args){
	//Le hacemos un llamado a la clase del final
		ventana vta = new ventana();
		vta.setVisible(true);//hacemos que nuestro Frame (ventana) sea visible
		///llamamos a setDefaultCloseOperation
		vta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ventana extends JFrame{
	public ventana(){
		setTitle("Hola soy una ventana"); //Titulo del jFrame
		setSize(600,300);//Se define el ancho y el alto de la ventana 
		setLocation(250,150);//Se define la ubicasion en el eje X
							 //Se puede usar: setBounds(600,300,250,150);
							 // En su lugar usamos: setSize(600,300); y setLocation(250,150);
	}
}