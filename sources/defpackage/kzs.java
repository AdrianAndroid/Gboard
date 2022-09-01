package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: kzs  reason: default package */
/* loaded from: classes.dex */
final class kzs implements kzx {
    final /* synthetic */ kzt a;

    public kzs(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // defpackage.kzx
    public final void a(jma jmaVar, File file, boolean z) {
        this.a.b.add(file);
        if (!z) {
            this.a.c.set(false);
        }
    }
}
