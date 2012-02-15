package Ftdi_usb;
/**
* Created by jed
* User: jedartois@gmail.com
* Date: 11/02/12
*/
public interface IFtdi {

	public abstract void open();
	public abstract void close();
	public abstract void destroy();
	public abstract boolean setbaudrate(int bitrate);
	public abstract boolean isConnected();
	public abstract void write(byte[] data) throws Ftdi_Error;
	public abstract void write(String data) throws Ftdi_Error;	
	public abstract byte[] read() throws Ftdi_Error;
	public abstract void addEventListener (Ftid_listener listener);
	public abstract void removeEventListener (Ftid_listener listener);
}