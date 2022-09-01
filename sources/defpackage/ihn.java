package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ihn  reason: default package */
/* loaded from: classes.dex */
public final class ihn extends Enum implements ids {
    public static final ihn a;
    private static final /* synthetic */ ihn[] b;
    private final String c = "NativeLib.integratedSharedObjectLoad-time";

    static {
        ihn ihnVar = new ihn();
        a = ihnVar;
        b = new ihn[]{ihnVar};
    }

    private ihn() {
    }

    public static ihn[] values() {
        return (ihn[]) b.clone();
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
