package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nyk  reason: default package */
/* loaded from: classes2.dex */
public final class nyk {
    static final Logger a = Logger.getLogger(nsc.class.getName());
    public final Object b = new Object();
    public final ntm c;

    public nyk(ntm ntmVar, long j, String str) {
        jdg.Q(ntmVar, "logId");
        this.c = ntmVar;
        ntf ntfVar = new ntf();
        ntfVar.a = str.concat(" created");
        ntfVar.b = ntg.CT_INFO;
        ntfVar.b(j);
        b(ntfVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ntm ntmVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + ntmVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(nth nthVar) {
        Level level;
        ntg ntgVar = ntg.CT_UNKNOWN;
        int ordinal = nthVar.b.ordinal();
        if (ordinal != 2) {
            level = ordinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, nthVar.a);
    }
}
