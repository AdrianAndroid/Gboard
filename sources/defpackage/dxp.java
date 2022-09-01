package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dxp  reason: default package */
/* loaded from: classes.dex */
public final class dxp extends Enum implements ido {
    public static final dxp a;
    private static final /* synthetic */ dxp[] b;

    static {
        dxp dxpVar = new dxp();
        a = dxpVar;
        b = new dxp[]{dxpVar};
    }

    private dxp() {
    }

    public static dxp[] values() {
        return (dxp[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
