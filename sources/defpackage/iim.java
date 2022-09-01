package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: iim  reason: default package */
/* loaded from: classes.dex */
public final class iim extends Enum implements ids {
    public static final iim a;
    private static final /* synthetic */ iim[] b;
    private final String c = "Network.Cronet.EngineInit.Latency";

    static {
        iim iimVar = new iim();
        a = iimVar;
        b = new iim[]{iimVar};
    }

    private iim() {
    }

    public static iim[] values() {
        return (iim[]) b.clone();
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
