package com.example.sodacloudsmsexampleclient;

import java.util.HashMap;
import java.util.Map;

public class ModuleImpl implements Module {

	private final Map<Class<?>, Object> mMapping = new HashMap<Class<?>, Object>();

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getComponent(Class<T> type) {
		// We are the only ones putting things into this map so we're guaranteed
		// type safety.
		return (T) mMapping.get(type);
	}

	@Override
	public <T> void setComponent(Class<T> type, T component) {
		mMapping.put(type, component);
	}

}
