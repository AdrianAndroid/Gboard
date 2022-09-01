package defpackage;

/* compiled from: PG */
/* renamed from: igs  reason: default package */
/* loaded from: classes.dex */
public enum igs implements ids {
    INIT_MODULES("ModuleManager.InitModules-time"),
    WAIT_BEFORE_INIT_MODULES("ModuleManager.WaitBeforeInitModules-time");
    
    private final String d;

    igs(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }
}
