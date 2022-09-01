package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: jfj  reason: default package */
/* loaded from: classes.dex */
final class jfj extends irm {
    final /* synthetic */ jfk a;

    public jfj(jfk jfkVar) {
        this.a = jfkVar;
    }

    @Override // defpackage.irm
    public final void d(String str) {
        jfk jfkVar = this.a;
        String g = jfk.g(str);
        if (!TextUtils.equals(jfkVar.d, g)) {
            jfkVar.d = g;
            jfkVar.e();
        }
    }
}
