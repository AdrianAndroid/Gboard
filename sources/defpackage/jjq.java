package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* renamed from: jjq  reason: default package */
/* loaded from: classes.dex */
public final class jjq implements lgb {
    final /* synthetic */ Executor a;
    final /* synthetic */ nox b;
    final /* synthetic */ Context c;
    final /* synthetic */ lfb d;
    final /* synthetic */ kcq e;

    public jjq(Executor executor, nox noxVar, Context context, lfb lfbVar, kcq kcqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = executor;
        this.b = noxVar;
        this.c = context;
        this.d = lfbVar;
        this.e = kcqVar;
    }

    @Override // defpackage.lgb
    /* renamed from: b */
    public final jjk a() {
        jjp jjpVar = new jjp(this.a);
        CronetEngine a = ((iip) this.b).a();
        Objects.requireNonNull(a);
        kaw kawVar = new kaw(new kaj(new opu(a), null, null), this.c, jjpVar);
        kawVar.i((kau) ((lfm) this.d).a);
        return new jjo(this.c, kawVar, this.e, null, null, null);
    }
}
