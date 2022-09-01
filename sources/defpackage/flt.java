package defpackage;

/* compiled from: PG */
/* renamed from: flt  reason: default package */
/* loaded from: classes.dex */
public final class flt {
    protected final int a;

    public flt(int i) {
        if (i > 0) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("bad alias: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flt) && this.a == ((flt) obj).a;
    }
}
