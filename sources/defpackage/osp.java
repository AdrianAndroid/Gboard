package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osp  reason: default package */
/* loaded from: classes2.dex */
public final class osp extends oqq {
    final /* synthetic */ int a;
    final /* synthetic */ our c;
    final /* synthetic */ int d;
    final /* synthetic */ osz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osp(osz oszVar, Object[] objArr, int i, our ourVar, int i2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.e = oszVar;
        this.a = i;
        this.c = ourVar;
        this.d = i2;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.c.B(this.d);
            this.e.p.h(this.a, 9);
            synchronized (this.e) {
                this.e.r.remove(Integer.valueOf(this.a));
            }
        } catch (IOException unused) {
        }
    }
}
