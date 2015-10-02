package c;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : bits/stat.h:165</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class stat extends Structure {
	/**
	 * Device.<br>
	 * C type : __dev_t
	 */
	public NativeLong st_dev;
	/**
	 * File serial number.<br>
	 * C type : __ino_t
	 */
	public NativeLong st_ino;
	/**
	 * Link count.<br>
	 * C type : __nlink_t
	 */
	public NativeLong st_nlink;
	/**
	 * File mode.<br>
	 * C type : __mode_t
	 */
	public int st_mode;
	/**
	 * User ID of the file's owner.<br>
	 * C type : __uid_t
	 */
	public int st_uid;
	/**
	 * Group ID of the file's group.<br>
	 * C type : __gid_t
	 */
	public int st_gid;
	public int __pad0;
	/**
	 * Device number, if device.<br>
	 * C type : __dev_t
	 */
	public NativeLong st_rdev;
	/**
	 * Size of file, in bytes.<br>
	 * C type : __off_t
	 */
	public NativeLong st_size;
	/**
	 * Optimal block size for I/O.<br>
	 * C type : __blksize_t
	 */
	public NativeLong st_blksize;
	/**
	 * Number 512-byte blocks allocated.<br>
	 * C type : __blkcnt_t
	 */
	public NativeLong st_blocks;
	/**
	 * Nanosecond resolution timestamps are stored in a format<br>
	 * equivalent to 'struct timespec'.  This is the type used<br>
	 * whenever possible but the Unix namespace rules do not allow the<br>
	 * identifier 'timespec' to appear in the <sys/stat.h> header.<br>
	 * Therefore we have to handle the use of this header in strictly<br>
	 * standard-compliant sources special.<br>
	 * Time of last access.<br>
	 * C type : timespec
	 */
	public timespec st_atim;
	/**
	 * Time of last modification.<br>
	 * C type : timespec
	 */
	public timespec st_mtim;
	/**
	 * Time of last status change.<br>
	 * C type : timespec
	 */
	public timespec st_ctim;
	/** C type : __syscall_slong_t[3] */
	public NativeLong[] __unused = new NativeLong[3];
	public stat() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("st_dev", "st_ino", "st_nlink", "st_mode", "st_uid", "st_gid", "__pad0", "st_rdev", "st_size", "st_blksize", "st_blocks", "st_atim", "st_mtim", "st_ctim", "__unused");
	}
	public static class ByReference extends stat implements Structure.ByReference {
		
	};
	public static class ByValue extends stat implements Structure.ByValue {
		
	};
}