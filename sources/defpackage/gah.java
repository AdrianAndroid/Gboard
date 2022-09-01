package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* renamed from: gah  reason: default package */
/* loaded from: classes.dex */
public final class gah extends gak {
    private static CronetEngine a = null;
    private static boolean b = false;
    private static boolean c = false;
    private final Context d;

    public gah(Context context) {
        this.d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[Catch: all -> 0x0044, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0009, B:10:0x000b, B:13:0x000f, B:15:0x001b, B:17:0x001d, B:18:0x002d, B:23:0x0032, B:25:0x003b, B:26:0x0042), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final org.chromium.net.CronetEngine h(android.content.Context r4) {
        /*
            java.lang.Class<gah> r0 = defpackage.gah.class
            monitor-enter(r0)
            boolean r1 = defpackage.gah.b     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto Lb
            org.chromium.net.CronetEngine r4 = defpackage.gah.a     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r4
        Lb:
            r1 = 1
            defpackage.gah.b = r1     // Catch: java.lang.Throwable -> L44
            r1 = 0
            java.util.List r2 = org.chromium.net.CronetProvider.getAllProviders(r4)     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            dyv r3 = defpackage.dyv.h     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            boolean r2 = defpackage.lre.ah(r2, r3)     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            if (r2 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r1
        L1d:
            org.chromium.net.CronetEngine$Builder r2 = new org.chromium.net.CronetEngine$Builder     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            r2.<init>(r4)     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            boolean r4 = defpackage.gah.c     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            r2.mo80enableQuic(r4)     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            org.chromium.net.CronetEngine r4 = r2.mo76build()     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            defpackage.gah.a = r4     // Catch: java.lang.IllegalStateException -> L2f java.lang.UnsatisfiedLinkError -> L31 java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r4
        L2f:
            r4 = move-exception
            goto L32
        L31:
            r4 = move-exception
        L32:
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            r3 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L42
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            java.lang.String r3 = "failed to load Cronet engine"
            android.util.Log.w(r2, r3, r4)     // Catch: java.lang.Throwable -> L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r1
        L44:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gah.h(android.content.Context):org.chromium.net.CronetEngine");
    }

    @Override // defpackage.gal
    public final ftm b(String str) {
        try {
            CronetEngine h = h(this.d);
            if (h == null) {
                throw new RemoteException("failed to initialize CronetEngine");
            }
            return ftl.b((HttpURLConnection) h.openConnection(new URL(str)));
        } catch (IOException e) {
            throw new RemoteException("unexpected IOException: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.gal
    public final void c(boolean z) {
        synchronized (gah.class) {
            c = z;
        }
    }

    @Override // defpackage.gal
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gal
    public final boolean e() {
        return h(this.d) != null;
    }

    @Override // defpackage.gal
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gal
    public final boolean g() {
        return false;
    }
}
