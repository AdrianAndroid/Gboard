package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: hxs  reason: default package */
/* loaded from: classes.dex */
public final class hxs extends Enum implements ido {
    public static final hxs a;
    private static final /* synthetic */ hxs[] b;
    private final String c = "LanguageSelection.UIAction";

    static {
        hxs hxsVar = new hxs();
        a = hxsVar;
        b = new hxs[]{hxsVar};
    }

    private hxs() {
    }

    public static hxs[] values() {
        return (hxs[]) b.clone();
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
