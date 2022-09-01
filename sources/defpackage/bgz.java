package defpackage;

/* compiled from: PG */
/* renamed from: bgz  reason: default package */
/* loaded from: classes.dex */
public final class bgz {
    public static final bgz a = new bgz(bgy.None, 0);
    public static final bgz b = new bgz(bgy.XMidYMid, 1);
    public final bgy c;
    public final int d;

    public bgz(bgy bgyVar, int i) {
        this.c = bgyVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgz bgzVar = (bgz) obj;
        return this.c == bgzVar.c && this.d == bgzVar.d;
    }
}
