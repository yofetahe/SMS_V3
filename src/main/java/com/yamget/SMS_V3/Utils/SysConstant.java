package com.yamget.SMS_V3.Utils;

public class SysConstant {
	
	public static final String ORGANIZATION_NAME = "XXX";
	
	public static final String SYS_NAME = "HRMS";
	
	public static final String MACADD_CONSTANT = "5C-26-0A-25-83-5A";
	public static final String MACADD_CONSTANT_2 = "DC-0E-A1-3A-31-4D";//gech pc
	public static final String MACADD_CONSTANT_3 = "F4-8E-38-94-A3-42";//installation pc
	public static final String MACADD_CONSTANT_4 = "70-C9-4E-D6-0E-60";//my laptop
	
	public static final String SECURITY_FILE_PATH = "C:/sms_file/";
	
	public static final String DATABASE_BACKUP_FOLDER = "C:\\hrms_file\\dbBackup\\";
	
	public static final String DATABASE_USERNAME = "root";
	
	//public static final String DATABASE_PASSWORD = "smsfi43L*13";
	public static final String DATABASE_PASSWORD = "P@55yamget";
	
	public static final String DATABASE_NAME = "hrms";
	
	public static final String HOST = "127.0.0.1";
	
	public static final String PORT = "8085";
	
	public static final String DUMP_EXE_PATH = "C:\\xampp\\mysql\\bin\\mysqldump.exe";
	
	public static final String ORGANIZATION_GMAIL_ACCOUNT = "tm.fright.tms@gmail.com";
	
	public static final String ORGANIZATION_GMAIL_ACCOUNT_PASSWORD = "tms@tilahun";
	
	public static final String ORGANIZATION_FULL_NAME = "EVESERT YOUTH ACADEMY";
	
	//public static final String CERT_PDF_PATH = "c:/tms_system_file/tilahun/temp/";
	//public static final String CERT_PDF_PATH = "\\resources\\files"; //System.getProperty("user.home") + "\\report_temp";
	//public static final String CERT_PDF_PATH = System.getProperty("user.home") + "\\report_temp";
	public static final String CERT_PDF_PATH = "C:/HRMS_Report/";
	
	public static final String ORGANIZATION_ADDRESS = "P.O.Box 21628 Tel. +251-11-367 9030/11-367-9066";
	
	public static final String ORGANIZATION_EMAIL = "";
	
	public static final String ORGANIZATION_LOCATION = "Alemgena, Ethiopia";
	
	public static final String MY_DOCUMENT_PATH = "";
	
	public static final String SYS_DEPLOYMENT_PATH = "C:\\apache-tomcat-7.0.40\\webapps\\TMS";
	
	public static final String SYS_DEVELOPMENT_PATH = "E:/eclipse_spring/TMS/WebContent";
	
	public static final String REPORT_NOTE_1 = "Collected Payment";
	
	public static final String REPORT_NOTE_2 = "Not Closed Freight Order";
	
	public static final String REPORT_NOTE_3 = "Daily Activity";
	
	public static final String REPORT_NOTE_5 = "Transaction history Per Truck";
	
	public static final String REPORT_NOTE_6 = "Payment not collected after request";
	
	public static final String REPORT_NOTE_7 = "Payment not collected before request";
	
	public static final String REPORT_NOTE_8 = "Revenue and Expense per Truck";
	
	public static final String REPORT_NOTE_9 = "Revenue and Expense per FON";
	
	public static final String REPORT_NOTE_10 = "Fright Order Registered Expense List";
	
	public static final String REPORT_NOTE_11 = "Payment Request Form";
	
	public static final String REPORT_NOTE_12 = "Return Form";
	
	public static final String REPORT_NOTE_13 = "Transfer Form";
	
	public static final String REPORT_NOTE_14 = "Addistional Payment Form";
	
	public static final String REPORT_NOTE_15 = "Coupon Dissemination Form";
	
	public static final String REPORT_TYPE_1 = "PDF";
	
	public static final String REPORT_TYPE_2 = "EXCEL";
	
	
	
	public static final int max_penality_day = 10;
	
	public static String[] ethiopian_months_am = new String[]{"áˆ˜áˆµáŠ¨áˆ¨áˆ�", "áŒ¥á‰…áˆ�á‰µ", "áŠ…á‹³áˆ­", "á‰³áˆ…áˆ£áˆ¥", "áŒ¥áˆ­", "á‹¨áŠ«á‰²á‰µ", "áˆ˜áŒ‹á‰¢á‰µ", "áˆšá‹«á‹�á‹«", "áŒ�áŠ•á‰¦á‰µ", "áˆ°áŠ”", "áˆ�áˆ�áˆŒ", "áŠ�áˆ�áˆ´"};

	public static String[] ethiopian_months_am_1 = new String[]{"áˆ˜áˆµáŠ¨áˆ¨áˆ�", "áŒ¥á‰…áˆ�á‰µ", "áŠ…á‹³áˆ­", "á‰³áˆ…áˆ£áˆ¥", "áŒ¥áˆ­", "á‹¨áŠ«á‰²á‰µ", "áˆ˜áŒ‹á‰¢á‰µ", "áˆšá‹«á‹�á‹«", "áŒ�áŠ•á‰¦á‰µ", "áˆ°áŠ”", "áˆ�áˆ�áˆŒ", "áŠ�áˆ�áˆ´", "áŒ³áŒ‰áˆœ"};
	
	public static String[] ethiopian_months_en = new String[]{"Meskerem", "Tikemet", "Hidar", "Tahesas", "Tir", "Yekatit", "Megabit", "Miazia", "Genbot", "Sene", "Hamle", "Nehase"};
	
	public static String[] ethiopian_months_en_1 = new String[]{"Meskerem", "Tikemet", "Hidar", "Tahesas", "Tir", "Yekatit", "Megabit", "Miazia", "Genbot", "Sene", "Hamle", "Nehase", "Puagme"};
	
	public static String[] grigorian_months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
}
