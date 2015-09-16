package cust.app.report;

import java.rmi.RemoteException;
import psdi.mbo.MboRemote;
import psdi.mbo.MboSet;
import psdi.mbo.MboSetRemote;
import psdi.util.MXException;

public class Report extends psdi.app.report.Report {
	public Report(MboSet ms) throws MXException, RemoteException {
		super(ms);
	}

	public String assembleRequestPage(MboRemote appfolder, MboSetRemote lookupset, int reportnum, String reporttype)
			throws MXException, RemoteException {
		return super.assembleRequestPage(appfolder, lookupset, reportnum, reporttype);
	}

	public String generateXML(MboRemote appfolder, MboSetRemote lookupset, String presentationXML)
			throws MXException, RemoteException {
		String dialogXML = super.generateXML(appfolder, lookupset, presentationXML);

		dialogXML = dialogXML.replace("psdi.webclient.beans.report.ReportDialogBean",
				"cust.webclient.beans.report.CustReportDialogBean");
		return dialogXML;
	}

	public String getBaseReportXML() throws MXException, RemoteException {
		String dialogXML = super.getBaseReportXML();
		dialogXML = dialogXML.replace("psdi.webclient.beans.report.ReportDialogBean",
				"cust.webclient.beans.report.CustReportDialogBean");
		return dialogXML;
	}
}