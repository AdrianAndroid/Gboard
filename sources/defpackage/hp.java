package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hp  reason: default package */
/* loaded from: classes.dex */
public final class hp extends ko {
    final /* synthetic */ hq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(hq hqVar, View view) {
        super(view);
        this.a = hqVar;
    }

    @Override // defpackage.ko
    public final hd a() {
        hr hrVar = this.a.a.i;
        if (hrVar == null) {
            return null;
        }
        return hrVar.a();
    }

    @Override // defpackage.ko
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.ko
    public final boolean c() {
        hs hsVar = this.a.a;
        if (hsVar.k != null) {
            return false;
        }
        hsVar.k();
        return true;
    }
}
