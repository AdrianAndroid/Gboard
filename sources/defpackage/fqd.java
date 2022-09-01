package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: fqd  reason: default package */
/* loaded from: classes.dex */
public final class fqd extends an implements fpq {
    public static final WeakHashMap a = new WeakHashMap();
    public Bundle c;
    private final Map d = DesugarCollections.synchronizedMap(new qo());
    public int b = 0;

    @Override // defpackage.an
    public final void M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.M(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // defpackage.an
    public final void P(int i, int i2, Intent intent) {
        super.P(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.c(i, i2, intent);
        }
    }

    @Override // defpackage.an
    public final void R() {
        super.R();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // defpackage.an
    public final void U() {
        super.U();
        this.b = 3;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // defpackage.fpq
    public final /* synthetic */ Activity a() {
        return B();
    }

    @Override // defpackage.fpq
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    @Override // defpackage.fpq
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.b <= 0) {
                return;
            }
            new gco(Looper.getMainLooper()).post(new epv(this, lifecycleCallback, str, 9));
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // defpackage.an
    public final void h(Bundle bundle) {
        for (Map.Entry entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // defpackage.an
    public final void i() {
        super.i();
        this.b = 2;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // defpackage.an
    public final void j() {
        super.j();
        this.b = 4;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.j();
        }
    }
}
