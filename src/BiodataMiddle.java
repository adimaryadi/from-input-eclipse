import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class BiodataMiddle extends MIDlet implements CommandListener {

	Display tampil;
	Form frm = new Form("Data Biodata Mahasiswa");
	
	// membuat objek input 
	TextField tNIM 			= new TextField("NIM", "",20, TextField.NUMERIC);
	Command   TombolExit 	= new Command("Keluar", Command.EXIT, 1);
	Command   TombolTampil  = new Command("Tampil", Command.OK, 2);
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
		frm.addCommand(TombolExit);
		frm.addCommand(TombolTampil);
		frm.setCommandListener(this);
		
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
	
	public void TampilData() {
		// mengambil data input dari object
		String nim,nama,alamat,jurusan,telepon,email;
		tampil = Display.getDisplay(this);
		nim 	= tNIM.getString();
		nama	= tNama.getString();
		alamat 	= tAlamat.getString();
		jurusan = tJurusan.getString();
		telepon = tTelepon.getString();
		email 	= tEmail.getString();
		
		Form frmTampil  = new Form("Tampil Data Mahasiswa");
		frmTampil.append("NIM : \n" + nim);
		frmTampil.append("Nama : \n"+ nama);
		frmTampil.append("Alamat : \n" + alamat);
		frmTampil.append("Jurusan : \n" + jurusan);
		frmTampil.append("Telepon : \n" + telepon);
		frmTampil.append("Email : \n" + email);
		tampil.setCurrent(frmTampil);
	}
	
	public void commandAction(Command c,Displayable d) {
		if(c == TombolExit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == TombolTampil) {
				TampilData();
			}
		}
	}

}
