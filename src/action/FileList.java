package action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import pojo.FileSystem;

/**
 * You don't need to change any thing in this class. Just goto class
 * {@link FileSystem} and complete the method {@link FileSystem#listFile()}.
 * 
 * @author Ruicong Su
 *
 */

@ParentPackage(value = "json-default")
@Action(value = "fileList", results = {
		@Result(name = "success", type = "json", params = { "root", "list" }) })
public class FileList extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3042614908718470251L;

	private List<String> list;
	private FileSystem fs = new FileSystem();

	@Override
	public String execute() throws Exception {
		list = fs.listFile();
		return SUCCESS;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
