package defpackage;

/* compiled from: PG */
/* renamed from: aqd  reason: default package */
/* loaded from: classes.dex */
public final class aqd implements apr {
    public final ape a;
    public final ape b;
    public final ape c;
    public final boolean d;
    public final int e;

    public aqd(int i, ape apeVar, ape apeVar2, ape apeVar3, boolean z) {
        this.e = i;
        this.a = apeVar;
        this.b = apeVar2;
        this.c = apeVar3;
        this.d = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new aob(aqfVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "Trim Path: {start: " + valueOf + ", end: " + valueOf2 + ", offset: " + valueOf3 + "}";
    }
}
