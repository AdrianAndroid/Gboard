package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: jfh  reason: default package */
/* loaded from: classes.dex */
public final class jfh extends jfe {
    private final String a;
    private final Context d;
    private final int e;
    private boolean f;

    public jfh(Context context, int i) {
        super(i);
        this.d = context;
        this.a = context.getResources().getResourceEntryName(i);
        this.e = i;
        c();
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return new jfi(this.a, this.f);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        boolean B = jbt.B(this.d, this.e, false);
        if (this.f != B) {
            this.f = B;
            return true;
        }
        return false;
    }
}
