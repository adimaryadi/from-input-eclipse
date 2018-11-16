import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDletStateChangeException;

public class AplikasiPerpustakaan extends MIDlet implements CommandListener {
	 Display Layar;
	 
	 Form dari = new Form("Perpustakaan");
	 
	 TextField kodebuku  		=  new TextField("Kode Buku","",11,TextField.NUMERIC);
	 TextField KodeRak   		=  new TextField("Kode Rak","",3,TextField.ANY);
	 TextField ISBN    	 		=  new TextField("ISBN","",13,TextField.NUMERIC);
	 TextField JudulBuku 		=  new TextField("Judul Buku","",30,TextField.ANY);
	 TextField Penulis 	 		=  new TextField("Penulis","",30,TextField.ANY);
	 TextField Penerbit  		=  new TextField("Penerbit","",30,TextField.ANY);
	 TextField TahunPenerbit	=  new TextField("Tahun Penerbit","",4,TextField.NUMERIC);
	 TextField JumlahBuku  	    =  new TextField("Jumlah Buku","",5,TextField.NUMERIC);
	 
	 Command   Exit 		 	=  new Command("Exit",Command.EXIT,1);
	 Command   Kembali   		=  new Command("kembali",Command.BACK,1);
	 Command   Tampil 			=  new Command("Tampilkan",Command.OK,2);
	 

	public AplikasiPerpustakaan() {
		// TODO Auto-generated constructor stub
		Layar    =  Display.getDisplay(this);
		
		dari.append(kodebuku);
		dari.append(KodeRak);
		dari.append(ISBN);
		dari.append(JudulBuku);
		dari.append(Penulis);
		dari.append(Penerbit);
		dari.append(TahunPenerbit);
		dari.append(JumlahBuku);
		dari.addCommand(Exit);
		dari.addCommand(Tampil);
		dari.setCommandListener(this);
		
	}

	protected void destroyApp(boolean unconditional) {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() {
		// TODO Auto-generated method stub
		Layar.setCurrent(dari);

	}
	
	public void DataTampil() {
		String Kodebuku,Koderak,Isbn,Judulbuku,penulis,penerbit,tahunpenerbit,Jumlahbuku;
		
		Layar 		=     Display.getDisplay(this);
		
		Kodebuku    =    kodebuku.getString();
		Koderak 	=  	 KodeRak.getString();
		Isbn 	    =    ISBN.getString();
		Judulbuku   =    JudulBuku.getString();
		penulis 	= 	 Penulis.getString();
		penerbit 	=    Penerbit.getString();
		tahunpenerbit=   TahunPenerbit.getString();
		Jumlahbuku 	=    JumlahBuku.getString();
		
		Form fromtampil     =   new Form("Menampilkan data mahasiswa");
		fromtampil.append("Kode Barang " + Kodebuku + "\n");
		fromtampil.append("Kode Rak " + Koderak + "\n");
		fromtampil.append("ISBN " + Isbn + "\n");
		fromtampil.append("Judul Buku" + Judulbuku + "\n");
		fromtampil.append("Penulis " + penulis + "\n");
		fromtampil.append("Penerbit" + penerbit + "\n");
		fromtampil.append("Tahun Penerbit" + tahunpenerbit + "\n");
		fromtampil.append("Jumlah Buku"  + Jumlahbuku + "\n");
		fromtampil.addCommand(Exit);
		fromtampil.addCommand(Kembali);
		fromtampil.setCommandListener(this);
		Layar.setCurrent(fromtampil);
		
	}
	
	public void commandAction(Command c, Displayable d) {
		if(c == Exit) {
			notifyDestroyed();
			destroyApp(true);
		} else {
			if(c == Tampil) {
				DataTampil();
			} else {
				if(c == Kembali) {
					startApp();
				}
			}
		}
	}

}
