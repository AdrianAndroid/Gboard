package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: odc  reason: default package */
/* loaded from: classes2.dex */
public final class odc extends nua {
    public final ntz a;
    final /* synthetic */ odd b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public odc(odd oddVar, ntz ntzVar) {
        this.b = oddVar;
        this.a = ntzVar;
    }

    @Override // defpackage.nua
    public final ntw a() {
        if (this.c.compareAndSet(false, true)) {
            ((obw) this.b.b).d.m.execute(new obv(this, 6));
        }
        return ntw.a;
    }
}
