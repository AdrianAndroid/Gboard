package defpackage;

/* compiled from: PG */
/* renamed from: nfl  reason: default package */
/* loaded from: classes2.dex */
public final class nfl implements Comparable {
    public final int a;
    public final nik b;
    final fgs d = null;
    final boolean c = false;

    public nfl(int i, nik nikVar) {
        this.a = i;
        this.b = nikVar;
    }

    public final nil a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((nfl) obj).a;
    }
}
