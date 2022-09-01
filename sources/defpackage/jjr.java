package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jjr  reason: default package */
/* loaded from: classes.dex */
public final class jjr implements lgb {
    final /* synthetic */ Executor a;
    final /* synthetic */ Context b;
    final /* synthetic */ lfb c;
    final /* synthetic */ kcq d;

    public jjr(Executor executor, Context context, lfb lfbVar, kcq kcqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = executor;
        this.b = context;
        this.c = lfbVar;
        this.d = kcqVar;
    }

    @Override // defpackage.lgb
    /* renamed from: b */
    public final jjk a() {
        oqc oqcVar = new oqc();
        oqcVar.b(jjs.a, TimeUnit.MILLISECONDS);
        oqcVar.c(jjs.b, TimeUnit.MILLISECONDS);
        oqcVar.d(jjs.c, TimeUnit.MILLISECONDS);
        oqcVar.t = true;
        kaw kawVar = new kaw(new kay(oqcVar.a()), this.b, new jjp(this.a));
        kawVar.i((kau) ((lfm) this.c).a);
        return new jjo(this.b, kawVar, this.d, null, null, null);
    }
}
