package com.google.android.apps.inputmethod.libs.trainingcache.examplestoreservice;

import java.util.concurrent.Executor;

/* compiled from: PG */
@hjj
/* loaded from: classes.dex */
public class ExampleStoreServiceMultiplexer extends fwj {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/examplestoreservice/ExampleStoreServiceMultiplexer");
    private Executor b;
    private itn c;
    private myz d;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.fwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final java.lang.String r16, final byte[] r17, final byte[] r18, defpackage.fwi r19, defpackage.mzg r20) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.trainingcache.examplestoreservice.ExampleStoreServiceMultiplexer.a(java.lang.String, byte[], byte[], fwi, mzg):void");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = gxo.a(9);
        this.d = new myz(this.b);
        itn e = ((Boolean) itm.c.c()).booleanValue() ? its.e() : null;
        this.c = e;
        if (e != null) {
            e.a();
        }
    }

    @Override // defpackage.fwj, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        itn itnVar = this.c;
        if (itnVar != null) {
            itnVar.b();
            this.c = null;
        }
    }
}
