package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: les  reason: default package */
/* loaded from: classes.dex */
public final class les extends Enum implements leq {
    public static final les a;
    private static final /* synthetic */ les[] b;

    static {
        les lesVar = new les();
        a = lesVar;
        b = new les[]{lesVar};
    }

    private les() {
    }

    public static les[] values() {
        return (les[]) b.clone();
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }
}
