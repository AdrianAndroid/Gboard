package defpackage;

/* compiled from: PG */
/* renamed from: dzq  reason: default package */
/* loaded from: classes.dex */
public abstract class dzq {
    public static dzq e(dzp dzpVar) {
        dzo dzoVar = dzo.PRIMARY_EMOJI_QUERY;
        int ordinal = dzpVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dzpVar.getClass();
                return new dza(dzpVar);
            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                throw new AssertionError("Exhaustive switch");
            }
        }
        dzpVar.getClass();
        return new dze(dzpVar);
    }

    public abstract dzp a();

    public abstract int b();

    public abstract ead c();

    public abstract dzp d();
}
