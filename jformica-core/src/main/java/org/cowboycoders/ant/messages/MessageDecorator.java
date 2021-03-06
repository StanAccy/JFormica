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
package org.cowboycoders.ant.messages;

/**
 * Standard interface for all org.cowboycoders.ant message decorators.
 * The standard is wrap all ant messages, so this allows us to recover 
 * the original.
 *
 * @author will
 *
 */
public interface MessageDecorator
{

	/**
	 * Returns the <code>Message</code> class doing the leg work.
	 * This can be one of:
	 * Message -for standard ant messages,
	 * LegacyMessage - for legacy extended messages
	 * ExtendedMessage -for extended messages
	 *
	 * These classes can provide additional functionality.
	 *
	 * @return the message used as the backend
	 */
	public Message getBackendMessage();

}
