package com.a4tech.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.a4tech.util.ApplicationConstants;

@Controller
@RequestMapping("/sendEmails")
public class DownloadFileController {
	
	private static Logger _LOGGER = Logger.getLogger(DownloadFileController.class);
	@Autowired
	 private JavaMailSender mailSenderObj;
	    String username;
	
	@RequestMapping(method = RequestMethod.GET)
	public String doSendEmail(HttpServletRequest request,
			HttpServletResponse response,Model model) throws ServletException, IOException {
		response.setContentType("text/html");
		String batchId=(String) request.getSession().getAttribute("batchId"); 
		String fileName= batchId+".txt";
		String filepath =ApplicationConstants.CONST_STRING_DOWNLOAD_FILE_PATH;
		File f = new File(filepath+ fileName);
		boolean flag=false;
		  if(f.exists()){
			  flag=true;
		  }
		  response.setContentType("APPLICATION/OCTET-STREAM");
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ fileName + "\"");
			int lineNum;
			try(PrintWriter out = response.getWriter();
					FileInputStream fileInputStream = new FileInputStream(ApplicationConstants.CONST_STRING_DOWNLOAD_FILE_PATH
					+ fileName)){
				while ((lineNum = fileInputStream.read()) != ApplicationConstants.CONST_NEGATIVE_NUMBER_ONE) {
					out.write(lineNum);
				}
			}catch (FileNotFoundException e) {
				_LOGGER.error("Error log file is not available");
			}
        return "success";    
			
	}
	
	public boolean sendMail(String supplierId,int batchId){
		String fileName= batchId+".txt";
		try {
				FileSystemResource  file = new FileSystemResource(ApplicationConstants.CONST_STRING_DOWNLOAD_FILE_PATH+ fileName);
		      MimeMessage mimeMessage = mailSenderObj.createMimeMessage();
		      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		      helper.setFrom(username);
		      helper.setTo(ApplicationConstants.SUPPLIER_EMAIL_ID_MAP.get(supplierId));
		      String[] bccs = {
		    		                "amey.more@a4technology.com"};
		      helper.setBcc(bccs);
		      helper.setSubject("Product Error Batch File");
		      helper.setText("Kindly find the attached " +batchId +".txt Product Error File"
		             + "\n\n\n\n Note: This is a System Generated Message Kindly Do not reply back");
		       helper.addAttachment(file.getFilename(), file);
			_LOGGER.info("Sending Email to "
					+ ApplicationConstants.SUPPLIER_EMAIL_ID_MAP.get(supplierId) + "," +
															   
					                                       "amey.more@a4technology.com");
		       mailSenderObj.send(mimeMessage);
		       _LOGGER.info("Mail Sent Successfully !!!");
		      } catch (javax.mail.MessagingException e) {
			    _LOGGER.error("Mail Not Sent Successfully,Error Msg:"+e.toString());
			    	return false;
			 }catch (Exception e) {
			   _LOGGER.error("Mail Not Sent Successfully,Error Msg:"+e.toString());
			     return false;
			}
		return true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JavaMailSender getMailSenderObj() {
		return mailSenderObj;
	}

	public void setMailSenderObj(JavaMailSender mailSenderObj) {
		this.mailSenderObj = mailSenderObj;
	}

}
