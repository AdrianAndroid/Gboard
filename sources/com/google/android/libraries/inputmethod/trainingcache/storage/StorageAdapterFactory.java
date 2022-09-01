package com.google.android.libraries.inputmethod.trainingcache.storage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StorageAdapterFactory implements iww {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapterFactory");
    public final ScheduledExecutorService b;
    public final Context c;
    private mko d;
    private mko e;
    private int f = 0;
    public volatile ixb listenerHolder;

    public StorageAdapterFactory(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = context;
        this.b = scheduledExecutorService;
    }

    private final synchronized mko d() {
        if (this.e == null) {
            this.e = mio.g(c(), new iul(this, 7), this.b);
        }
        return this.e;
    }

    @Override // defpackage.iww
    public final synchronized void a() {
        mko mkoVar;
        int i = this.f;
        if (i == 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapterFactory", "onClose", 190, "StorageAdapterFactory.java")).t("refCount is already 0, ProtoXDB has already been closed");
            return;
        }
        int i2 = i - 1;
        this.f = i2;
        if (i2 != 0 || (mkoVar = this.e) == null) {
            return;
        }
        kcu.U(mio.g(mkoVar, iuu.j, this.b), new ivq(11), this.b);
        this.e = null;
    }

    public final synchronized mko b() {
        mko L;
        mko L2;
        L = kcu.L(c());
        L2 = kcu.L(d());
        this.f++;
        return kcu.Z(L, L2).a(new cak(this, L, L2, 15), this.b);
    }

    final synchronized mko c() {
        if (this.d == null) {
            this.d = iq.b(new dts(this, 4));
        }
        return this.d;
    }
}
