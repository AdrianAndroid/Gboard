package defpackage;

/* compiled from: PG */
/* renamed from: ezs  reason: default package */
/* loaded from: classes.dex */
public enum ezs implements ids {
    EXT_TRANSLATE_ACTIVATE("TranslateUIExtension.activate-time"),
    EXT_TRANSLATE_KB_ACTIVATE("TranslateUIExtension.activateKB-time"),
    EXT_TRANSLATE_DEACTIVATE("TranslateUIExtension.deactivate-time"),
    QUERY_INTERVAL("Translate.QueryInterval");
    
    private final String f;

    ezs(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
