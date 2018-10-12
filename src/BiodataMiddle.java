import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class BiodataMiddle extends MIDlet {

	Display tampil;
	Form frm = new Form("Data Biodata Mahasiswa");
	
	// membuat objek input 
	TextField tNIM 			= new TextField("NIM", "",20, TextField.NUMERIC);
	TextField tNama			= new TextField("Nama Mahasiswa", "", 50, TextField.ANY);
	TextField tAlamat 	 	= new TextField("Alamat","",100, TextField.ANY);
	TextField tJurusan 	 	= new TextField("Jurusan","", 20, TextField.ANY);
	TextField tTelepon 	 	= new TextField("Telepon","",15, TextField.PHONENUMBER);
	TextField tEmail 	  	= new TextField("Email", "",30, TextField.EMAILADDR);
	
	public BiodataMiddle() {
		// TODO Auto-generated constructor stub
		// Panggil Objeck dari atas 
		tampil = Display.getDisplay(this);
		frm.append(tNIM);
		frm.append(tNama);
		frm.append(tAlamat);
		frm.append(tJurusan);
		frm.append(tTelepon);
		frm.append(tEmail);
	}

	protected void destroyApp(boolean unconditional) {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() {
		// TODO Auto-generated method stub
		// Menampilkan Object dari modul BiodataMiddle
		tampil.setCurrent(frm);
		
	}

}
