package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsc  reason: default package */
/* loaded from: classes.dex */
public final class dsc extends lym {
    final /* synthetic */ dsd a;

    public dsc(dsd dsdVar) {
        this.a = dsdVar;
    }

    @Override // defpackage.lym
    public final InputStream a() {
        return this.a.b.getAssets().open("mozc.data", 2);
    }
}
