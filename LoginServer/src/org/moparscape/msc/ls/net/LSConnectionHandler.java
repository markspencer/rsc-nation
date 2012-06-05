package org.rscnation.msc.ls.net;

import org.apache.mina.common.IdleStatus;
import org.apache.mina.common.IoHandler;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.rscnation.msc.ls.LoginEngine;
import org.rscnation.msc.ls.Server;
import org.rscnation.msc.ls.codec.LSCodecFactory;
import org.rscnation.msc.ls.model.World;


/**
 * Handles the protocol events fired from MINA.
 */
public class LSConnectionHandler implements IoHandler {
    /**
     * A reference to the login engine
     */
    private LoginEngine engine;

    /**
     * Creates a new connection handler for the given login engine.
     * 
     * @param engine
     *            The engine in use
     */
    public LSConnectionHandler(LoginEngine engine) {
	this.engine = engine;
    }

    /**
     * Invoked whenever an exception is thrown by MINA or this IoHandler.
     * 
     * @param session
     *            The associated session
     * @param cause
     *            The exception thrown
     */
    public void exceptionCaught(IoSession session, Throwable cause) {
    }

    /**
     * Invoked whenever a packet is ready to be added to the queue.
     * 
     * @param session
     *            The IO session on which the packet was received
     * @param message
     *            The packet
     */
    public void messageReceived(IoSession session, Object message) {
	if (session.isClosing()) {
	    return;
	}
	engine.getLSPacketQueue().add((LSPacket) message);
    }

    /**
     * Invoked whenever a packet is sent.
     * 
     * @param session
     *            The associated session
     * @param message
     *            The packet sent
     */
    public void messageSent(IoSession session, Object message) {
    }

    /**
     * Invoked whenever an IO session is closed. This must handle unregistering
     * the disconnecting world from the engine.
     * 
     * @param session
     *            The IO session which has been closed
     */
    public void sessionClosed(IoSession session) {
	World world = (World) session.getAttachment();
	if (world != null) {
	    Server.getServer().setIdle(world, true);
	    world.clearPlayers();
	    Server.error("Connection to world " + world.getID() + " lost!");
	}
    }

    /**
     * Invoked whenever an IO session is created.
     * 
     * @param session
     *            The session opened
     */
    public void sessionCreated(IoSession session) {
	session.getFilterChain().addFirst("protocolFilter", new ProtocolCodecFilter(new LSCodecFactory()));
	// Logging.debug("Connection from: " +
	// ((InetSocketAddress)session.getRemoteAddress()).getAddress().getHostAddress());
    }

    /**
     * Invoked when the idle status of a session changes.
     * 
     * @param session
     *            The session in question
     * @param status
     *            The new idle status
     */
    public void sessionIdle(IoSession session, IdleStatus status) {
    }

    /**
     * Invoked when a new session is opened.
     * 
     * @param session
     *            The session opened
     */
    public void sessionOpened(IoSession session) {
    }
}
