package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osx  reason: default package */
/* loaded from: classes2.dex */
public final class osx extends oqq {
    final /* synthetic */ otj a;
    final /* synthetic */ osy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osx(osy osyVar, Object[] objArr, otj otjVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.c = osyVar;
        this.a = otjVar;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.c.c.p.a(this.a);
        } catch (IOException unused) {
            this.c.c.d();
        }
    }
}
