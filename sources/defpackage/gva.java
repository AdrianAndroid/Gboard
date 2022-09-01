package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: gva  reason: default package */
/* loaded from: classes.dex */
public final class gva implements ijh {
    public static final ltg a = ltg.i();
    public final int b;
    public final long c;
    public final boolean d;

    public gva(int i, long j, boolean z) {
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public static final int b() {
        gva m = gwc.m();
        if (m != null) {
            return m.b;
        }
        return 0;
    }

    public static final long c() {
        gva m = gwc.m();
        if (m != null) {
            return m.c;
        }
        return -1L;
    }

    public static final boolean d() {
        gva m = gwc.m();
        if (m != null) {
            return m.d;
        }
        return true;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
        jco.f(this, printer);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
