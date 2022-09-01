package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: cno  reason: default package */
/* loaded from: classes.dex */
public final class cno extends hqi {
    public final /* synthetic */ cny a;

    public cno(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // defpackage.hqi
    public final void a(hpy hpyVar) {
        cny cnyVar = this.a;
        String str = cnyVar.q;
        if (str == null) {
            cnyVar.q = hpyVar.c.toString();
        } else if (TextUtils.equals(str, hpyVar.c.toString()) && !hpyVar.f()) {
        } else {
            kki.j(new cbq(this, 17));
        }
    }
}
