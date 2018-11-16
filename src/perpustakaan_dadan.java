import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

public class perpustakaan_dadan extends MIDlet implements CommandListener {
	
	Display Tampil;
	Form form = new Form("Perpustakaan Dadan");
	
	// form tampilnya
	
	TextField kode_buku = new TextField("Kode Buku \n ","",11,TextField.NUMERIC);
	TextField kode_rak = new TextField("Rak Buku \n","",3,TextField.ANY);
	TextField isbn = new TextField("ISBN \n","",13,TextField.NUMERIC);
	TextField judul_buku = new TextField("Judul Buku\n","",30,TextField.ANY);
	TextField penulis = new TextField("Penulis \n","",30,TextField.ANY);
	TextField penerbit = new TextField("Penerbit\n","",30,TextField.ANY);
	TextField tahun_terbit = new TextField("Tahun Terbit\n","",4,TextField.NUMERIC);
	TextField jumlah_buku = new TextField("Jumlah Buku \n","",5,TextField.NUMERIC);
	
	Command   TombolBack  		= new Command("Back",Command.BACK,1);
	Command   TombolExit      = new Command("Exit",Command.EXIT,1);
	Command   TombolTampil    = new Command("Tampilkan ",Command.OK,2);
	 

	public perpustakaan_dadan() {
		// TODO Auto-generated constructor stub
		Tampil = Display.getDisplay(this);
		form.append(kode_buku);
		form.append(kode_rak);
		form.append(isbn);
		form.append(judul_buku);
		form.append(penulis);
		form.append(penerbit);
		form.append(tahun_terbit);
		form.append(jumlah_buku);
		form.addCommand(TombolExit);
		form.addCommand(TombolTampil);
		form.setCommandListener(this);
		
	}

	protected void destroyApp(boolean arg0) {
		// TODO Auto-generated method stub
		

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp()  {
		// TODO Auto-generated method stub
		Tampil.setCurrent(form);
	}
	
	public void Tampil() {
		String t_kode_buku,t_kode_rak,t_isbn,t_judul_buku,t_penulis,t_penerbit,t_tahun_terbit,t_jumlah_buku;
		Tampil = Display.getDisplay(this);
		t_kode_buku = kode_buku.getString();
		t_kode_rak = kode_rak.getString();
		t_isbn = isbn.getString();
		t_judul_buku = judul_buku.getString();
		t_penulis = penulis.getString();
		t_tahun_terbit = tahun_terbit.getString();
		t_jumlah_buku = jumlah_buku.getString();
		
		Form formTampil  =  new Form("Tampilkan buku");
		formTampil.append("Kode Buku : " + t_kode_buku +" \n");
		formTampil.append("Kode Rak: " + t_kode_rak +" \n");
		formTampil.append("ISBN: " + t_isbn +" \n");
		formTampil.append("Judul Buku: " + t_judul_buku +" \n");
		formTampil.append("Penulis: " + t_penulis +" \n");
		formTampil.append("Judul Buku: " + t_judul_buku +" \n");
		formTampil.append("Penulis: " + t_penulis+" \n");
		formTampil.append("Tahun Terbit: " + t_tahun_terbit+" \n");
		formTampil.append("Jumlah Buku: " + t_jumlah_buku+" \n");
		
		formTampil.addCommand(TombolExit);
		formTampil.addCommand(TombolBack);
		formTampil.setCommandListener(this);
		Tampil.setCurrent(formTampil);
		
	}
	
	public void commandAction(Command c,Displayable d) {
		if(c == TombolExit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == TombolTampil) {
				Tampil();
			} else {
				if(c == TombolBack) {
					startApp();
				}
			}
		}
	}

}
