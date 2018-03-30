package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import pojo.UserInfo;

/**
 * Use the {@link pojo.UserInfo} instance {@link #userInfo} to receive the data
 * sent with the request, and then let {@link #userInfo} as the root object
 * which will be parsed to JSON by using the "JSON" result type processing and
 * as the response body.
 * 
 * The request url of this Action is mapped to "infoSubmit.action" or
 * "infoSubmit", but you still need to change the results.
 * 
 * The default results setting is for you to test the Action is basically
 * working.
 * 
 * @author Ruicong Su
 * 
 */

@Action(value = "infoSubmit", results = {
		@Result(name = "success",type = "json", params = { "root",
		"userInfo" }, location = "/Test.jsp") })
public class InfoSubmit extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 453353445252663489L;
	private UserInfo userInfo;

	@Override
	public String execute() throws Exception {
		System.out.println(userInfo.getFirstName());
		System.out.println(userInfo.getLastName());
		System.out.println(userInfo.getEmail());
		System.out.println(userInfo.getPhoneNumber());
		return SUCCESS;
	}

	public UserInfo getUserInfo() {
		
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
