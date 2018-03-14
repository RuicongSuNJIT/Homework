package action;

import java.io.File;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import pojo.FileSystem;

/**
 * The request URL is mapped to "upload", you need to change the default results
 * setting which was for action test I did, typically just show a success JSP
 * page, let's say success.jsp, if the upload finished, but a error JSP page for
 * error, let's say error.jsp. In the error page show some detail message about
 * the error.
 * 
 * You need to add those necessary fields for file uploading, Pay attention to
 * the fields name.
 * 
 * Finally, in the {@link #execute()} method, you will use the class
 * {@link FileSystem} you achieved, and call the function
 * {@link FileSystem#saveFile(String, File) } to save the file.
 * 
 * Additionally, the error.jsp page might be reused by the download action. So,
 * the page should show the error message from both upload and download,
 * depending on which action it is from.
 * 
 * @author Ruicong Su
 *
 */

@Action(value = "upload", results = {
		@Result(name = "success", location = "/Test.jsp") })
public class FileUpload extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -79070811354184957L;

	private FileSystem fs = new FileSystem();

	@Override
	public String execute() throws Exception {

		// fs.saveFile(fileName, file);

		return SUCCESS;
	}

}
