package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: loz  reason: default package */
/* loaded from: classes.dex */
class loz extends lkx implements Serializable {
    private static final long serialVersionUID = 3;
    final lpn a;
    final lpn b;
    final lep c;
    final int d;
    transient ConcurrentMap e;

    public loz(lpn lpnVar, lpn lpnVar2, lep lepVar, int i, ConcurrentMap concurrentMap) {
        this.a = lpnVar;
        this.b = lpnVar2;
        this.c = lepVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.lkx
    protected final ConcurrentMap a() {
        return this.e;
    }

    @Override // defpackage.lkx, defpackage.lky
    protected final /* synthetic */ Map b() {
        return this.e;
    }

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.e;
    }
}
