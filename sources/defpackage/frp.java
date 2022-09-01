package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: frp  reason: default package */
/* loaded from: classes.dex */
public final class frp implements foe {
    final /* synthetic */ fof a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public frp(fof fofVar, fxa fxaVar, int i, byte[] bArr) {
        this.c = i;
        this.a = fofVar;
        this.b = fxaVar;
    }

    public frp(ijk ijkVar, BasePendingResult basePendingResult, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.b = ijkVar;
        this.a = basePendingResult;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.foe
    public final void a(Status status) {
        if (this.c == 0) {
            if (status.a()) {
                this.a.e(TimeUnit.MILLISECONDS);
                ((fxa) this.b).d(null);
                return;
            }
            ((fxa) this.b).c(fyb.aM(status));
            return;
        }
        ((ijk) this.b).b.remove(this.a);
    }
}
