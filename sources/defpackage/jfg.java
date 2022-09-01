package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: jfg  reason: default package */
/* loaded from: classes.dex */
public final class jfg extends jfe implements inm {
    private final String a;
    private final ino d;
    private volatile boolean e;

    public jfg(Context context, int i, ino inoVar) {
        super(i);
        this.a = TextUtils.isEmpty(null) ? context.getResources().getString(i) : null;
        this.d = inoVar;
        c();
        inoVar.X(this, i);
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jfi(this.a, this.e);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        boolean aj = this.d.aj(this.b);
        if (aj != this.e) {
            this.e = aj;
            return true;
        }
        return false;
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (c()) {
            e();
        }
    }
}
