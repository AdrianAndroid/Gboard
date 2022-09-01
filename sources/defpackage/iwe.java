package defpackage;

/* compiled from: PG */
/* renamed from: iwe  reason: default package */
/* loaded from: classes.dex */
public enum iwe implements ids {
    MATERIALIZER_ITERATOR_NEXT("TC.MI.Next-time"),
    MATERIALIZER_ITERATOR_START("TC.MI.Start-time"),
    NATIVE_MATERIALIZER_JNI_CALL("TC.NM.JNI-time"),
    MAINTENANCE_ALL_DURATION("TC.Maint.All-duration"),
    MAINTENANCE_CLEANUP_DURATION("TC.Maint.Cleanup-duration"),
    PERIODIC_TASK_DURATION("TC.Maint.Periodic-duration");
    
    private final String h;

    iwe(String str) {
        this.h = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.h;
    }
}
