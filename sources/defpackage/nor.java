package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nor  reason: default package */
/* loaded from: classes2.dex */
final class nor implements nov {
    final /* synthetic */ nos a;

    public nor(nos nosVar) {
        this.a = nosVar;
    }

    @Override // defpackage.nov
    public final void a(InputStream inputStream, int i) {
        nos nosVar = this.a;
        if (nosVar.a) {
            nosVar.a = false;
        } else {
            ((StringBuilder) nosVar.b).append(", ");
        }
        ((StringBuilder) nosVar.b).append(i);
    }
}
