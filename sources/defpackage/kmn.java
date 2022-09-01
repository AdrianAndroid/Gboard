package defpackage;

/* compiled from: PG */
/* renamed from: kmn  reason: default package */
/* loaded from: classes.dex */
public final class kmn {
    public static final kmn a;
    public final boolean b;
    public final boolean c = false;
    public final llp d;

    static {
        llk e = llp.e();
        jdg.G(true, "A SourcePolicy can only set internal() or external() once.");
        a = ker.b(e, false);
        llk e2 = llp.e();
        jdg.G(true, "A SourcePolicy can only set internal() or external() once.");
        ker.b(e2, true);
    }

    public kmn(boolean z, llp llpVar) {
        this.b = z;
        this.d = llpVar;
    }
}
