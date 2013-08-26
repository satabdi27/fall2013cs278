package com.example.sodacloudsmsexampleclient;

import org.magnum.soda.example.sms.SMSManager;
import org.magnum.soda.example.sms.SMSManagerImpl;

import android.content.Context;

public class ModuleFactory {

	public static Module makeDefaultModule(final Context context) {
		final Module module = new ModuleImpl();
		module.setComponent(SMSManager.class, new SMSManagerImpl(context));
		module.setComponent(ObjRefExtractor.class, new QRCodeObjRefExtractor());
		return module;
	}

}
