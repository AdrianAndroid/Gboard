package defpackage;

/* compiled from: PG */
/* renamed from: hyj  reason: default package */
/* loaded from: classes.dex */
public enum hyj implements ids {
    INIT("CrashProtector.Init"),
    INIT_ON_VERSION_CHANGE("CrashProtector.InitOnVersionChange"),
    READ_DATA("CrashProtector.ReadData"),
    READ_NATIVE_ANR("CrashProtector.ReadNativeAnr"),
    SAVE_NATIVE_CRASH("CrashProtector.SaveNativeCrash");
    
    private final String g;
    private final int h = 1000;

    hyj(String str) {
        this.g = str;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.h;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.g;
    }
}
