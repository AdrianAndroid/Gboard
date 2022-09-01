package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: gsm  reason: default package */
/* loaded from: classes.dex */
public final class gsm extends Enum implements ids {
    public static final gsm a;
    private static final /* synthetic */ gsm[] b;
    private final String c = "AccessPoints.MoreAccessPointsShowing-time";

    static {
        gsm gsmVar = new gsm();
        a = gsmVar;
        b = new gsm[]{gsmVar};
    }

    private gsm() {
    }

    public static gsm[] values() {
        return (gsm[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.c;
    }
}
