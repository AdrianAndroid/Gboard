package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: jfl  reason: default package */
/* loaded from: classes.dex */
final class jfl extends irm {
    final /* synthetic */ jfm a;

    public jfl(jfm jfmVar) {
        this.a = jfmVar;
    }

    @Override // defpackage.irm
    public final void d(String str) {
        jfm jfmVar = this.a;
        String g = jfm.g(str);
        if (!TextUtils.equals(jfmVar.d, g)) {
            jfmVar.d = g;
            jfmVar.e();
        }
    }
}
