package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * In this class, you should accomplish three methods that will be used in the
 * Question 2, file upload and download.
 * 
 * {@link #BASEPATH} is the root folder you are saving the files to or find the
 * require file from.
 * 
 * {@link #saveFile(String, File)} will be used by upload action to save the
 * received file.
 * 
 * {@link #listFile()} will be used by list action to show all the files that
 * are available for downloading.
 * 
 * {@link #readFile(String)} will be used by download action to return the
 * {@link FileInputStream}.
 * 
 * @author hadoop
 *
 */

public class FileSystem {
	private static final String BASEPATH = "";

	public boolean saveFile(String fileName, File file) {
		return true;
	}

	public List<String> listFile() {
		List<String> list = new LinkedList<>();

		return list;
	}

	public InputStream readFile(String fileName) {
		return null;
	}
}
