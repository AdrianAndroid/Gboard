package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: dsd  reason: default package */
/* loaded from: classes.dex */
public final class dsd implements dse {
    private static final lug c = hin.a;
    private static final ijk e = new ijk(new jbf(1));
    public Future a = null;
    public final Context b;
    private final File d;

    public dsd(Context context) {
        jdg.u(context);
        this.b = context;
        gwg a = gwj.a(context, "mozc_data_file");
        a.b();
        a.d();
        this.d = a.a().b;
    }

    public static dsd a(Context context) {
        return (dsd) e.i((Context) jdg.U(context.getApplicationContext(), context));
    }

    private static List e(File[] fileArr) {
        return fileArr == null ? Collections.emptyList() : Arrays.asList(fileArr);
    }

    @Override // defpackage.dse
    public final File b() {
        return new File(this.d, "mozc.data");
    }

    @Override // defpackage.dse
    public final synchronized void c() {
        if (this.a != null) {
            return;
        }
        this.a = Executors.newSingleThreadExecutor().submit(new aty(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4 A[Catch: all -> 0x01fb, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x000c, B:12:0x0024, B:16:0x00d4, B:18:0x00de, B:19:0x00e2, B:21:0x011b, B:23:0x0123, B:25:0x0141, B:28:0x0144, B:29:0x0148, B:31:0x014e, B:33:0x015b, B:36:0x0164, B:39:0x016e, B:43:0x0191, B:46:0x01b3, B:49:0x01d2, B:53:0x0048, B:57:0x005f, B:59:0x0065, B:60:0x0085, B:62:0x0094, B:63:0x00b4, B:65:0x0056), top: B:2:0x0001, inners: #1, #2 }] */
    @Override // defpackage.dse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsd.d():boolean");
    }
}
