package defpackage;

/* compiled from: PG */
/* renamed from: hpc  reason: default package */
/* loaded from: classes.dex */
public enum hpc implements ids {
    ACTIVATE_KEYBOARD_REQUEST_KEYBOARD("ActivateKeyboard.internel-time"),
    ACTIVATE_KEYBOARD_INTERNAL("ActivateKeyboard.requestKeyboard-time");
    
    private final String d;

    hpc(String str) {
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
