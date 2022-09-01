package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: jff  reason: default package */
/* loaded from: classes.dex */
public final class jff extends jfe implements hhk {
    private final String a;
    private final hhl d;
    private volatile boolean e;

    public jff(Context context, int i) {
        super(i);
        hhl c = hhq.c(context, i);
        this.d = c;
        this.a = ((hhr) c).a;
        c();
        c.e(this);
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jfi(this.a, this.e);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        boolean booleanValue = ((Boolean) this.d.c()).booleanValue();
        if (this.e != booleanValue) {
            this.e = booleanValue;
            return true;
        }
        return false;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (c()) {
            e();
        }
    }
}
