import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

// implementasikan Perintah 
public class PendataanBarangGudang extends MIDlet implements CommandListener {
	
	Display Tampil; // menampilkan data dari From
	
	Form from = new Form("Pendataan Barang");
	
	
	// buat variabel object input 
	
	TextField idBarang    	=    new TextField("id\n","",11,TextField.NUMERIC);
	TextField NamaBarang  	=    new TextField("Nama Barang \n","",30,TextField.ANY);
	TextField NamaSupplayer	=	 new TextField("Nama Supplayer \n","",30,TextField.ANY);
	TextField Quantity 	    =    new TextField("Quantitas \n","",12,TextField.NUMERIC);
	TextField HargaBarang	=    new TextField("Harga Barang","",20, TextField.NUMERIC);
	
	// Buat variabel tombol
	
	Command   Exit 			=    new Command("Keluar",Command.EXIT,1);
	Command   Kembali  	    =    new Command("Kembali", Command.BACK,1);
	// buat tombol Tampilkan data yang di input
	Command   Tampilkan     =    new Command("Tampilkan",Command.OK,2);
	
	
	public PendataanBarangGudang() {
		// TODO Auto-generated constructor stub
		//pangil variabel tampil 
		
		Tampil  = Display.getDisplay(this);
		
		// tampilkan di layar
		
		from.append(idBarang);
		from.append(NamaBarang);
		from.append(NamaSupplayer);
		from.append(Quantity);
		from.append(HargaBarang);
		from.addCommand(Exit);
		from.addCommand(Tampilkan);
		from.setCommandListener(this);
	}

	// hapus throws MIDletStateChangeException
	protected void destroyApp(boolean unconditional)  {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() {
		// TODO Auto-generated method stub
		// panggil from 
		// hapus throws MIDletStateChangeException
		Tampil.setCurrent(from);
	}
	
	public void DataTampil() {
		// buat variabel tipe data string untuk menampung input dari object
		String idbarang,namabarang,namasuplayer,quantity,hargabarang;
		// panggil var tampil
		Tampil      =  Display.getDisplay(this);
		
		// isi variabel string dari object 
		idbarang    =  idBarang.getString();
		namabarang  =  NamaBarang.getString();
		namasuplayer=  NamaSupplayer.getString();
		quantity    =  Quantity.getString();
		hargabarang =  HargaBarang.getString();
		
		// buat variabel menampilkan data dari object fromtampil
		
		Form fromtampil    =   new Form("Menampilkan data Mahasiswa");
		fromtampil.append("ID BARANG " + idbarang + "\n");
		fromtampil.append("Nama Barang" + namabarang + "\n");
		fromtampil.append("Nama Suplayer" + namasuplayer + "\n");
		fromtampil.append("Quantity"+ quantity + "\n");
		fromtampil.append("Harga Barang" + hargabarang + "\n");
		fromtampil.addCommand(Kembali);
		fromtampil.addCommand(Exit);
		fromtampil.setCommandListener(this);
		Tampil.setCurrent(fromtampil);
		
	}
	
	public void commandAction(Command c, Displayable d) {
		if(c == Exit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == Tampilkan) {
				DataTampil();
			} else {
				if(c == Kembali) {
					startApp();
				}
			}
		}
	}

}
