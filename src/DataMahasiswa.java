import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

public class DataMahasiswa extends MIDlet implements CommandListener {
	
	Display Tampil;
	Form from = new Form("Data Mahasiswa");
	
	
	// buat input object
	
	TextField tNIM  		= new TextField("NIM\n","",15,TextField.DECIMAL);
	TextField tNama 		= new TextField("Nama\n","",30, TextField.ANY);
	TextField tAlamat 	  	= new TextField("Alamat\n","", 100,TextField.ANY);
	TextField tJurusan 	  	= new TextField("Jurusan\n","", 100,TextField.ANY);
	TextField tTLP 	  	    = new TextField("TLP\n","", 100,TextField.PHONENUMBER);
	TextField tEmail 	  	= new TextField("Email\n","", 100,TextField.EMAILADDR);
	
	Command   Back  		= new Command("Kembali",Command.BACK,1);
	Command   TombolExit	= new Command("Keluar", Command.EXIT,1);
	Command   TombolTampil  = new Command("Tampilkan", Command.OK,2);
	

	public DataMahasiswa() {
		// TODO Auto-generated constructor stub
		Tampil = Display.getDisplay(this);
		from.append(tNIM);
		from.append(tNama);
		from.append(tAlamat);
		from.append(tJurusan);
		from.append(tTLP);
		from.append(tEmail);
		from.addCommand(TombolExit);
		from.addCommand(TombolTampil);
		from.setCommandListener(this);
		
	}

	protected void destroyApp(boolean unconditional) {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() {
		// TODO Auto-generated method stub
		Tampil.setCurrent(from);
	}
	
	public void Tampil() {
		String nim,nama,alamat,jurusan,telepon,email;
		Tampil  =  Display.getDisplay(this);
		nim 	=  tNIM.getString();
		nama 	=  tNama.getString();
		alamat  =  tAlamat.getString();
		telepon =  tTLP.getString();
		email 	=  tEmail.getString();
		
		
		Form fromTampil  =  new Form("Menampilkan Data Mahasiswa");
		fromTampil.append("NIM: " + nim + "\n");
		fromTampil.append("Nama: " + nama + "\n");
		fromTampil.append("Alamat:  " + alamat + "\n");
		fromTampil.append("TELEPON:  " + telepon + "\n");
		fromTampil.append("Email:  " + email + "\n");
		fromTampil.addCommand(TombolExit);
		fromTampil.addCommand(Back);
		fromTampil.setCommandListener(this);
		Tampil.setCurrent(fromTampil);
	}

	public void commandAction(Command c,Displayable d) {
		if(c == TombolExit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == TombolTampil) {
				Tampil();
			} else {
				if(c == Back) {
					startApp();
				}
			}
		}
	}
}
