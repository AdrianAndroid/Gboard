package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: dgx  reason: default package */
/* loaded from: classes.dex */
final class dgx extends gxu {
    final /* synthetic */ List a;
    final /* synthetic */ int[] b;
    final /* synthetic */ dgy c;
    final /* synthetic */ kcq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgx(dgy dgyVar, kcq kcqVar, List list, int[] iArr, byte[] bArr, byte[] bArr2) {
        super("RecognitionResults");
        this.c = dgyVar;
        this.d = kcqVar;
        this.a = list;
        this.b = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((AtomicBoolean) this.d.c).get()) {
            this.c.a.j.n(this.a, this.b, (gpq) this.d.b);
            ((AtomicBoolean) this.d.a).set(true);
        }
    }
}
