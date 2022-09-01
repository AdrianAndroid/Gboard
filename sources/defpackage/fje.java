package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: fje  reason: default package */
/* loaded from: classes.dex */
public final class fje implements fjv, fjg, fjf, fjh {
    private fjn b;
    private final Context d;
    private final String f;
    private final fjx g;
    private final Set c = new CopyOnWriteArraySet();
    public final Set a = new CopyOnWriteArraySet();
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    private final fjd h = new fjd();

    public fje(nzv nzvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        nzvVar.c.getClass();
        this.d = ((Context) nzvVar.c).getApplicationContext();
        this.g = (fjx) nzvVar.b;
        Object obj = nzvVar.a;
        if (obj != null) {
            this.f = (String) obj;
            return;
        }
        throw new NullPointerException("serviceClassName must be specified");
    }

    @Override // defpackage.fjv
    public final fjn a() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        if (this.b == null) {
            this.b = new fjn(this.d.getApplicationContext(), this.f, this.h, this, this, this.e, this.g);
        }
        return this.b;
    }

    @Override // defpackage.fjf
    public final void b() {
        for (fjf fjfVar : this.a) {
            fjfVar.b();
        }
    }

    @Override // defpackage.fjg
    public final void c() {
        for (fjg fjgVar : this.c) {
            fjgVar.c();
        }
    }

    @Override // defpackage.fjv
    public final boolean d() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a().o();
    }

    @Override // defpackage.fjv
    public final dxe e() {
        return Build.VERSION.SDK_INT < 26 ? new dxe(this.d, (char[]) null) : new dxe(this.d, (char[]) null);
    }

    @Override // defpackage.fjv
    public final ijk f() {
        return new ijk(this.d, this.h);
    }
}
