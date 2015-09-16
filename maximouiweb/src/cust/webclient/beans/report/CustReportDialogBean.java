package cust.webclient.beans.report;

import java.rmi.RemoteException;
import java.sql.SQLException;

import psdi.util.MXException;
import psdi.util.logging.MXLogger;
import psdi.util.logging.MXLoggerFactory;

public class CustReportDialogBean extends psdi.webclient.beans.report.ReportDialogBean {
	
	private MXLogger log = MXLoggerFactory.getLogger("maximo.report");

	@Override
	public int displayRequestDialog(String arg0) throws MXException, RemoteException {
		log.info("displayRequestDialog-");
		return super.displayRequestDialog(arg0);
	}

	@Override
	public void initialize() throws MXException, RemoteException {
		log.info("initialize-");
		super.initialize();
	}

	@Override
	public int requestreportrun() throws MXException, RemoteException, SQLException {
		log.info("requestreportrun-");
		return super.requestreportrun();
	}

	@Override
	public int runrequestpage() throws MXException, RemoteException {
		log.info("runrequestpage-");
		return super.runrequestpage();
	}
		
}