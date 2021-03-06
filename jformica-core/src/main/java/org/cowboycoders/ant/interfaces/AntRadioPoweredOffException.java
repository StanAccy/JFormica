/**
 * Copyright (c) 2013, Will Szumski
 * <p>
 * This file is part of formicidae.
 * <p>
 * formicidae is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * formicidae is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with formicidae.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 */
package org.cowboycoders.ant.interfaces;

/**
 * @author will
 *
 */
public class AntRadioPoweredOffException extends AntCommunicationException
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public AntRadioPoweredOffException()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage to document
	 */
	public AntRadioPoweredOffException( String detailMessage )
	{
		super( detailMessage );
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param throwable to document
	 */
	public AntRadioPoweredOffException( Throwable throwable )
	{
		super( throwable );
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage to document
	 * @param throwable to document
	 */
	public AntRadioPoweredOffException( String detailMessage, Throwable throwable )
	{
		super( detailMessage, throwable );
		// TODO Auto-generated constructor stub
	}

}
