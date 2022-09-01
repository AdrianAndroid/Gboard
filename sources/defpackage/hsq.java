package defpackage;

/* compiled from: PG */
/* renamed from: hsq  reason: default package */
/* loaded from: classes.dex */
public enum hsq implements ids {
    IMS_ON_CREATE("IMS.onCreate-time"),
    IMS_ON_CREATE_INPUT_VIEW("IMS.onCreateInputView-time"),
    IMS_PERFORM_USER_UNLOCK("IMS.performUserUnlock-time"),
    IMS_ON_INPUT_METHOD_ENTRY_CHANGED("IMS.onInputMethodEntryChanged-time");
    
    private final String f;
    private final int g = -1;

    hsq(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.g;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
