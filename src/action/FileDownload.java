package action;

import java.io.InputStream;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import pojo.FileSystem;

/**
 * The request URL is mapped to "download", you need to change the default
 * results setting which was for action test I did, typically a stream type of
 * result for success, but a error JSP page for error, let's say error.jsp. In
 * the error page show some detail message about the error.
 * 
 * Add those fields that you need to configure the stream result.
 * 
 * Finally, in the {@link #execute()} method, you will use the class {@link FileSystem}
 * you achieved, and call the function {@link FileSystem#readFile(String) }
 * to get the {@link InputStream} for download.
 * 
 * Additionally, the error.jsp page might be reused by the upload action. So,
 * the page should show the error message from both upload and download,
 * depending on which action it is from.
 * 
 * @author Ruicong Su
 *
 */

@Action(value = "download", results = {
		@Result(name = "success", location = "/Test.jsp") })
public class FileDownload extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4384469196935532848L;

	private FileSystem fs = new FileSystem();

	@Override
	public String execute() throws Exception {

		// inputStream = fs.readFile(fileName);

		return SUCCESS;
	}
}
