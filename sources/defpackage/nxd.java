package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: nxd  reason: default package */
/* loaded from: classes2.dex */
final class nxd extends nxf {
    private final oei c;

    public nxd(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.c = new oei(executor);
    }

    @Override // defpackage.nxf
    public final void a(int i, nxj nxjVar) {
        this.c.execute(new ov(this, i, nxjVar.a(), 16));
        nxjVar.b();
    }
}
