package defpackage;

/* compiled from: PG */
/* renamed from: idd  reason: default package */
/* loaded from: classes.dex */
public enum idd implements ido {
    UNKNOWN,
    UI_THREAD_VIOLATION,
    METRICS_PROCESSOR_CRASH_INIT,
    METRICS_PROCESSOR_CRASH_ON_ATTACHED,
    METRICS_PROCESSOR_CRASH_PROCESS,
    KEYBOARD_TYPE_EMPTY,
    NATIVE_LIB_LOAD_FAILED,
    NATIVE_LIB_UNZIP_LOAD("NativeLib.UnzipLoad"),
    NATIVE_LIB_RELINKER("NativeLib.Relinker"),
    BACKGROUND_CRASH,
    INVALID_KEYBOARD_DEF_FROM_CACHE,
    INVALID_KEYBOARD_DEF_FROM_XML,
    BEGIN_SESSION,
    END_SESSION,
    SIGNATURE_CHECK_SECURITY_EXCEPTION("GmsCore.SignatureCheckSecurityException"),
    VIEW_NOT_ATTACHED_TO_WINDOW_CRASH,
    INPUT_METHOD_PICKER_SHOWN,
    SWITCH_TO_NEXT_LANGUAGE,
    PERIODIC_TASK_SERVICE_RUN,
    CONFIGURATION_CHANGE;
    
    private final String v;

    idd() {
        this.v = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.v;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    idd(String str) {
        this.v = str;
    }
}
