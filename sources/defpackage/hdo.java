package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: hdo  reason: default package */
/* loaded from: classes.dex */
public final class hdo extends Enum implements ido {
    public static final hdo a;
    private static final /* synthetic */ hdo[] b;

    static {
        hdo hdoVar = new hdo();
        a = hdoVar;
        b = new hdo[]{hdoVar};
    }

    private hdo() {
    }

    public static hdo[] values() {
        return (hdo[]) b.clone();
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
