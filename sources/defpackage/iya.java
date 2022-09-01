package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: iya  reason: default package */
/* loaded from: classes.dex */
public final class iya extends Enum implements ids {
    public static final iya a;
    private static final /* synthetic */ iya[] b;
    private final String c = "TPT.Kill.Latency";

    static {
        iya iyaVar = new iya();
        a = iyaVar;
        b = new iya[]{iyaVar};
    }

    private iya() {
    }

    public static iya[] values() {
        return (iya[]) b.clone();
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
