package com.example.etracker.utils;

public interface PathRoutes {

	public interface SearchSQL{
			
		final String SEARCHSQL_ROOT = "/mentor/wishes";
		
		final String RETRIEVE_WISH = "/share-wishes";
		final String ALL_POST = "/all-post";
		final String INSERT_WISH = "/insert-wishes";
		final String DELETE_POST = "/delete-post";

	}
}