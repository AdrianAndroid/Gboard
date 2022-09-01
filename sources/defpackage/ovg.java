package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: ovg  reason: default package */
/* loaded from: classes2.dex */
public final class ovg {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ovg() {
        this.c = new our();
        this.d = new ove(this);
        this.e = new ovf(this);
    }

    public ovg(Context context, bwu bwuVar, SparseArray sparseArray) {
        this.a = false;
        this.b = false;
        this.c = context;
        this.e = bwuVar;
        this.d = sparseArray;
    }

    public static final void a() {
        hkp.b("undo_delete_toast", false);
    }
}
