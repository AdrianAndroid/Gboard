package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: cux  reason: default package */
/* loaded from: classes.dex */
public final class cux implements cuw {
    private final llp a;
    private final leq b;
    private final leq c;

    public cux(llp llpVar, leq leqVar, leq leqVar2) {
        this.a = llpVar;
        this.b = leqVar;
        this.c = leqVar2;
    }

    @Override // defpackage.cuw
    public final int a(Object obj) {
        return ((Integer) this.c.a(obj)).intValue();
    }

    @Override // defpackage.cuw
    public final int b() {
        return ((lrl) this.a).c;
    }

    @Override // defpackage.cuw
    public final int c(Object obj) {
        return ((Integer) this.b.a(obj)).intValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [leq, java.lang.Object] */
    @Override // defpackage.cuw
    public final cum d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        krm krmVar = (krm) this.a.get(i);
        return (cum) krmVar.b.a(layoutInflater.inflate(krmVar.a, viewGroup, false));
    }
}
