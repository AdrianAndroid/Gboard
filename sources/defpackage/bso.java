package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bso  reason: default package */
/* loaded from: classes.dex */
public final class bso extends jcb {
    final /* synthetic */ bsr a;

    public bso(bsr bsrVar) {
        this.a = bsrVar;
    }

    @Override // defpackage.jcb
    public final void a(boolean z) {
        bsr bsrVar = this.a;
        long j = bsrVar.a;
        long j2 = z ? j | 2199023255552L : (-2199023255553L) & j;
        bsrVar.a = j2;
        if (j2 != j) {
            bsrVar.c(2199023255552L, z);
        }
    }
}
