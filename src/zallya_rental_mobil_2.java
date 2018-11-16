import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

public class zallya_rental_mobil_2 extends MIDlet implements CommandListener  {
	
	Display Tampil;
	Form from = new Form("rental mobil");
	
	TextField tNopol =new TextField("Nopol\n","",7,TextField.ANY);
	TextField tNoRangka =new TextField("Norangka\n","",13,TextField.ANY);
	TextField tNomesin =new TextField("Nomesin\n","",13,TextField.ANY);
	TextField tJenisMobil =new TextField("JenisMobil\n","",20,TextField.ANY);
	TextField tMerkMobil =new TextField("MerkMobil\n","",30,TextField.ANY);
	TextField tTahunPembelian =new TextField("TahunPembelian\n","",4,TextField.NUMERIC);
	TextField tTahunPembuatan =new TextField("TahunPembuatan\n","",4,TextField.NUMERIC);
	TextField tJumlahMobil =new TextField("JumlahMobil\n","",5,TextField.NUMERIC);
	
	Command   Back  		= new Command("Kembali",Command.BACK,1);
	Command   TombolExit	= new Command("Keluar", Command.EXIT,1);
	Command   TombolTampil  = new Command("Tampilkan", Command.OK,2);
	


	public zallya_rental_mobil_2() {
		// TODO Auto-generated constructor stub
		Tampil = Display.getDisplay(this);
		from.append(tNopol);
		from.append(tNoRangka);
		from.append(tNomesin);
		from.append(tJenisMobil);
		from.append(tMerkMobil);
		from.append(tTahunPembelian);
		from.append(tTahunPembuatan);
		from.append(tJumlahMobil);
		from.addCommand(TombolExit);
		from.addCommand(TombolTampil);
		from.setCommandListener(this);
	}

	protected void destroyApp(boolean arg0) {
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
		String nopol, norangka, nomesin, jenismobil, merkmobil, tahunpembelian, tahunpembuatan, jumlahmobil; 
		Tampil  =  Display.getDisplay(this);
		nopol = tNopol.getString();
		norangka = tNoRangka.getString();
		nomesin = tNomesin.getString();
		jenismobil = tJenisMobil.getString();
		merkmobil = tMerkMobil.getString();
		tahunpembelian = tTahunPembuatan.getString();
		tahunpembuatan = tTahunPembuatan.getString();
		jumlahmobil= tJumlahMobil.getString();
		
		Form fromTampil  =  new Form("Menampilkan Data Rental Mobil");
		
		fromTampil.append("Nomor Polisi: " + nopol + "\n");
		fromTampil.append("Nomor Rangka: " + norangka + "\n");
		fromTampil.append("Nomor Mesin: " + nomesin + "\n");
		fromTampil.append("Jenis Mobil: " + jenismobil+ "\n");
		fromTampil.append("Merek Mobil: " + merkmobil + "\n");
		fromTampil.append("Tahun Pembielian: " + tahunpembelian + "\n");
		fromTampil.append("Tahun Pembuatan: " + tahunpembuatan + "\n");
		fromTampil.append("Jumlah Mobil: " + jumlahmobil + "\n");
		
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
