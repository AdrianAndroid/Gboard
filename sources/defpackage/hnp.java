package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: hnp  reason: default package */
/* loaded from: classes.dex */
public final class hnp extends Enum implements ido {
    public static final hnp a;
    private static final /* synthetic */ hnp[] b;
    private final String c = "Input.incognitoModeRequested";

    static {
        hnp hnpVar = new hnp();
        a = hnpVar;
        b = new hnp[]{hnpVar};
    }

    private hnp() {
    }

    public static hnp[] values() {
        return (hnp[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
