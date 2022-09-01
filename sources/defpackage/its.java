package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: its  reason: default package */
/* loaded from: classes.dex */
public final class its implements itn {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerManager");
    private static final hhl e = hhq.a("materializer_manager_use_dedicated_executor", false);
    public final Executor b;
    public mko c;
    public final ConcurrentHashMap d;
    private final Context f;
    private int g;

    public its(Context context) {
        mks c;
        if (((Boolean) e.c()).booleanValue()) {
            c = gxp.a().f("Materializer", 10);
        } else {
            c = gxo.c(10);
        }
        this.g = 0;
        this.d = new ConcurrentHashMap();
        this.f = context;
        this.b = c;
    }

    public static itn e() {
        return itr.a;
    }

    @Override // defpackage.itn
    public final synchronized void a() {
        if (this.g == 0) {
            this.c = iwy.a.b();
        }
        this.g++;
    }

    @Override // defpackage.itn
    public final synchronized void b() {
        mko mkoVar;
        int i = this.g;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.g = i2;
        if (i2 != 0 || (mkoVar = this.c) == null) {
            return;
        }
        kcu.U(mio.g(mkoVar, hwy.m, this.b), new cbx(19), this.b);
        this.c = null;
        this.d.clear();
    }

    @Override // defpackage.itn
    public final synchronized boolean c() {
        return this.c != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7 A[Catch: all -> 0x0148, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0004, B:8:0x00ba, B:12:0x00d7, B:14:0x00db, B:16:0x00e7, B:17:0x00fe, B:20:0x00ea, B:21:0x012b, B:24:0x0022, B:25:0x0030, B:27:0x0036, B:29:0x004a, B:32:0x0050, B:34:0x005c, B:36:0x0072, B:38:0x007a, B:45:0x007d, B:48:0x0084, B:50:0x008a, B:52:0x0092), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ba A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:8:0x00ba, B:12:0x00d7, B:14:0x00db, B:16:0x00e7, B:17:0x00fe, B:20:0x00ea, B:21:0x012b, B:24:0x0022, B:25:0x0030, B:27:0x0036, B:29:0x004a, B:32:0x0050, B:34:0x005c, B:36:0x0072, B:38:0x007a, B:45:0x007d, B:48:0x0084, B:50:0x008a, B:52:0x0092), top: B:3:0x0004 }] */
    @Override // defpackage.itn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d(java.lang.String r16, byte[] r17, byte[] r18, defpackage.fwi r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.its.d(java.lang.String, byte[], byte[], fwi):boolean");
    }
}
