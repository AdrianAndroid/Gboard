package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lcn  reason: default package */
/* loaded from: classes.dex */
public final class lcn extends lch implements lck {
    static final lci a = new lcj();
    private final lci b = a;

    public lcn() {
        super("", lcm.a.b());
    }

    @Override // defpackage.lck
    public final lcx d(String str, lcs lcsVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = ldh.a;
        }
        return new lco(str, this, lcsVar, z);
    }

    @Override // defpackage.lck
    public final /* synthetic */ Exception e() {
        return this.b;
    }

    @Override // defpackage.lcx
    public final lcx f(String str, lcs lcsVar) {
        WeakHashMap weakHashMap = ldh.a;
        return d(str, lcsVar, true);
    }
}
