package c;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : bits/ioctl-types.h:3325</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class termio extends Structure {
	/** input mode flags */
	public short c_iflag;
	/** output mode flags */
	public short c_oflag;
	/** control mode flags */
	public short c_cflag;
	/** local mode flags */
	public short c_lflag;
	/** line discipline */
	public byte c_line;
	/**
	 * control characters<br>
	 * C type : unsigned char[8]
	 */
	public byte[] c_cc = new byte[8];
	public termio() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("c_iflag", "c_oflag", "c_cflag", "c_lflag", "c_line", "c_cc");
	}
	/**
	 * @param c_iflag input mode flags<br>
	 * @param c_oflag output mode flags<br>
	 * @param c_cflag control mode flags<br>
	 * @param c_lflag local mode flags<br>
	 * @param c_line line discipline<br>
	 * @param c_cc control characters<br>
	 * C type : unsigned char[8]
	 */
	public termio(short c_iflag, short c_oflag, short c_cflag, short c_lflag, byte c_line, byte c_cc[]) {
		super();
		this.c_iflag = c_iflag;
		this.c_oflag = c_oflag;
		this.c_cflag = c_cflag;
		this.c_lflag = c_lflag;
		this.c_line = c_line;
		if ((c_cc.length != this.c_cc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.c_cc = c_cc;
	}
	public static class ByReference extends termio implements Structure.ByReference {
		
	};
	public static class ByValue extends termio implements Structure.ByValue {
		
	};
}