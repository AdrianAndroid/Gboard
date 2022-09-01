package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ovo  reason: default package */
/* loaded from: classes2.dex */
public final class ovo extends oup {
    private final Socket a;

    public ovo(Socket socket) {
        oll.e(socket, "socket");
        this.a = socket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oup
    public final void a() {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (ovb.h(e)) {
                Logger logger = ovb.a;
                Level level = Level.WARNING;
                Socket socket = this.a;
                new StringBuilder("Failed to close timed out socket ").append(socket);
                logger.log(level, "Failed to close timed out socket ".concat(String.valueOf(socket)), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = ovb.a;
            Level level2 = Level.WARNING;
            Socket socket2 = this.a;
            new StringBuilder("Failed to close timed out socket ").append(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(String.valueOf(socket2)), (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oup
    public final IOException d(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
