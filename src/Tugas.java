import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

public class Tugas extends MIDlet implements CommandListener {
	
	Display Layar;
	Form from = new Form("Estimasi Data");

	// membut input object 
	TextField tJumlah     =   new TextField("Jumlah\n", "",20,TextField.ANY);
	TextField tTenor 	  =   new TextField("Tenor\n","",2,TextField.NUMERIC);
	
	Command   Jumlah      =   new Command("Jumlahkan", Command.OK,2);
	Command   Exit   	  =   new Command("Exit", Command.EXIT,1);
	Command   kembali     =   new Command("kembali", Command.BACK,1);
	private int persen;
	
	public Tugas() {
		// TODO Auto-generated constructor stub
		
		Layar = Display.getDisplay(this);
		from.append(tJumlah);
		from.append(tTenor);
		from.addCommand(Jumlah);
		from.addCommand(Exit);
		from.setCommandListener(this);
	}

	protected void destroyApp(boolean uncoditional) {
		// TODO Auto-generated method stub
		
	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() {
		// TODO Auto-generated method stub
		Layar.setCurrent(from);
	}
	
	public void TampilLayar() {
		String jumlah,tenor;
		Layar  =  Display.getDisplay(this);
		jumlah =  tJumlah.getString();
		tenor  =  tTenor.getString();
		// belum bisa manipulasi di java ?
		Integer xjumlah = Integer.valueOf(tJumlah.getString());
		Integer xtenor  = Integer.valueOf(tTenor.getString());
		System.out.print(xtenor);
		
		Form fromLayar  =   new  Form("Hasil Perhitungan");
		fromLayar.append("Jumlah: " + jumlah + "\n");
		fromLayar.append("Tenor" + tenor + "\n");
		fromLayar.addCommand(kembali);
		fromLayar.setCommandListener(this);
		Layar.setCurrent(fromLayar);
	}
	
	
	public void commandAction(Command c,Displayable d) {
		if(c == Exit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == Jumlah) {
				TampilLayar();
			} else {
				if(c == kembali) {
					startApp();
				}
			}
		}
	}

}
