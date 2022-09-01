package defpackage;

/* compiled from: PG */
/* renamed from: ibw  reason: default package */
/* loaded from: classes.dex */
public final class ibw {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyboardGroupDef");
    public static final ibw b = new ibw();
    public final String c;
    public final int d;
    public final int[] e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final llw j;
    public final ick k;

    private ibw() {
        this.c = "";
        this.d = 0;
        this.f = 0;
        this.e = gvw.b;
        this.j = lrq.b;
        this.g = 0;
        this.h = false;
        this.i = true;
        this.k = ick.a;
    }

    public ibw(ibv ibvVar) {
        String str = ibvVar.a;
        this.c = str == null ? "" : str;
        this.d = ibvVar.b;
        this.f = ibvVar.e;
        this.j = llw.k(ibvVar.c);
        this.e = mhq.p(ibvVar.d);
        this.g = 0;
        this.h = ibvVar.f;
        this.i = ibvVar.g;
        icj icjVar = ibvVar.h;
        int size = icjVar.a.size();
        this.k = size > 0 ? new ick((jfn[]) icjVar.a.toArray(new jfn[size])) : ick.a;
    }

    public static ibv b() {
        return new ibv();
    }

    public final long a(ibz ibzVar) {
        ibo iboVar = (ibo) this.j.get(ibzVar);
        if (iboVar != null) {
            return iboVar.b;
        }
        return 0L;
    }

    public final boolean c(ibz ibzVar) {
        return this.j.containsKey(ibzVar);
    }

    public final int[] d(ibz ibzVar) {
        ibo iboVar = (ibo) this.j.get(ibzVar);
        if (iboVar != null) {
            return iboVar.c;
        }
        return null;
    }
}
