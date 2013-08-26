package com.example.sodacloudsmsexampleclient;

import org.magnum.soda.proxy.ObjRef;

public class ExternalObjRefImpl implements ExternalObjRef {

	private final ObjRef mRef;
	private final String mHost;

	public ExternalObjRefImpl(final ObjRef ref, final String host) {
		mRef = ref;
		mHost = host;
	}

	@Override
	public ObjRef getObjRef() {
		return mRef;
	}

	@Override
	public String getPubSubHost() {
		return mHost;
	}

	/**
	 * The toString() implementation should return a String in the following
	 * format:
	 * 
	 * getPubSubHost()+"|"+getObjRef().getUri()
	 * 
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return getPubSubHost() + "|" + getObjRef().getUri();
	}

}
