package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: mho  reason: default package */
/* loaded from: classes.dex */
public final class mho extends Enum implements mhp {
    public static final mho a;
    private static final /* synthetic */ mho[] b;

    static {
        mho mhoVar = new mho();
        a = mhoVar;
        b = new mho[]{mhoVar};
    }

    private mho() {
    }

    public static mho[] values() {
        return (mho[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
