package defpackage;

/* compiled from: PG */
/* renamed from: apw  reason: default package */
/* loaded from: classes.dex */
public final class apw implements apr {
    public final String a;
    public final apo b;
    public final apo c;
    public final ape d;
    public final boolean e;

    public apw(String str, apo apoVar, apo apoVar2, ape apeVar, boolean z) {
        this.a = str;
        this.b = apoVar;
        this.c = apoVar2;
        this.d = apeVar;
        this.e = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new anx(amyVar, aqfVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "RectangleShape{position=" + valueOf + ", size=" + valueOf2 + "}";
    }
}
