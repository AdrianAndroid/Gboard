package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: hyi  reason: default package */
/* loaded from: classes.dex */
public final class hyi extends Enum implements ido {
    public static final hyi a;
    public static final hyi b;
    public static final hyi c;
    public static final hyi d;
    public static final hyi e;
    private static final /* synthetic */ hyi[] f;
    private final String g;

    static {
        hyi hyiVar = new hyi();
        a = hyiVar;
        hyi hyiVar2 = new hyi("CRASH_IN_FLAG_SAFE_MODE", 1, "CrashProtector.InFlagSafeMode");
        b = hyiVar2;
        hyi hyiVar3 = new hyi("JAVA_CRASH", 2, "CrashProtector.JavaCrash");
        c = hyiVar3;
        hyi hyiVar4 = new hyi("CRASH_RECOVERY_MODE", 3, "CrashProtector.Recovery");
        d = hyiVar4;
        hyi hyiVar5 = new hyi("CLEAR_CACHE_DIR", 4, "Crash.ClearCache");
        e = hyiVar5;
        f = new hyi[]{hyiVar, hyiVar2, hyiVar3, hyiVar4, hyiVar5};
    }

    private hyi() {
        this.g = "";
    }

    public static hyi[] values() {
        return (hyi[]) f.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.g;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private hyi(String str, int i, String str2) {
        this.g = str2;
    }
}
