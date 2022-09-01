package defpackage;

/* compiled from: PG */
/* renamed from: dua  reason: default package */
/* loaded from: classes.dex */
public enum dua implements ido {
    NGA_DICTATION_STARTED,
    NGA_DICTATION_STOPPED,
    NGA_ACTION_RECEIVED,
    NGA_VISIBILITY_ACTION_RECEIVED,
    NGA_TEXT_COMMITTED,
    NGA_MIC_BUTTON_TAPPED,
    NGA_STICKY_MIC_BUTTON_TAPPED,
    NGA_MIC_TAP_NOT_HANDLED,
    PUNCTUATION_DELETED_AFTER_NGA_DICTATION,
    PUNCTUATION_AT_END_DELETED_AFTER_NGA_DICTATION,
    PUNCTUATION_EDITED_AFTER_NGA_DICTATION,
    NGA_IS_AVAILABLE,
    NGA_EXPERIMENTS;

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
