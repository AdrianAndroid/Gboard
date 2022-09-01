package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oso  reason: default package */
/* loaded from: classes2.dex */
public final class oso extends oqq {
    final /* synthetic */ int a;
    final /* synthetic */ osz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oso(osz oszVar, Object[] objArr, int i) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.c = oszVar;
        this.a = i;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.c.p.h(this.a, 9);
            synchronized (this.c) {
                this.c.r.remove(Integer.valueOf(this.a));
            }
        } catch (IOException unused) {
        }
    }
}
